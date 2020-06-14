package com.vv.vveres.control;
import com.vv.vveres.table.TbSalaryCode;
import com.vv.vveres.table.TbStaffment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//author: phamthecong@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/staffment")
public class ContStaffment {
    @Autowired
    com.vv.vveres.service.SerStaffment serStaffment;

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable) {
        return new ResponseEntity<>(serStaffment.getPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(serStaffment.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam long id) {
        return new ResponseEntity<>(serStaffment.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title) {
        return new ResponseEntity<>(serStaffment.FindByTitle(title), HttpStatus.OK);
    }
    @RequestMapping(value = "/findbytitlepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitlePage(@RequestParam String title,Pageable pageable) {
        return new ResponseEntity<>(serStaffment.FindByTitlePage(title,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyidcard", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByIdCard(@RequestParam String idcard) {
        return new ResponseEntity<>(serStaffment.FindByIdCard(idcard), HttpStatus.OK);
    }
    @RequestMapping(value = "/findbyidcardpage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByIdCardPage(@RequestParam String idcard,Pageable pageable) {
        return new ResponseEntity<>(serStaffment.FindByIdCardPage(idcard,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyaddress", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByAddress(@RequestParam String address) {
        return new ResponseEntity<>(serStaffment.FindByAddress(address), HttpStatus.OK);
    }
    @RequestMapping(value = "/findbyaddresspage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByAddressPage(@RequestParam String address,Pageable pageable) {
        return new ResponseEntity<>(serStaffment.FindByAddressPage(address,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyphone", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPhone(@RequestParam String phone) {
        return new ResponseEntity<>(serStaffment.FindByPhone(phone), HttpStatus.OK);
    }
    @RequestMapping(value = "/findbyphonepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPhonePage(@RequestParam String phone,Pageable pageable) {
        return new ResponseEntity<>(serStaffment.FindByPhonePage(phone,pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbymail", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByMail(@RequestParam String mail) {
        return new ResponseEntity<>(serStaffment.FindByMail(mail), HttpStatus.OK);
    }
    @RequestMapping(value = "/findbymailpage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByMailPage(@RequestParam String mail,Pageable pageable) {
        return new ResponseEntity<>(serStaffment.FindByMailPage(mail,pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbStaffment prInput) {
        return new ResponseEntity<>(serStaffment.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbStaffment Staffment) {
        return new ResponseEntity<>(serStaffment.UpdateSent(Staffment),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbStaffment data = serStaffment.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serStaffment.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delall", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> DelSen() {
        return new ResponseEntity<>(serStaffment.DeleteAll(), HttpStatus.OK);
    }
}

