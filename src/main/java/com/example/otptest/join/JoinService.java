package com.example.otptest.join;

import com.example.otptest.join.model.JoinUserDto;
import com.example.otptest.utils.CommonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class JoinService {
    private final JoinMapper mapper;
    private final CommonUtils commonUtilsl;

    public int joinUser(JoinUserDto dto){
        String npw = commonUtilsl.encodeSha256(dto.getUpw());
        dto.setUpw(npw);

        return mapper.joinUser(dto);
    }

//    public void loginUser(){
//
//        mapper.loginUser();
//    }
}
