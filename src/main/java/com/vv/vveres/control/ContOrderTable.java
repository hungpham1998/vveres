package com.vv.vveres.control;


import com.vv.vveres.table.TbOrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/ordertable")
public class ContOrderTable {
    @Autowired
    com.vv.vveres.service.SerOrderTable serOrderTable;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serOrderTable.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long Id) {
        return new ResponseEntity<>(serOrderTable.getById(Id), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByTitle(@RequestParam String Title) {
        return new ResponseEntity<>(serOrderTable.getByTitle(Title), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbOrderTable orderTable) {
        return new ResponseEntity<>(serOrderTable.insSent(orderTable), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbOrderTable orderTable) {
        return new ResponseEntity<>(serOrderTable.updateSent(orderTable),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long Id) {
        serOrderTable.delete(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
