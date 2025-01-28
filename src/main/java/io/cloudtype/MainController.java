package io.cloudtype.Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index"; // templates/index.html을 렌더링
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // 회원가입 페이지 (추가 필요)
    }

    @GetMapping("/find-id")
    public String findIdPage() {
        return "find-id"; // ID 찾기 페이지 (추가 필요)
    }

    @GetMapping("/find-password")
    public String findPasswordPage() {
        return "find-password"; // PW 찾기 페이지 (추가 필요)
    }
}
