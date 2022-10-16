package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    public Pessoa(String nome, Long telefone, LocalDate dataNascimento, Long cpf, int codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.setCodigo(codigo);
    }

    // Atributos
    private String nome;
    private Long telefone;
    private LocalDate dataNascimento;
    private Long cpf;
    private int codigo;
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
}
