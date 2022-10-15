package ilog.labschool.usuarios;

public class Aluno extends Pessoa{
    // Atributos
    private String situacao = "Ativo"; // Ativo | Irregular | Atendimento Pedagógico | Inativo
    private double nota;
    private int atendAluno = 0;

    // Métodos
    public void atualizarMatricula(){

    }
    public void novoAtendimento(){

    }

    // Métodos Especiais
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
}
