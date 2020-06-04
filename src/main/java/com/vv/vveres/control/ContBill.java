package com.vv.vveres.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/demo")

public class ContBill
{
    @Autowired
    com.vv.vveres.service.SerBill serBill;

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getSen(@RequestParam String title) {
        return new ResponseEntity<>(serBill.FindByTitle(title), HttpStatus.OK);
    }
}
