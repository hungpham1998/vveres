package com.vv.vveres.mapper;

import com.vv.vveres.dto.DTOOrder;
import com.vv.vveres.table.TbOrder;
import com.vv.vveres.utils.EntityMapper;
import org.mapstruct.Mapper;
import java.util.List;
// author: tranducdang@gmail.com
@Mapper(componentModel = "spring")
public interface OrderMapper extends EntityMapper<TbOrder, DTOOrder> {
    @Override
    DTOOrder toDto(TbOrder source);

    @Override
    TbOrder toEntity(DTOOrder source);

    @Override
    List<DTOOrder> toDtoList(List<TbOrder> sourceList);

    @Override
    List<TbOrder> toEntityList(List<DTOOrder> sourceList);
}
