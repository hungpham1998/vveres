package com.vv.vveres.control;

import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//author: phamthecong@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/store")
public class ContStore {
    @Autowired
    com.vv.vveres.service.SerStore serStore;
    @RequestMapping(value = "/getPage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serStore.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serStore.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id) {
        return new ResponseEntity<>(serStore.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title) {
        return new ResponseEntity<>(serStore.FindByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title,Pageable pageable) {
        return new ResponseEntity<>(serStore.FindByTitlePage(title,pageable), HttpStatus.OK);
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbStore prInput) {
        return new ResponseEntity<>(serStore.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbStore Store) {
        return new ResponseEntity<>(serStore.UpdateSent(Store),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbStore data = serStore.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serStore.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delall", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> DelSen() {
        return new ResponseEntity<>(serStore.DeleteAll(), HttpStatus.OK);
    }

}

