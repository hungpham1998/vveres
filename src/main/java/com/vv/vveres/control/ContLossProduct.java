package com.vv.vveres.control;

import com.vv.vveres.table.TbLossProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long Id) {
        return new ResponseEntity<>(serLossProduct.getById(Id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbLossProduct lossProduct) {
        return new ResponseEntity<>(serLossProduct.insSent(lossProduct), HttpStatus.OK);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbLossProduct lossProduct) {
        return new ResponseEntity<>(serLossProduct.updateSent(lossProduct),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long Id) {
        serLossProduct.delete(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
