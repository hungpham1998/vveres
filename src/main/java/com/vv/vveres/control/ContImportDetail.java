package com.vv.vveres.control;


import com.vv.vveres.table.TbImportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// Authen: Hungrost@gamil.com

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/importdetail")

public class ContImportDetail {

    @Autowired
    com.vv.vveres.service.SerImportDetail serImportDetail;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serImportDetail.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serImportDetail.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serImportDetail.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbImportDetail prInput) {
        return new ResponseEntity<>(serImportDetail.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbImportDetail Importdetail) {
            return new ResponseEntity<>(serImportDetail.UpdateSent(Importdetail),HttpStatus.OK);
    }


    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
            serImportDetail.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }


}
