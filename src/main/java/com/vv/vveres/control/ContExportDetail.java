package com.vv.vveres.control;

import com.vv.vveres.dto.DTOExportDetail;
import com.vv.vveres.table.TbExportDetail;
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
@RequestMapping("api/exportdetail")

public class ContExportDetail {
    @Autowired
    com.vv.vveres.service.SerExportDetail serExportDetail;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serExportDetail.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serExportDetail.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serExportDetail.FindById(id), HttpStatus.OK);
    }
//
//    @RequestMapping(value = "/findbyexpirydate", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> findByExpiryDate(@RequestParam Date  expiryDate)
//    {
//        return new ResponseEntity<>(serExportDetail.FindByExpiryDate(expiryDate), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/findbyexpirydatepage", method = RequestMethod.PUT)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> findByExpiryDatePage(@RequestParam Date expiryDate, Pageable pageable) {
//        return new ResponseEntity<>(serExportDetail.FindByExpiryDatePage(expiryDate,pageable).getContent(), HttpStatus.OK);
//    }

//    @RequestMapping(value = "/findbyexportprice", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> findByExportPrice(@RequestParam double exportPrice)
//    {
//        return new ResponseEntity<>(serExportDetail.FindByExportPrice(exportPrice), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/findbyexportpricepage", method = RequestMethod.PUT)
//    @CrossOrigin(origins = "*", maxAge = 3600)
//    public ResponseEntity<?> findByExportPricePage(@RequestParam double exportPrice, Pageable pageable) {
//        return new ResponseEntity<>(serExportDetail.FindByExportPricePage(exportPrice,pageable).getContent(), HttpStatus.OK);
//    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbExportDetail prInput)
    {
        return new ResponseEntity<>(serExportDetail.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbExportDetail data = serExportDetail.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serExportDetail.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbExportDetail ExportDetail) {
        return new ResponseEntity<>(serExportDetail.UpdateSent(ExportDetail),HttpStatus.OK);

    }

    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> update( @RequestBody DTOExportDetail dtoExportDetail) {
        return new ResponseEntity<>(serExportDetail.update(dtoExportDetail),HttpStatus.OK);

    }

}

