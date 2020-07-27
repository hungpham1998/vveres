package com.vv.vveres.service;

import com.vv.vveres.dto.DTOProduct;
import com.vv.vveres.mapper.ProductMapper;
import com.vv.vveres.table.TbProduct;
import com.vv.vveres.table.TbUnit;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//author: phamthecong@gmail.com
@Service
public class SerProduct {
    @Autowired
    com.vv.vveres.repo.RepoProduct repoProduct;
    @Autowired
    ProductMapper productMapper;
    public Page<TbProduct> getPage(Pageable pageable) {
        return repoProduct.findAll(pageable);
    }
    public List<TbProduct> GetAll() {
        return repoProduct.findAll();
    }
    public Optional<TbProduct> FindById(Long id) {
        return repoProduct.findById(id);
    }
    public List<TbProduct> FindByTitle(String title) {
        return repoProduct.findByTitle(title);
    }
    public Page<TbProduct> FindByTitlePage(String title, Pageable pageable){
        return  repoProduct.findByTitle(title, pageable);
    }

    public List<DTOProduct> GetAllDtoProduct(Pageable pageable) {
        return productMapper.toDtoList(repoProduct.findAllBy(pageable));
    }

    public TbProduct InsSent(TbProduct input){
        return repoProduct.save(input);
    }
    public DTOProduct InsSentMany2Many(DTOProduct dtoProduct){
        try {
            TbProduct tbProduct = productMapper.toEntity(dtoProduct);
            List<TbUnit> tbUnits = dtoProduct.getUnits();
            for (TbUnit tbUnit : tbUnits) {
                tbProduct.getUnits().add(tbUnit);
                tbUnit.getProducts().add(tbProduct);
            }
            tbProduct = repoProduct.save(tbProduct);
            dtoProduct.setId(tbProduct.getId());
            return dtoProduct;
        }
        catch (Exception ex){
            //LOG
            return null;
        }
    }
//    public void DeleteMany2Many(TbProduct tbProduct, TbUnit tbUnit){
//        tbUnit.getProducts().remove(tbProduct);
//        tbProduct.getUnits().remove(tbUnit);
//        repoProduct.save(tbProduct);
//    }
    public void Delete (Long id){
        repoProduct.deleteById(id);
    }
    public  TbProduct UpdateSent ( TbProduct input) {
        return  repoProduct.save(input);
    }
    public int DeleteAll(){
        try{
            repoProduct.deleteAll();
            return  1;
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
}
