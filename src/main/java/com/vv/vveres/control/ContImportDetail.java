package com.vv.vveres.control;


import com.vv.vveres.table.TbImportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/importdetail")

public class ContImportDetail {

    @Autowired
    com.vv.vveres.service.SerImportDetail serImportDetail;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serImportDetail.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@PathVariable("id") Long Id) {
        return new ResponseEntity<>(serImportDetail.GetById(Id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbImportDetail prInput) {
        return new ResponseEntity<>(serImportDetail.InsSent(prInput), HttpStatus.OK);
    }

//    @RequestMapping(value = "/update/{Id}", method = RequestMethod.PUT)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> updateSent(@PathVariable("Id") Long Id, @RequestBody TbImportDetail Importdetail) {
//        TbImportDetail data = serImportDetail.GetById(Id).orElse(null);
//        if (data == null) {
//            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
//        } else {
//            data.
//            return new ResponseEntity<>(serImportDetail.UpdateSent(data),HttpStatus.OK);
//        }
//    }


    @RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@PathVariable("Id")  Long Id) {
        TbImportDetail data = serImportDetail.GetById(Id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serImportDetail.Delete(Id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }


}

