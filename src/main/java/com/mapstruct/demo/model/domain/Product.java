package com.mapstruct.demo.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.money.Money;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Product {

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
