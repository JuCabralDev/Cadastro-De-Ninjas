package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Serverce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Bem vindo ao cadastro de ninjas";
    }

}
