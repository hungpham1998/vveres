package com.vv.vveres.control;

import com.vv.vveres.table.TbDiscountProduct;
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
@RequestMapping("api/discountproduct")

public class ContDiscountProduct {

    @Autowired
    com.vv.vveres.service.SerDiscountProduct serDiscountProduct;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(serDiscountProduct.GetAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getpage", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getPage(Pageable pageable)
    {
        return new ResponseEntity<>(serDiscountProduct.GetPage(pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam Long id)
    {
        return new ResponseEntity<>(serDiscountProduct.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbystartdate", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByStartdate(@RequestParam Date startDate)
    {
        return new ResponseEntity<>(serDiscountProduct.FindByStartDate(startDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbystartdatepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByStartdatePage(@RequestParam Date startdate, Pageable pageable) {
        return new ResponseEntity<>(serDiscountProduct.FindByStartDatePage(startdate,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyduadate", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByDuaDate(@RequestParam Date duaDate)
    {
        return new ResponseEntity<>(serDiscountProduct.FindByDuaDate(duaDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyduadatepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByDuaDatePage(@RequestParam Date duaDate, Pageable pageable) {
        return new ResponseEntity<>(serDiscountProduct.FindByDuadatePage(duaDate,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyprice", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPrice(@RequestParam double price)
    {
        return new ResponseEntity<>(serDiscountProduct.FindByPrice(price), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbypricepage", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPricePage(@RequestParam double price, Pageable pageable) {
        return new ResponseEntity<>(serDiscountProduct.FindByPricePage(price,pageable).getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ins", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbDiscountProduct prInput)
    {
        return new ResponseEntity<>(serDiscountProduct.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id)
    {
        TbDiscountProduct data = serDiscountProduct.FindById(id).orElse(null);
        if (data == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        else
        {
            serDiscountProduct.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbDiscountProduct DiscountProduct) {
        return new ResponseEntity<>(serDiscountProduct.UpdateSent(DiscountProduct),HttpStatus.OK);

    }
}
