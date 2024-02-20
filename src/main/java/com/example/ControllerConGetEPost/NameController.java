package com.example.ControllerConGetEPost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping("name")
    public String name(@RequestParam String name){
        return name;
    }

    @PostMapping("namereverse")
    public String namereverse(@RequestParam String name){
        StringBuilder reversed = new StringBuilder();
        reversed.append(name);
        return reversed.reverse().toString();
    }
}
