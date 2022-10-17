package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa{



    private String situacao = "Ativo"; // Ativo | Irregular | Atendimento Pedagógico | Inativo
    private double nota;
    private int atendAluno = 0;

    public Aluno(String nome, Long telefone, LocalDate dataNascimento, Long cpf, double nota, int codigo) {
        super(nome, telefone, dataNascimento, cpf, codigo);
        this.setNota(nota);

    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAtendAluno() {
        return atendAluno;
    }

    public void setAtendAluno(int atendAluno) {
        this.atendAluno = atendAluno;
    }

    @Override
    public String toString() {
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Telefone: " + this.getTelefone() +
                ", Data de Nascimento: " + getDataNascimento() +
                ", CPF: " + getCpf() +
                ", Nota: " + this.nota +
                ", Situação: " + this.situacao +
                ", Atendimentos: " + this.atendAluno +
                ']';
    }

    public String listaAlunos(){
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Telefone: " + this.getTelefone() +
                ", CPF: " + getCpf() +
                ']';
    }

    public String listaAtendimentos(){
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Nro de Atendimentos: " + this.getAtendAluno() +
                ']';
    }
}
