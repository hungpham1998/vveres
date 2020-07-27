package com.vv.vveres.control;

import com.vv.vveres.dto.DTOProduct;
import com.vv.vveres.table.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//author: phamthecong@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/product")
public class ContProduct {
    @Autowired
    com.vv.vveres.service.SerProduct serProduct;

    @RequestMapping(value = "/getalldtoproduct", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAllDTOProduct(Pageable pageable) {
        return new ResponseEntity<>(serProduct.GetAllDtoProduct(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serProduct.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serProduct.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id) {
        return new ResponseEntity<>(serProduct.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title, Pageable pageable) {
        return new ResponseEntity<>(serProduct.FindByTitlePage(title, pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title) {
        return new ResponseEntity<>(serProduct.FindByTitle(title), HttpStatus.OK);
    }
    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody DTOProduct prInput) {
        if(prInput.getId() == null)
            prInput.setId(0L);
        return new ResponseEntity<>(serProduct.InsSentMany2Many(prInput), HttpStatus.OK);
    }
//    // tranducdang@gmail.com
//    @RequestMapping(value = "/ins", method = RequestMethod.POST)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> insProduct(@RequestBody TbProduct prInput) {
//        return new ResponseEntity<>(serProduct.InsSentMany2Many(prInput), HttpStatus.OK);
//    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbProduct Product) {
        return new ResponseEntity<>(serProduct.UpdateSent(Product),HttpStatus.OK);

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbProduct data = serProduct.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serProduct.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delall", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> DelSen() {
        return new ResponseEntity<>(serProduct.DeleteAll(), HttpStatus.OK);
    }

}
