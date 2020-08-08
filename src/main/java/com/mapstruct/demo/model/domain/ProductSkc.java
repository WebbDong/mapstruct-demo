package com.mapstruct.demo.model.domain;

import lombok.Data;

@Data
public class ProductSkc {

    /**
     * skc编码
     */
    private String skcCode;

    /**
     * 颜色名
     */
    private String colorName;

    /**
     * 颜色编码
     */
    private String colorCode;

}
