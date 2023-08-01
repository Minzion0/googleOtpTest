package com.example.otptest.login;

import com.example.otptest.otp.OtpServlet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        // 사용자 인증 로직을 여기에 추가 (DB 연동, 비밀번호 검증 등)

        if (isValidUser(username, password)) {
            return ResponseEntity.ok(Map.of("success", true));
        } else {
            return ResponseEntity.ok(Map.of("success", false));
        }
    }

    private boolean isValidUser(String username, String password) {
        // 예제를 위해 하드코딩으로 사용자 인증을 처리합니다.
        // 실제로는 DB 연동 및 비밀번호 검증 로직을 구현해야 합니다.

        return "testuser".equals(username) && "testpassword".equals(password);
    }

}

