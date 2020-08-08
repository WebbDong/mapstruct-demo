package com.mapstruct.demo.model.dto;

import lombok.Data;

@Data
public class UserDto {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 逻辑删除,1删除、0未删除
     */
    private Integer deleted;

}
