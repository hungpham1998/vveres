package com.vv.vveres.control;

import com.vv.vveres.table.TbSalaryCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//author: phamthecong@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/salaryCode")
public class ContSalaryCode {
    @Autowired
    com.vv.vveres.service.SerSalaryCode serSalaryCode;

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serSalaryCode.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serSalaryCode.GetAll(), HttpStatus.OK);
    }


    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam long id) {
        return new ResponseEntity<>(serSalaryCode.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbysalary", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findBySalary(@RequestParam String salary) {
        return new ResponseEntity<>(serSalaryCode.FindBySalary(salary), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbysalarypage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findBySalaryPage(@RequestParam String salary, Pageable pageable) {
        return new ResponseEntity<>(serSalaryCode.FindBySalaryPage(salary, pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbSalaryCode prInput) {
        return new ResponseEntity<>(serSalaryCode.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbSalaryCode SalaryCode) {
        return new ResponseEntity<>(serSalaryCode.UpdateSent(SalaryCode),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbSalaryCode data = serSalaryCode.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serSalaryCode.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delall", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> DelSen() {
        return new ResponseEntity<>(serSalaryCode.DeleteAll(), HttpStatus.OK);
    }
}
