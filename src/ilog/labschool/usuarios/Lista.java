package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Scanner;

public class Lista {
    public int codigo = 1;
    public List<Aluno> Aluno = new ArrayList<>();
    public List<Professor> Professor = new ArrayList<>();
    public List<Pedagogo> Pedagogo = new ArrayList<>();

    public void cadastrarAluno(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Telefone [Preencha apenas com números - DDD+NUMERO]: ");
        String telefone = entrada.nextLine();
        System.out.print("Data de Nascimento [dd/MM/yyyy]: ");
        String dataNascimento = entrada.nextLine();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatarData);
        System.out.print("CPF [apenas números]: ");
        String cpf = entrada.nextLine();
        System.out.print("Por favor insira a nota do seu teste: ");
        double nota = entrada.nextDouble();
        Aluno.add(new Aluno(nome, Long.valueOf(telefone), nascimento, Long.valueOf(cpf), nota, this.codigo++));
    }

    public void cadastrarProfessor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Telefone [Preencha apenas com números - DDD+NUMERO]: ");
        String telefone = entrada.nextLine();
        System.out.print("Data de Nascimento [dd/MM/yyyy]: ");
        String dataNascimento = entrada.nextLine();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatarData);
        System.out.print("CPF [apenas números]: ");
        String cpf = entrada.nextLine();
        System.out.print("Formação: ");
        String formacao = entrada.nextLine();
        System.out.print("Experiência: ");
        String experiencia = entrada.nextLine();
        Professor.add(new Professor(nome, Long.valueOf(telefone), nascimento, Long.valueOf(cpf), this.codigo++, formacao, experiencia));
    }

    public void cadastrarPedagogo(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Telefone [Preencha apenas com números - DDD+NUMERO]: ");
        String telefone = entrada.nextLine();
        System.out.print("Data de Nascimento [dd/MM/yyyy]: ");
        String dataNascimento = entrada.nextLine();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatarData);
        System.out.print("CPF [apenas números]: ");
        String cpf = entrada.nextLine();
        Pedagogo.add(new Pedagogo(nome, Long.valueOf(telefone), nascimento, Long.valueOf(cpf), this.codigo++));
    }

    public void atualizarSituacao(int codigoAluno, String situacaoAluno){
        for (Aluno item: Aluno) {
            if (item.getCodigo() == codigoAluno){
                item.setSituacao(situacaoAluno);
                return;
            }
        }

        System.out.print("Código não encontrado");
    }

    public void realizarAtendimento(int codigoAluno, int codigoPedagogo){
        int validacaoAluno = 0;
        for (Aluno item: Aluno) {
            if (item.getCodigo() == codigoAluno){
                int atendimento = item.getAtendAluno();
                atendimento++;
                item.setAtendAluno(atendimento);
                validacaoAluno = 1;
            }
        }

        if (validacaoAluno != 1){
            System.out.print("Aluno não encontrado");
            return;
        }

        for (Pedagogo item: Pedagogo) {
            if (item.getCodigo() == codigoPedagogo){
                int atendimento = item.getAtendPedagogo();
                atendimento++;
                item.setAtendPedagogo(atendimento);
                return;
            }
        }

        for (Aluno item: Aluno) {
            if (item.getCodigo() == codigoAluno){
                int atendimento = item.getAtendAluno();
                atendimento--;
                item.setAtendAluno(atendimento);
                System.out.print("Pedagogo não encontrado");
            }
        }
    }
}
