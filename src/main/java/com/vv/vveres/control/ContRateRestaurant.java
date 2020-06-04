package com.vv.vveres.control;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRateRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/rateRestaurant")
public class ContRateRestaurant {
    @Autowired
    com.vv.vveres.service.SerRateRestaurant serRateRestaurant;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll(Pageable pageable) {
        return new ResponseEntity<>(serRateRestaurant.GetAll(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam long id) {
        return new ResponseEntity<>(serRateRestaurant.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbRateRestaurant prInput) {
        return new ResponseEntity<>(serRateRestaurant.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent(@RequestBody TbRateRestaurant RateRestaurant) {
        return new ResponseEntity<>(serRateRestaurant.UpdateSent(RateRestaurant), HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbRateRestaurant data = serRateRestaurant.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            serRateRestaurant.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
