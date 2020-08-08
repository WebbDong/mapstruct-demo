package com.mapstruct.demo.test;

import com.mapstruct.demo.enums.GenderTypeEnum;
import com.mapstruct.demo.enums.UserTypeEnum;
import com.mapstruct.demo.model.domain.User;
import com.mapstruct.demo.model.dto.UserDto;
import com.mapstruct.demo.model.mapper.UserModelMapper;
import com.mapstruct.demo.model.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserModelMapperTest {

    @Test
    public void testUserToUserDTO() {
        User user = new User();
        user.setId(1L);
        user.setUserName("name1");
        user.setGender(GenderTypeEnum.SECRETIVE);
        user.setUserType(UserTypeEnum.MERCHANT);
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setDeleted(0);
        UserDto userDTO = UserModelMapper.INSTANCE.userToUserDto(user);
        log.info("{}", userDTO);
    }

    @Test
    public void testUserDTO2User() {
        UserDto userDTO = new UserDto();
        userDTO.setId(1L);
        userDTO.setUserName("name1");
        userDTO.setGender(GenderTypeEnum.SECRETIVE.getValue());
        userDTO.setUserType(UserTypeEnum.MERCHANT.getCode());
        userDTO.setCreateTime("2020-08-07 15:34:56");
        userDTO.setUpdateTime("2020-08-08 20:56:20");
        userDTO.setDeleted(0);
        User user = UserModelMapper.INSTANCE.userDtoToUser(userDTO);
        log.info("{}", user);
    }

    @Test
    public void testUserToUserVo() {
        User user = new User();
        user.setId(1L);
        user.setUserName("name1");
        user.setGender(GenderTypeEnum.SECRETIVE);
        user.setUserType(UserTypeEnum.MERCHANT);
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setDeleted(0);
        UserVo userVo = UserModelMapper.INSTANCE.userToUserVo(user);
        log.info("{}", userVo);
    }

}
