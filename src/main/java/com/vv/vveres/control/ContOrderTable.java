package com.vv.vveres.control;


import com.vv.vveres.table.TbOrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Authen: Hungrost@gamil.com
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

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serOrderTable.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serOrderTable.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/getbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getByTitle(@RequestParam String Title) {
        return new ResponseEntity<>(serOrderTable.getByTitle(Title), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbOrderTable orderTable) {
        return new ResponseEntity<>(serOrderTable.insSent(orderTable), HttpStatus.OK);
    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbOrderTable orderTable) {
        return new ResponseEntity<>(serOrderTable.updateSent(orderTable),HttpStatus.OK);

    }


    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam  Long id) {
        serOrderTable.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
