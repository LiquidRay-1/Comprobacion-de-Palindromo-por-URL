package com.example.ejerciciodiecinueve.Controller;


import com.example.ejerciciodiecinueve.Service.PalindromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindromo")
public class PalindromoController {

    private final PalindromoService palindromoService;

    @Autowired
    public PalindromoController(PalindromoService palindromoService) {
        this.palindromoService = palindromoService;
    }

    @GetMapping("/{palabra}")
    public String verificarPalindromo(@PathVariable String palabra) {
        String resultado = palindromoService.verificarPalindromo(palabra);
        return "{\"result\":\"" + resultado + "\"}";
    }
}
