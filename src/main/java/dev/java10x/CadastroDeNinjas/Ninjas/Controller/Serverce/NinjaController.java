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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping ("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninjas por ID (READ)
    @GetMapping ("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjasPorid(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping ("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar Ninja por id";
    }
    // Deletar Ninja (DELETE)
    @DeleteMapping ("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaporID(id);
    }

}
