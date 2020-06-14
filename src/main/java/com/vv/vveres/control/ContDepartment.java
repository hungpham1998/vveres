package com.vv.vveres.control;

import com.vv.vveres.table.TbDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// author: vutrananh98hn@gmail.com

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/department")

public class ContDepartment

{
    @Autowired
    com.vv.vveres.service.SerDepartment serDepartment;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serDepartment.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serDepartment.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serDepartment.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title)
    {
        return new ResponseEntity<>(serDepartment.FindByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title, Pageable pageable) {
        return new ResponseEntity<>(serDepartment.FindByTitlePage(title,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbDepartment prInput)
    {
        return new ResponseEntity<>(serDepartment.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbDepartment data = serDepartment.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serDepartment.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbDepartment Department) {
        return new ResponseEntity<>(serDepartment.UpdateSent(Department),HttpStatus.OK);

    }
}

