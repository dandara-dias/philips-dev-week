package com.dio_class.devweek.Entity;
import javax.persistence.*;

@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regiao;
    private Integer qnt_exames;

    public Regiao(Long id, String regiao, Integer total) {
        this.regiao = regiao;
        this.qnt_exames = total;
    }

    public Regiao() {}

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getQnt_exames() {
        return qnt_exames;
    }

    public void setQnt_exames(Integer qnt_exames) {
        this.qnt_exames = qnt_exames;
    }
}
