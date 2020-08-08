package com.mapstruct.demo.model.mapper;

import com.mapstruct.demo.model.domain.User;
import com.mapstruct.demo.model.dto.UserDto;
import com.mapstruct.demo.model.mapper.typemapper.UserModelDataTypeMapper;
import com.mapstruct.demo.model.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * User模型映射器
 */
@Mapper(uses = UserModelDataTypeMapper.class)
public interface UserModelMapper {

    UserModelMapper INSTANCE = Mappers.getMapper(UserModelMapper.class);

    /**
     * User对象转换成UserDto对象
     * @param user
     * @return
     */
    @Mappings({
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "updateTime", target = "updateTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            // 处理枚举类型的不一致
            @Mapping(source = "gender.value", target = "gender"),
            @Mapping(source = "userType.code", target = "userType"),
    })
    UserDto userToUserDto(User user);

    /**
     * UserDto对象转换成User对象
     * @param userDTO
     * @return
     */
    @Mappings({
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "updateTime", target = "updateTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            // 处理枚举类型的不一致，需要UserModelDataTypeMapper自定义类型转换来实现Integer转换成Enum
            @Mapping(source = "gender", target = "gender"),
            @Mapping(source = "userType", target = "userType"),
    })
    User userDtoToUser(UserDto userDTO);

    /**
     * User对象转换成UserVo对象
     * @param user
     * @return
     */
    @Mappings({
            @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "updateTime", target = "updateTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "gender.desc", target = "gender"),
            @Mapping(source = "userType.name", target = "userType"),
    })
    UserVo userToUserVo(User user);

}
