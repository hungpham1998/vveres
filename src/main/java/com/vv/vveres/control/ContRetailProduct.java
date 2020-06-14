package com.vv.vveres.control;
import com.vv.vveres.table.TbRetailProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//author: phamthecong@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/retailproduct")
public class ContRetailProduct {
    @Autowired
    com.vv.vveres.service.SerRetailProduct serRetailProduct;

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serRetailProduct.getPage(pageable).getContent(), HttpStatus.OK);
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serRetailProduct.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam long id) {
        return new ResponseEntity<>(serRetailProduct.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyprice", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPrice(@RequestParam String price) {
        return new ResponseEntity<>(serRetailProduct.FindByPrice(price), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbypricepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPricePage(@RequestParam String price,Pageable pageable) {
        return new ResponseEntity<>(serRetailProduct.FindByPricePage(price,pageable).getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbRetailProduct prInput) {
        return new ResponseEntity<>(serRetailProduct.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbRetailProduct RetailProduct) {
        return new ResponseEntity<>(serRetailProduct.UpdateSent(RetailProduct),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbRetailProduct data = serRetailProduct.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serRetailProduct.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delall", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> DelSen() {
        return new ResponseEntity<>(serRetailProduct.DeleteAll(), HttpStatus.OK);
    }
}

