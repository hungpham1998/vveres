package com.vv.vveres.control;

import com.vv.vveres.table.TbExportInvoice;
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
@RequestMapping("api/exportinvoice")

public class ContExportInvoice {
    @Autowired
    com.vv.vveres.service.SerExportInvoice serExportInvoice;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serExportInvoice.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serExportInvoice.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serExportInvoice.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbycode", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByCode(@RequestParam String code)
    {
        return new ResponseEntity<>(serExportInvoice.FindByCode(code), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbycodepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByCodePage(@RequestParam String code, Pageable pageable) {
        return new ResponseEntity<>(serExportInvoice.FindByCodePage(code,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyinvoicename", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByInvoiceName(@RequestParam String invoiceName)
    {
        return new ResponseEntity<>(serExportInvoice.FindByInvoiceName(invoiceName), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyinvoicenamepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByInvoicenamePage(@RequestParam String invoiceName, Pageable pageable) {
        return new ResponseEntity<>(serExportInvoice.FindByInvoiceNamePage(invoiceName,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyinvoicedate", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByInvoiceDate(@RequestParam Date invoiceDate)
    {
        return new ResponseEntity<>(serExportInvoice.FindByInvoiceDate(invoiceDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyinvoicedatepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByInvoiceDatePage(@RequestParam Date invoiceDate, Pageable pageable) {
        return new ResponseEntity<>(serExportInvoice.FindByInvoiceDatePage(invoiceDate,pageable).getContent(), HttpStatus.OK);

    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbExportInvoice prInput)
    {
        return new ResponseEntity<>(serExportInvoice.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbExportInvoice data = serExportInvoice.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serExportInvoice.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbExportInvoice ExportInvoice) {
        return new ResponseEntity<>(serExportInvoice.UpdateSent(ExportInvoice),HttpStatus.OK);

    }

}
