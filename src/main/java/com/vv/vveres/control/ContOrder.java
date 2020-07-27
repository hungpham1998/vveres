package com.vv.vveres.control;


import com.vv.vveres.dto.DTOOrder;
import com.vv.vveres.dto.DTOOrderDetail;
import com.vv.vveres.table.TbOrder;
import com.vv.vveres.table.TbOrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//author: tranducdang@gmail.com
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/order")
public class ContOrder {
    @Autowired
    com.vv.vveres.service.SerOrder serOrder;

    @Autowired
    com.vv.vveres.service.SerOrderDetail serOrderDetail;

    @Autowired
    com.vv.vveres.mapper.OrderMapper orderMapper;

    @Autowired
    com.vv.vveres.mapper.OrderDetailMapper orderDetailMapper;

    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    public ResponseEntity<?> getAllOrder(Pageable pageable) {
        return new ResponseEntity<>(serOrder.getDTOOrder(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/getOrder2", method = RequestMethod.GET)
    public ResponseEntity<?> getAllOrder2(Pageable pageable) {
        return new ResponseEntity<>(serOrder.getAllOrder(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/getdtoOrderDetail", method = RequestMethod.GET)
    public ResponseEntity<?> getAllDTOOrderDetail(Pageable pageable) {
        List<DTOOrderDetail> dtoOrderDetails =  serOrderDetail.getAllOrderDetail(pageable);
        return new ResponseEntity<>(dtoOrderDetails, HttpStatus.OK);
    }
}
