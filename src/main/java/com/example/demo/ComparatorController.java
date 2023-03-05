package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compare")
public class ComparatorController {

    @GetMapping
    public String compare(@RequestParam String left, @RequestParam String right, @RequestHeader("COMPARE_MODE") String mode) {
        if(mode.equals("ASC")) {
            return helper(left, right);
        } else if(mode.equals("DESC")) {
            return helper(right,left);
        }

        return "Wrong mode type";
    }

    public String helper(String left, String right) {
        int result = left.compareToIgnoreCase(right);
        return result<0 ? "LEFT" : (result == 0? "EQUAL": "RIGHT");
    }
}
