package com.mapstruct.demo.model.mapper;

import com.mapstruct.demo.model.domain.Product;
import com.mapstruct.demo.model.vo.ProductVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductModelMapper {

    ProductModelMapper INSTANCE = Mappers.getMapper(ProductModelMapper.class);

    /**
     * do转vo
     * @param product
     * @return
     */
    ProductVo doToVo(Product product);

}
