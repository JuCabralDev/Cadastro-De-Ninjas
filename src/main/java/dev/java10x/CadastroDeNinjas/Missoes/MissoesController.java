package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Mandar uma requicisao para mostrar as missoes
    @GetMapping("/listar")
        public String listarMissoes() {
        return "Missao listada com sucesso";
    }
    // POST -- Mandar uma requicisao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }
    // PUT -- Mandar uma requicisao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }
    // DELETE -- Mandar uma requicisao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

}
