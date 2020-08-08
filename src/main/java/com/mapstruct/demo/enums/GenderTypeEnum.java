package com.mapstruct.demo.enums;

import lombok.Getter;

@Getter
public enum GenderTypeEnum {

    SECRETIVE(0, "保密"),
    MALE(1, "男"),
    FEMALE(2, "女"),
    ;

    GenderTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private int value;

    private String desc;

}
