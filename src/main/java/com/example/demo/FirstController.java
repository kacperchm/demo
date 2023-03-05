package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/test")
public class FirstController {

    @GetMapping("/pierwsza")
    public String pierw() {
        return "First endpoint";
    }
    @GetMapping("/druga")
    public String druga() {
        return "Second endpoint";
    }
    @GetMapping("/czesc/{imie}")
    public String czesc(@PathVariable String imie) {
        return "Cześć " + imie;
    }

    @GetMapping("/upper")
    public String upper(@RequestParam String wartosc) {
        return wartosc.toUpperCase();

    }

    @GetMapping("/concat")
    public String concat(@RequestParam String pierwszy, @RequestParam String drugi) {
        return pierwszy + drugi;
    }

    @GetMapping("/najwieskszy")
    public int najwiekszy(@RequestParam List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
        return list.get(0);
    }

    @GetMapping("/auth")
    public String autoryzacja(@RequestHeader("NaszaAutoryzacja") String header) {
        if(header.equals("Secret123")) {
            return "Zalogowany";
        } else {
            return "Niepoprawna autoryzacja";
        }
    }

    @PostMapping("/odwroc")
    public String odwroc(@RequestBody String wartosc) {
        StringBuilder sb = new StringBuilder();
        return sb.append(wartosc)
                .reverse()
                .toString();
    }

    @PostMapping("/user")
    public String user(@RequestBody User user) {
        return user.getName() + " " + user.getSurname();
    }


    public static class User{
        private String name;
        private String surname;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
