package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedagogo extends Pessoa{
    // Atributos
    private int atendPedagogo = 0;

    public Pedagogo(String nome, Long telefone, LocalDate dataNascimento, Long cpf, int codigo) {
        super(nome, telefone, dataNascimento, cpf, codigo);
    }

    // Métodos
    public void novoAtendimento(){

    }

    // Métodos Especiais
    public int getAtendPedagogo() {
        return atendPedagogo;
    }

    public void setAtendPedagogo(int atendPedagogo) {
        this.atendPedagogo = atendPedagogo;
    }

    @Override
    public String toString() {
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Telefone: " + this.getTelefone() +
                ", Data de Nascimento: " + getDataNascimento() +
                ", CPF: " + getCpf() +
                ']';
    }

    public String listaAtendimentos(){
        return "[" +
                "Código: " + this.getCodigo() +
                ", Nome: '" + this.getNome() + '\'' +
                ", Nro de Atendimentos: " + this.getAtendPedagogo() +
                ']';
    }
}
