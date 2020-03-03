package ru.url.cutter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/{key}")
public class RedirectController {

    private static final String HEADER_NAME = "Location";

    @RequestMapping()
    public void redirect(@PathVariable("key") String key, HttpServletResponse response) {
        if (key.equals("app")) {
            response.setHeader(HEADER_NAME, "https://www.kinopoisk.ru");
            response.setStatus(302);
        } else {
            response.setStatus(404);
        }
    }
}
