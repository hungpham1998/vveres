package com.vv.vveres.mapper;

import com.vv.vveres.dto.DTOExportDetail;
import com.vv.vveres.table.TbExportDetail;
import org.mapstruct.Mapper;
import com.vv.vveres.utils.EntityMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExportDetailMapper extends EntityMapper<TbExportDetail, DTOExportDetail> {
    @Override
    DTOExportDetail toDto(TbExportDetail source);

    @Override
    TbExportDetail toEntity(DTOExportDetail source);

    @Override
    List<DTOExportDetail> toDtoList(List<TbExportDetail> sourceList);

    @Override
    List<TbExportDetail> toEntityList(List<DTOExportDetail> sourceList);
}
