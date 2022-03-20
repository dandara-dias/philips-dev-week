package com.dio_class.devweek.Entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class FaixaEtaria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer faixa_i;
    private Integer faixa_n;
    private String Descricao;

    public FaixaEtaria(Integer faixa_i, Integer faixa_n, String descricao) {
        this.faixa_i = faixa_i;
        this.faixa_n = faixa_n;
        this.Descricao = descricao;
    }

    public FaixaEtaria() {}

    public Long getId() {
        return id;
    }

    public Integer getFaixa_i() {
        return faixa_i;
    }

    public void setFaixa_i(Integer faixa_i) {
        this.faixa_i = faixa_i;
    }

    public Integer getFaixa_n() {
        return faixa_n;
    }

    public void setFaixa_n(Integer faixa_n) {
        this.faixa_n = faixa_n;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }
}
