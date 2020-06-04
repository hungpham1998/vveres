package com.vv.vveres.control;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/restaurant")
public class ContRestaurant {
    @Autowired
    com.vv.vveres.service.SerRestaurant serRestaurant;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> getAll(Pageable pageable) {
        return new ResponseEntity<>(serRestaurant.GetAll(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findById(@RequestParam long id) {
        return new ResponseEntity<>(serRestaurant.FindById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbytitle", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByTitle(@RequestParam String title) {
        return new ResponseEntity<>(serRestaurant.FindByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/findbyphoneNumber", method = RequestMethod.PUT)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> findByPhoneNumber(@RequestParam String phoneNumber) {
        return new ResponseEntity<>(serRestaurant.FindByPhoneNumber( phoneNumber), HttpStatus.OK);
    }





    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> insSent(@RequestBody TbRestaurant prInput) {
        return new ResponseEntity<>(serRestaurant.InsSent(prInput), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> updateSent( @RequestBody TbRestaurant Restaurant) {
        return new ResponseEntity<>(serRestaurant.UpdateSent(Restaurant),HttpStatus.OK);

    }


    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<?> deleteSent(@RequestParam Long id) {
        TbRestaurant data = serRestaurant.FindById(id).orElse(null);
        if (data == null) {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } else {
            serRestaurant.Delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
