package ilog.labschool.usuarios;

public class Pedagogo extends Pessoa{
    // Atributos
    private int atendPedagogo = 0;

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
}
