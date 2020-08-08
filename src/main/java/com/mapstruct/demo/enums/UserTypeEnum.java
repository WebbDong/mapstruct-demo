package com.mapstruct.demo.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {

    CUSTOMER(0, "客户"),
    MERCHANT(1, "商家"),
    ;

    UserTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

    private final int code;

    private final String name;

}
