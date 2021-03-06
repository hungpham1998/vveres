package com.vv.vveres.control;


import com.vv.vveres.table.TbInEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Authen: Hungrost@gamil.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/inex")
public class ContInEx {
    @Autowired
    com.vv.vveres.service.SerInEx serInEx;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serInEx.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serInEx.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByTitle(@RequestParam String Title) {
        return new ResponseEntity<>(serInEx.getByTitle(Title), HttpStatus.OK);
    }

        @RequestMapping(value = "/getbyinex", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByInEx(@RequestParam String InEx) {
        return new ResponseEntity<>(serInEx.getByInEx(InEx), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serInEx.getById(id), HttpStatus.OK);
    }


    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbInEx inex) {
        return new ResponseEntity<>(serInEx.insSent(inex), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbInEx inex) {
        return new ResponseEntity<>(serInEx.updateSent(inex),HttpStatus.OK);
    }


    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
        serInEx.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
