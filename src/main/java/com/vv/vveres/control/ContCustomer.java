package com.vv.vveres.control;
import com.vv.vveres.table.TbCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

// author: vutrananh98hn@gmail.com

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/customer")

public class ContCustomer
{
    @Autowired
    com.vv.vveres.service.SerCustomer serCustomer;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serCustomer.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serCustomer.GetPage(pageable).getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serCustomer.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title)
    {
        return new ResponseEntity<>(serCustomer.FindByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title, Pageable pageable) {
        return new ResponseEntity<>(serCustomer.FindByTitlePage(title,pageable).getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/findbyaddress", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByAddress(@RequestParam String address)
    {
        return new ResponseEntity<>(serCustomer.FindByAddress(address), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyaddresspage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByAddressPage(@RequestParam String address, Pageable pageable) {
        return new ResponseEntity<>(serCustomer.FindByAddressPage(address,pageable).getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/findbyphone", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPhone(@RequestParam String phone)
    {
        return new ResponseEntity<>(serCustomer.FindByPhone(phone), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyphonepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPhonePage(@RequestParam String phone, Pageable pageable) {
        return new ResponseEntity<>(serCustomer.FindByPhonePage(phone,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbybirthday", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByBirthday(@RequestParam Date birthday)
    {
        return new ResponseEntity<>(serCustomer.FindByBirthday(birthday), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbybirthdaypage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByBirthdayPage(@RequestParam Date birthday, Pageable pageable) {
        return new ResponseEntity<>(serCustomer.FindByBirthdayPage(birthday,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbCustomer prInput)
    {
        return new ResponseEntity<>(serCustomer.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbCustomer data = serCustomer.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serCustomer.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbCustomer Customer) {
        return new ResponseEntity<>(serCustomer.UpdateSent(Customer),HttpStatus.OK);

    }

}

