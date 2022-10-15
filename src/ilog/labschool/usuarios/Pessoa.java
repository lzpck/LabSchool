package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    // Atributos
    private String nome;
    private Long telefone;
    private LocalDate dataNascimento;
    private Long cpf;
    private int codigo;
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Métodos
    public void cadastrar(){

    }

    // Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = Long.valueOf(telefone);
    }

    public String getDataNascimento() {
        return formatarData.format(dataNascimento);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Long.valueOf(cpf);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "[" +
                "Código: " + codigo +
                ", Nome: '" + nome + '\'' +
                ", Telefone: " + telefone +
                ", Data de Nascimento: " + dataNascimento +
                ", CPF: " + cpf +
                ']';
    }
}
