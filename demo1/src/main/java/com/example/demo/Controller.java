package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    Service service = new Service();

    @GetMapping("/marcas")
    public String consultarMarcas() {
        return service.consultarMarcas();
    }

    @GetMapping("/modelos/{marcas")
    public String consultarModelos(@PathVariable int marca) {
        return service.consultarModelo(marca);
    }

    @GetMapping("/anos/{marca}/{modelo}")
    public String consultarModelos(@PathVariable int marca, @PathVariable int modelo) {
        return service.consultarModelos(marca);
    }

    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano);{
        return service.consultarValor(marca, modelo, ano);

        }

}

