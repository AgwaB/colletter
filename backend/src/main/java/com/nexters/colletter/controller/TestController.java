package com.nexters.colletter.controller;

import com.nexters.colletter.domain.model.User;
import com.nexters.colletter.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db")
public class TestController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public String addUser() {
        User user = userRepository.save(User.builder()
                .email("leesd556@gmail.com")
                .name("KIM")
                .sex(true)
                .image(null)
                .theme(true)
                .access_token(null)
                .refresh_token(null)
                .build());

        return String.valueOf(user.getId());
    }

    @GetMapping("/user")
    public String getUser(@RequestParam("id") long id) {
        User user = userRepository.findById(id).get();
        return user.getName();
    }
}
