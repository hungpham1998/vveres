package com.vv.vveres.control;


import com.vv.vveres.table.TbImportExportSepcial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// Authen: Hungrost@gamil.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/importexportspecial")
public class ContImportExportSpecial {

    @Autowired
    com.vv.vveres.service.SerImportExportSpecial serImportExportSpecial;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serImportExportSpecial.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serImportExportSpecial.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serImportExportSpecial.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbImportExportSepcial importExportSepcial) {
        return new ResponseEntity<>(serImportExportSpecial.insSent(importExportSepcial), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbImportExportSepcial importExportSepcial) {
        return new ResponseEntity<>(serImportExportSpecial.updateSent(importExportSepcial),HttpStatus.OK);
    }


    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
        serImportExportSpecial.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
