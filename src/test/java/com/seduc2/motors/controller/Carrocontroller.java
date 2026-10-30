package com.seduc2.motors.controller;
import com.seduc2.motors.entity.Carro;
import org.springframework.web.bind.annotation.*;
import com.seduc2.motors.service.Carroservice;

import java.util.List;





        @RestController
        @RequestMapping("/api/carros")
        public class Carrocontroller {
            
            private final Carroservice service;

            public Carrocontroller(Carroservice service) {
                this.service = service;
            }

            @GetMapping
            public List<Carro> mostrarCarros() {
                return service.mostrarCarros();
            }

            @PostMapping
            public void criarCarro(@RequestBody Carro c) {
                service.cadastrarCarro(c);
            }
        }


