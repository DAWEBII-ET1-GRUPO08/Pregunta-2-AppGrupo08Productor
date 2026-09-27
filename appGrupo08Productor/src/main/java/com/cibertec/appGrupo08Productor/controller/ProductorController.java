package com.cibertec.appGrupo08Productor.controller;

import com.cibertec.appGrupo08Productor.service.ProductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductorController {

    @Autowired
    private ProductorService productorService;

    @GetMapping("/api/numeros")
    public String enviarNumeros(@RequestParam("numbers") String numbers) {
        productorService.enviarNumeros(numbers);
        return "Lista enviada a RabbitMQ correctamente";
    }

}
