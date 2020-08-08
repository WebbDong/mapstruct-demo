package com.mapstruct.demo.model.domain;

import com.mapstruct.demo.enums.GenderTypeEnum;
import com.mapstruct.demo.enums.UserTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 性别
     */
    private GenderTypeEnum gender;

    /**
     * 用户类型
     */
    private UserTypeEnum userType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 逻辑删除,1删除、0未删除
     */
    private Integer deleted;

}
