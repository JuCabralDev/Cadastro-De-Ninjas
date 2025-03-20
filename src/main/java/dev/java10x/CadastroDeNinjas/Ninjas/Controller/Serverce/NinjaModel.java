package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Serverce;

import dev.java10x.CadastroDeNinjas.Missoes.missoesNinjasModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma um classe em uma entidade do BD (banco de dados)
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro") //TB vem de tabela
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - um ninja tem uma unica missao!
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private missoesNinjasModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
