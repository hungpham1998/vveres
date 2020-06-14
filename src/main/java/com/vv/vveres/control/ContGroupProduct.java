package com.vv.vveres.control;

import com.vv.vveres.table.TbGroupProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// author: vutrananh98hn@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/groupproduct")

public class ContGroupProduct {

    @Autowired
    com.vv.vveres.service.SerGroupProduct serGroupProduct;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serGroupProduct.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serGroupProduct.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serGroupProduct.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbycode", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByCode(@RequestParam String code)
    {
        return new ResponseEntity<>(serGroupProduct.FindByCode(code), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbycodepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByCodePage(@RequestParam String code, Pageable pageable) {
        return new ResponseEntity<>(serGroupProduct.FindByCodePage(code,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title)
    {
        return new ResponseEntity<>(serGroupProduct.FindByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title, Pageable pageable) {
        return new ResponseEntity<>(serGroupProduct.FindByCodePage(title,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbGroupProduct prInput)
    {
        return new ResponseEntity<>(serGroupProduct.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbGroupProduct data = serGroupProduct.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serGroupProduct.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbGroupProduct GroupProduct) {
        return new ResponseEntity<>(serGroupProduct.UpdateSent(GroupProduct),HttpStatus.OK);

    }
}
