package com.vv.vveres.mapper;

import com.vv.vveres.dto.DTOExportInvoice;
import com.vv.vveres.dto.DTOProduct;
import com.vv.vveres.table.TbExportInvoice;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.utils.EntityMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExportInvoiceMapper extends EntityMapper<TbExportInvoice, DTOExportInvoice> {
    @Override
    DTOExportInvoice toDto(TbExportInvoice source);

    @Override
    TbExportInvoice toEntity(DTOExportInvoice source);

    @Override
    List<DTOExportInvoice> toDtoList(List<TbExportInvoice> sourceList);

    @Override
    List<TbExportInvoice> toEntityList(List<DTOExportInvoice> sourceList);
}
