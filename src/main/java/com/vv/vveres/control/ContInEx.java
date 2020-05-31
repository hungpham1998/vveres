package com.vv.vveres.control;


import com.vv.vveres.table.TbInEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


//    @RequestMapping(value = "/getbytitle", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> getByTitle(@RequestParam String title) {
//        return new ResponseEntity<>(serInEx.getByTitle(title), HttpStatus.OK);
//    }

//        @RequestMapping(value = "/getbyinex", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> getById(@RequestParam String InEx) {
//        return new ResponseEntity<>(serInEx.getByInEx(InEx), HttpStatus.OK);
//    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long Id) {
        return new ResponseEntity<>(serInEx.getById(Id), HttpStatus.OK);
    }




    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbInEx inex) {
        return new ResponseEntity<>(serInEx.insSent(inex), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbInEx inex) {
        return new ResponseEntity<>(serInEx.updateSent(inex),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long Id) {
        serInEx.delete(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
