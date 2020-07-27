package com.vv.vveres.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vv.vveres.dto.DTOOrder;
import com.vv.vveres.dto.DTOOrderDetail;
import com.vv.vveres.mapper.OrderMapper;
import com.vv.vveres.repo.RepoOrder;
import com.vv.vveres.table.TbOrder;
import com.vv.vveres.table.TbOrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// author: tranducdang@gmail.com
@Service
public class SerOrder {
    @Autowired
    RepoOrder repoOrder;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    SerOrderDetail serOrderDetail;
    public List<TbOrder> getAllOrder(Pageable pageable) {
        return repoOrder.findAllBy(pageable);
    }

    public List<DTOOrder> getDTOOrder(Pageable pageable) {
        List<TbOrder> tbOrders = repoOrder.findAllBy(pageable);
        List<DTOOrder> dtoOrders = new ArrayList<>();
        for (TbOrder tbOrder : tbOrders){
            DTOOrder dtoOrder = orderMapper.toDto(tbOrder);
            dtoOrder.setDtoOrderDetails(new ArrayList<>(serOrderDetail.getAllOrderDetailByOrderID(tbOrder)));
            dtoOrders.add(dtoOrder);
        }
        return dtoOrders;
    }
}
