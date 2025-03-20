package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Serverce.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class missoesNinjasModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long ID;
        private String nome;
        private String dificuldade;

        // @OneToMany - uma missao pode ter varios ninjas
        @OneToMany(mappedBy = "missoes")
        private List<NinjaModel> ninja;
}
