package ru.netology.autorisation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.autorisation.enums.Authorities;
import ru.netology.autorisation.services.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    // ЮРЛ authorize?user=<ИМЯ_ЮЗЕРА>&password=<ПАРОЛЬ_ЮЗЕРА> возвращает разрешения на юзера, либо ошибку
    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

}
