package com.lazarofonseca.cadastrosocio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Socio implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long matricula;
    private String nome;
    private String nomeDaMae;
    private LocalDate dataNascimento;
    private String cadastroPessoaFisica;
    private String registroGeral;
    private String naturalidade;
    private String profissao;
    private String localDeResidencia;
    private String localDeTrabalho;
    private LocalDate dataDeInscricao;

    public Socio(){
    };

    public Socio(Long id, Long matricula, String nome, String nomeDaMae,
                 LocalDate dataNascimento, String cadastroPessoaFisica, String registroGeral,
                 String naturalidade, String profissao, String localDeResidencia, String localDeTrabalho,
                 LocalDate dataDeInscricao) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.nomeDaMae = nomeDaMae;
        this.dataNascimento = dataNascimento;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.registroGeral = registroGeral;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.localDeResidencia = localDeResidencia;
        this.localDeTrabalho = localDeTrabalho;
        this.dataDeInscricao = dataDeInscricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public void setCadastroPessoaFisica(String cadastroPessoaFisica) {
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalDeResidencia() {
        return localDeResidencia;
    }

    public void setLocalDeResidencia(String localDeResidencia) {
        this.localDeResidencia = localDeResidencia;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public LocalDate getDataDeInscricao() {
        return dataDeInscricao;
    }

    public void setDataDeInscricao(LocalDate dataDeInscricao) {
        this.dataDeInscricao = dataDeInscricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(id, socio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
