package ilog.labschool.menu;

import ilog.labschool.usuarios.Lista;

import java.util.Arrays;
import java.util.Scanner;

public class Menu extends Lista {
    public int menuPrincipal(){
        System.out.println();
        System.out.println("BEM VINDO(A) AO LAB SCHOOL!");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Professor");
        System.out.println("3 - Cadastrar Pedagogo");
        System.out.println("4 - Atualizar Situação de Aluno");
        System.out.println("5 - Realizar Atendimento");
        System.out.println("6 - Relatórios");
        System.out.println("7 - Sair do Sistema");
        System.out.println();
        System.out.print("Escolha uma das opções acima por favor: ");
        Scanner teclado = new Scanner(System.in);
        int escolha = teclado.nextInt();
        return escolha;
    }

    public int menuAtualizarSituacao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - Ativo");
        System.out.println("2 - Irregular");
        System.out.println("3 - Inativo");
        System.out.println("4 - Atendimento Pedagogico");
        System.out.println("Escolha a situação que o aluno se encontra: ");
        int sitAluno = teclado.nextInt();
        System.out.println();
        return sitAluno;
    }

    public String  menuRelatorio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - Listar pessoas");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Listar professores");
        System.out.println("4 - Listar alunos com mais atendimentos");
        System.out.println("5 - Listar pedagogos com mais atendimentos");
        System.out.println("6 - Voltar");
        System.out.println();
        System.out.print("Escolha qual relatório: ");
        int escolha = teclado.nextInt();
        String escolha2 = "";
        switch (escolha){
            case 1:
                escolha2 = this.relatorioPessoas();
                break;
            case 2:
                escolha2 = this.relatorioAluno();
                break;
            case 3:
                escolha2 = this.relatorioProfessores();
            case 4:
                escolha2 = this.atendimentoAluno();
                break;
            case 5:
                escolha2 = this.atendimentoPedagogo();
                break;
            case 6:
                this.menuPrincipal();
                break;
        }
        return escolha2;
    }


    private String relatorioPessoas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - Listar alunos");
        System.out.println("2 - Listar professores");
        System.out.println("3 - Listar pedagogos");
        System.out.println("4 - Listar todos");
        System.out.println("5 - Voltar");
        System.out.println();
        System.out.print("Escolha qual relatório: ");
        int escolha = teclado.nextInt();
        String escolha2 = "";
        switch (escolha){
            case 1:
                System.out.println("aluno");
                escolha2 =  "1.1";
                break;
            case 2:
                System.out.println("prof");
                escolha2 =  "1.2";
                break;
            case 3:
                System.out.println("ped");
                escolha2 =  "1.3";
                break;
            case 4:
                System.out.println("todos");
                escolha2 =  "1.4";
                break;
            case 5:
                this.menuRelatorio();
                break;
        }

        return escolha2;
    }

    private String relatorioAluno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - Listar ativos");
        System.out.println("2 - Listar irregulares");
        System.out.println("3 - Listar em atendimento");
        System.out.println("4 - Listar inativos");
        System.out.println("5 - Listar todos");
        System.out.println("6 - Voltar");
        System.out.println();
        System.out.print("Escolha qual relatório: ");
        int escolha = teclado.nextInt();
        String escolha2 = "";
        switch (escolha){
            case 1:
                System.out.println("ativo");
                escolha2 = "2.1";
                break;
            case 2:
                System.out.println("irreg");
                escolha2 = "2.2";
                break;
            case 3:
                System.out.println("atend");
                escolha2 = "2.3";
                break;
            case 4:
                System.out.println("inat");
                escolha2 = "2.4";
                break;
            case 5:
                System.out.println("todos");
                escolha2 = "2.5";
                break;
            case 6:
                this.menuRelatorio();
                break;
        }
        return escolha2;
    }

    private String relatorioProfessores(){
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - Listar Front-end");
        System.out.println("2 - Listar Back-end");
        System.out.println("3 - Listar Full Stack");
        System.out.println("4 - Listar todos");
        System.out.println("5 - Voltar");
        System.out.println();
        System.out.print("Escolha qual relatório: ");
        int escolha = teclado.nextInt();
        String escolha2 = "";
        switch (escolha){
            case 1:
                System.out.println("front");
                escolha2 =  "3.1";
                break;
            case 2:
                System.out.println("back");
                escolha2 =  "3.2";
                break;
            case 3:
                System.out.println("full");
                escolha2 =  "3.3";
                break;
            case 4:
                System.out.println("todos");
                escolha2 =  "3.4";
                break;
            case 5:
                this.menuRelatorio();
                break;
        }
        return escolha2;
    }

    private String atendimentoAluno(){
        return "4";
    }

    private String atendimentoPedagogo(){
        return "5";
    }
}


