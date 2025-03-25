package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Serverce;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Bem vindo ao cadastro de ninjas";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping ("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninjas por ID (READ)
    @GetMapping ("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping ("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar Ninja por id";
    }
    // Deletar Ninja (DELETE)
    @DeleteMapping ("/deletar")
    public String deletarNinjaPorId() {
        return "Ninja deletado por ID";
    }

}
