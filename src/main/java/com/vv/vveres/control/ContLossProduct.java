package com.vv.vveres.control;

import com.vv.vveres.table.TbLossProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


// Authen: Hungrost@gamil.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/lossproduct")
public class ContLossProduct {

    @Autowired
    com.vv.vveres.service.SerLossProduct serLossProduct;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serLossProduct.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serLossProduct.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serLossProduct.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbLossProduct lossProduct) {
        return new ResponseEntity<>(serLossProduct.insSent(lossProduct), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbLossProduct lossProduct) {
        return new ResponseEntity<>(serLossProduct.updateSent(lossProduct),HttpStatus.OK);
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
        serLossProduct.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
