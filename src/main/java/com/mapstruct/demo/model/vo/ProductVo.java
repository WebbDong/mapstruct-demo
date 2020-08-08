package com.mapstruct.demo.model.vo;

import com.mapstruct.demo.model.domain.ProductSkc;
import lombok.Data;
import org.joda.money.Money;

@Data
public class ProductVo {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品价格,单位分
     */
    private Money price;

    private ProductSkc productSkc;

}
