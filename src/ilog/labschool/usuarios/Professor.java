package ilog.labschool.usuarios;

public class Professor extends Pessoa{
    // Atributos
    private String formacao; // Graduação Incompleta | Graduação Completa | Mestrado | Doutorado
    private String experiencia; // Front-end | Back-end | Fullstack
    private String estado = "Ativo";

    // Métodos

    // Métodos Especiais
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
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
}
