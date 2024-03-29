package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Cidade;

import java.io.Serializable;

public class CidadeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public CidadeDTO() {
    }

    public CidadeDTO(Cidade cidade) {
        setId(cidade.getId());
        setNome(cidade.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
