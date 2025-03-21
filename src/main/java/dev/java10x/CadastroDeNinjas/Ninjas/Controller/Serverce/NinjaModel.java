package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Serverce;

import dev.java10x.CadastroDeNinjas.Missoes.missoesNinjasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma um classe em uma entidade do BD (banco de dados)
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro") //TB vem de tabela
@Data // criar os getters e setters
@NoArgsConstructor // criar um construtor vazio
@AllArgsConstructor // criar um construtor cheio
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;
    
    private int idade;

    // @ManyToOne - um ninja tem uma unica missao!
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private missoesNinjasModel missoes;

}
