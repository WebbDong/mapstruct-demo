package com.mapstruct.demo.model.mapper.typemapper;

import com.mapstruct.demo.enums.GenderTypeEnum;
import com.mapstruct.demo.enums.UserTypeEnum;

/**
 * User模型数据类型映射
 * 方法名可以随便起
 */
public class UserModelDataTypeMapper {

    /**
     * 将int值转换成UserTypeEnum
     * @param userType
     * @return
     */
    public UserTypeEnum asUserTypeEnum(int userType) {
        for (int i = 0; i < UserTypeEnum.values().length; i++) {
            UserTypeEnum userTypeEnum = UserTypeEnum.values()[i];
            if (userTypeEnum.getCode() == userType) {
                return userTypeEnum;
            }
        }
        return null;
    }

    /**
     * 将int值转换成GenderTypeEnum
     * @param gender
     * @return
     */
    public GenderTypeEnum asGenderTypeEnum(int gender) {
        for (int i = 0; i < GenderTypeEnum.values().length; i++) {
            GenderTypeEnum genderTypeEnum = GenderTypeEnum.values()[i];
            if (genderTypeEnum.getValue() == gender) {
                return genderTypeEnum;
            }
        }
        return null;
    }

}
