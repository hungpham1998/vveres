package com.vv.vveres.control;

import com.vv.vveres.table.TbPreparationDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/preparationdetail")
public class ContPreparationDetail {
    @Autowired
    com.vv.vveres.service.SerPreparationDetail serPreparationDetail;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serPreparationDetail.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long Id) {
        return new ResponseEntity<>(serPreparationDetail.getById(Id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbPreparationDetail preparationDetail) {
        return new ResponseEntity<>(serPreparationDetail.insSent(preparationDetail), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbPreparationDetail preparationDetail) {
        return new ResponseEntity<>(serPreparationDetail.updateSent(preparationDetail),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long Id) {
        serPreparationDetail.delete(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
