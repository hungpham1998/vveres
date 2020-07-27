package com.vv.vveres.mapper;

import com.vv.vveres.dto.DTOOrderDetail;
import com.vv.vveres.table.TbOrderDetail;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.utils.EntityMapper;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface OrderDetailMapper extends EntityMapper<TbOrderDetail, DTOOrderDetail> {
    @Override
    DTOOrderDetail toDto(TbOrderDetail source);

    @Override
    TbOrderDetail toEntity(DTOOrderDetail source);

    @Override
    List<DTOOrderDetail> toDtoList(List<TbOrderDetail> sourceList);

    @Override
    List<TbOrderDetail> toEntityList(List<DTOOrderDetail> sourceList);
}
