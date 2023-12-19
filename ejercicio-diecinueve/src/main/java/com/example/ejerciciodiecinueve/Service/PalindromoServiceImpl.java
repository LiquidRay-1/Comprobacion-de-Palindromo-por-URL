package com.example.ejerciciodiecinueve.Service;

import org.springframework.stereotype.Service;

@Service
public class PalindromoServiceImpl implements PalindromoService {

    @Override
    public String verificarPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("[^a-z]", "");
        String reverso = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(reverso)) {
            return "es palíndromo";
        } else {
            return "no es palíndromo";
        }
    }
}
