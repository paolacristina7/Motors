package com.seduc2.motors.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity

public class Carro {


    public Carro( long id, LocalDate dataCadastro, LocalDate dataVenda, String marca, String modelo, String versao, String cor, Integer quilometragem) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.dataVenda = dataVenda;
        this.marca = marca;
        this.modelo = modelo;
        this.versao = versao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    public Carro(LocalDate dataCadastro, LocalDate dataVenda, String marca, String modelo, String versao, String cor, Integer quilometragem) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.dataVenda = dataVenda;
        this.marca = marca;
        this.modelo = modelo;
        this.versao = versao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    public Carro() {

    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dataCadastro;
    private LocalDate dataVenda;
    private String marca;
    private String modelo;
    private String versao;
    private String cor;
    private Integer quilometragem;

    }

