package com.vv.vveres.mapper;

import com.vv.vveres.dto.DTOProduct;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbRestaurant;
import com.vv.vveres.table.TbUnit;
import com.vv.vveres.utils.EntityMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<TbProduct,DTOProduct> {
    @Override
    DTOProduct toDto(TbProduct source);

    @Override
    TbProduct toEntity(DTOProduct source);

    @Override
    List<DTOProduct> toDtoList(List<TbProduct> sourceList);

    @Override
    List<TbProduct> toEntityList(List<DTOProduct> sourceList);
}
