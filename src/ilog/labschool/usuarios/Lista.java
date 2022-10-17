package ilog.labschool.usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("Entre Graduação incompleta, Graduação completa, Mestrado e Doutorado");
        System.out.print("Qual a sua formação: ");
        String formacao = entrada.nextLine();
        System.out.println("Entre Front-end, Back-end e Full Stack");
        System.out.print("Em qual você possui experiência: ");
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
    public void listaRelatorioAlunos(String situacao){
        for (Aluno item: Aluno){
            if (situacao == "Todos"){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Nota: " + item.getNota() + " | Total de Atendimentos: " + item.getAtendAluno() + " ]");
            } else if (item.getSituacao() == situacao){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Nota: " + item.getNota() + " | Total de Atendimentos: " + item.getAtendAluno() + " ]");
            }
        }
    }

    public void listaRelatorioProfessores(String experiencia){
//        System.out.println(experiencia);
        for (Professor item: Professor){
            if (experiencia == "Todos"){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Formação: " + item.getFormacao() + " | Experiência: " + item.getExperiencia() + " | Estado: " + item.getEstado() + " ]");
            } else if (item.getExperiencia() == experiencia){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Formação: " + item.getFormacao() + " | Experiência: " + item.getExperiencia() + " | Estado: " + item.getEstado() + " ]");
            }
        }
    }

    public void listarRelatorioPessoas(String tipo){
        if (tipo == "Todos"){
            for (Aluno item: Aluno){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | CPF: " + item.getCpf() + " ]");
            }
            for (Professor item: Professor){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | CPF: " + item.getCpf() + " ]");
            }
            for (Pedagogo item: Pedagogo){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | CPF: " + item.getCpf() + " ]");
            }
        } else {
            switch (tipo) {
                case "Aluno":
                    for (Aluno item : Aluno) {
                        System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                                " | CPF: " + item.getCpf() + " ]");
                    }
                    break;
                case "Professor":
                    for (Professor item : Professor) {
                        System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                                " | CPF: " + item.getCpf() + " ]");
                    }
                    break;
                case "Pedagogo":
                    for (Pedagogo item : Pedagogo) {
                        System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                                " | CPF: " + item.getCpf() + " ]");
                    }
                    break;
            }
        }
    }
    public void listaRelatorioAtendimentoAluno(){
        for (Aluno item: Aluno){
            if (item.getAtendAluno() > 0){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Total de Atendimentos: " + item.getAtendAluno() + " ]");
            }
        }
    }
    public void listaRelatorioAtendimentoPedagogo(){
        for (Pedagogo item: Pedagogo){
            if (item.getAtendPedagogo() > 0){
                System.out.println("[ Código: " + item.getCodigo() + " | Nome: " + item.getNome() +
                        " | Total de Atendimentos: " + item.getAtendPedagogo() + " ]");
            }
        }
    }
}
