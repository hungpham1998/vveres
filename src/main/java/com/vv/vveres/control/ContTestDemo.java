package com.vv.vveres.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/test")

public class ContTestDemo
{
    @Autowired
    com.vv.vveres.service.SerTestDemo serTestDemo;

    // Find by Title

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getSen(@RequestParam String title)
    {
        return new ResponseEntity<>(serTestDemo.FindByTitle(title), HttpStatus.OK);
    }

    //Get All- Find All

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serTestDemo.GetAll(), HttpStatus.OK);
    }

    // Find by id

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return new ResponseEntity<>(serTestDemo.GetById(id), HttpStatus.OK);
    }

    //

}
