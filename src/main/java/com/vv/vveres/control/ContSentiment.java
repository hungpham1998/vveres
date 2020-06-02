package com.vv.vveres.control;

import com.vv.vveres.table.TbSentiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/evn/demo")
public class ContSentiment {
    @Autowired
    com.vv.vveres.service.SerSentiment serSentiment;


    @RequestMapping(value = "/findbyname", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getSen(@RequestParam String prInput) {
        return new ResponseEntity<>(serSentiment.FindByNameFile(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbSentiment prInput) {
        return new ResponseEntity<>(serSentiment.InsSent(prInput), HttpStatus.OK);
    }
}
