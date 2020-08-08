package com.mapstruct.demo.model.vo;

import lombok.Data;

@Data
public class UserVo {

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
    private String gender;

    /**
     * 用户类型
     */
    private String userType;

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
