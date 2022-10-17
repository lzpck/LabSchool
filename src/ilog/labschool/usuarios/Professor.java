package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
    private String formacao; // Graduação Incompleta | Graduação Completa | Mestrado | Doutorado
    private String experiencia; // Front-end | Back-end | Fullstack
    private String estado = "Ativo";

    public Professor(String nome, Long telefone, LocalDate dataNascimento, Long cpf, int codigo, String formacao, String experiencia) {
        super(nome, telefone, dataNascimento, cpf, codigo);
        this.setFormacao(formacao);
        this.setExperiencia(experiencia);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Telefone: " + this.getTelefone() +
                ", Data de Nascimento: " + getDataNascimento() +
                ", CPF: " + getCpf() +
                ", Formação: " + this.formacao +
                ", Experiência: " + this.experiencia +
                ", Estado: " + this.estado +
                ']';
    }

    public String listaProfessor(){
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", CPF: " + getCpf() +
                ", Formação: " + this.formacao +
                ", Experiência: " + this.experiencia +
                ", Estado: " + this.estado +
                ']';
    }
}
