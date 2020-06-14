package com.vv.vveres.control;

import com.vv.vveres.table.TbImportInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serImportInvoice.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findcode", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByCode(@RequestParam String code) {
        return new ResponseEntity<>(serImportInvoice.getByCode(code), HttpStatus.OK);
    }

    @RequestMapping(value = "/findcodepage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getCodePage(@RequestParam String code, Pageable pageable) {
        return new ResponseEntity<>(serImportInvoice.getCodePage(code,pageable).getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/findinvoicename", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByInvoiceName(@RequestParam String invoiceName) {
        return new ResponseEntity<>(serImportInvoice.getByInvoiceName(invoiceName), HttpStatus.OK);
    }

    @RequestMapping(value = "/findinvoicenamepage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getInvoiceNamePage(@RequestParam String invoiceName, Pageable pageable) {
        return new ResponseEntity<>(serImportInvoice.getInvoiceNameCode(invoiceName,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serImportInvoice.getById(id), HttpStatus.OK);
    }



    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbImportInvoice invoice) {
        return new ResponseEntity<>(serImportInvoice.insSent(invoice), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbImportInvoice Invoice) {
        return new ResponseEntity<>(serImportInvoice.updateSent(Invoice), HttpStatus.OK);
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
        serImportInvoice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
