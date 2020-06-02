package com.vv.vveres.control;

import com.vv.vveres.table.TbImportInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/importinvoice")

public class ContImportInvoice {
    @Autowired
    com.vv.vveres.service.SerImportInvoice serImportInvoice;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serImportInvoice.getAll(), HttpStatus.OK);
    }


    @RequestMapping(value = "/getbyinvoicename", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByInvoiceName(@RequestParam String invoiceName) {
        return new ResponseEntity<>(serImportInvoice.getByInvoiceName(invoiceName), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long Id) {
        return new ResponseEntity<>(serImportInvoice.getById(Id), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbycode", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByCode(@RequestParam String Code) {
        return new ResponseEntity<>(serImportInvoice.getByCode(Code), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbImportInvoice Invoice) {
        return new ResponseEntity<>(serImportInvoice.insSent(Invoice), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbImportInvoice Invoice) {
        return new ResponseEntity<>(serImportInvoice.updateSent(Invoice), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long Id) {
        serImportInvoice.delete(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
