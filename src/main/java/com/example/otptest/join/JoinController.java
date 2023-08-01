package com.example.otptest.join;

import com.example.otptest.join.model.JoinUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController

public class JoinController {
    public final JoinService service;

    @PostMapping("/join")
    public int joinUser(@RequestBody JoinUserDto dto){
      return   service.joinUser(dto);
    }




}
