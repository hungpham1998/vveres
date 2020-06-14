package com.vv.vveres.control;

import com.vv.vveres.table.TbDetailBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// author: vutrananh98hn@gmail.com

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/detailbill")

public class ContDetailBill

{
    @Autowired
    com.vv.vveres.service.SerDetailBill serDetailBill;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serDetailBill.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serDetailBill.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serDetailBill.FindById(id), HttpStatus.OK);
    }


    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbDetailBill prInput)
    {
        return new ResponseEntity<>(serDetailBill.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbDetailBill data = serDetailBill.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serDetailBill.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbDetailBill DetailBill) {
        return new ResponseEntity<>(serDetailBill.UpdateSent(DetailBill),HttpStatus.OK);

    }
}

