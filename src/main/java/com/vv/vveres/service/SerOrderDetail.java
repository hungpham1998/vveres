package com.vv.vveres.service;

import com.vv.vveres.dto.DTOOrderDetail;
import com.vv.vveres.mapper.OrderDetailMapper;
import com.vv.vveres.mapper.OrderMapper;
import com.vv.vveres.repo.RepoOrder;
import com.vv.vveres.repo.RepoOrderDetail;
import com.vv.vveres.table.TbOrder;
import com.vv.vveres.table.TbOrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// author: tranducdang@gmail.com
@Service
public class SerOrderDetail {
    @Autowired
    RepoOrderDetail repoOrderDetail;
    @Autowired
    OrderDetailMapper orderDetailMapper;
    public List<DTOOrderDetail> getAllOrderDetail(Pageable pageable) {
        List<TbOrderDetail> orderDetails = repoOrderDetail.findAllBy(pageable);
        List<DTOOrderDetail> dtoOrderDetails =new ArrayList<>();
        for (TbOrderDetail tbOrderDetail : orderDetails){
            DTOOrderDetail dtoOrderDetail = orderDetailMapper.toDto(tbOrderDetail);
            dtoOrderDetail.setTbProductTitle(tbOrderDetail.getTbProduct().getTitle());
            dtoOrderDetail.setTbProductId(tbOrderDetail.getTbProduct().getId());
            dtoOrderDetails.add(dtoOrderDetail);
        }
        return dtoOrderDetails;
    }
    public List<DTOOrderDetail> getAllOrderDetailByOrderID(TbOrder tbOrder) {
        List<TbOrderDetail> orderDetails = repoOrderDetail.findAllByTbOrder(tbOrder);
        List<DTOOrderDetail> dtoOrderDetails = new ArrayList<>();
        for (TbOrderDetail tbOrderDetail : orderDetails){
            DTOOrderDetail dtoOrderDetail = orderDetailMapper.toDto(tbOrderDetail);
            dtoOrderDetail.setTbProductTitle(tbOrderDetail.getTbProduct().getTitle());
            dtoOrderDetail.setTbProductId(tbOrderDetail.getTbProduct().getId());
            dtoOrderDetails.add(dtoOrderDetail);
        }
        return dtoOrderDetails;
    }
    public List<DTOOrderDetail> getAllDTOOrderDetail(Pageable pageable){
        return orderDetailMapper.toDtoList(repoOrderDetail.findAllBy(pageable));
    }
}
