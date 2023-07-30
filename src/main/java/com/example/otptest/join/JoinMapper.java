package com.example.otptest.join;

import com.example.otptest.join.model.JoinUserDto;
import com.example.otptest.join.model.LoginUserRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

    int joinUser(JoinUserDto dto);
    LoginUserRes loginUser(String uid);
}
