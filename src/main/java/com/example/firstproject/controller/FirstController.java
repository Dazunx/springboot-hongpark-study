package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")  // URL 요청
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "hongpark"); // 모델 객체를 가져와서 모델 변수를 등록한다.
        return "greetings"; // greetings로 이름지어진 mustach 파일 찾아서 전송함.
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}
