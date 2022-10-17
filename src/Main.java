import ilog.labschool.menu.Menu;
import ilog.labschool.usuarios.Lista;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sair = 0;
        Menu menu = new Menu();
        Lista lista = new Lista();
//        System.out.println(menu.menuPrincipal());
        while (sair == 0){
            int escolhaMenuPrincipal = menu.menuPrincipal();
            switch (escolhaMenuPrincipal) {
                case 1:
                    lista.cadastrarAluno();
                    break;
                case 2:
                    lista.cadastrarProfessor();
                    break;
                case 3:
                    lista.cadastrarPedagogo();
                    break;
                case 4:
                    Scanner teclado = new Scanner(System.in);
                    System.out.print("Informe o código do aluno: ");
                    int codigoAluno = teclado.nextInt();
                    int situacao = menu.menuAtualizarSituacao();
                    switch (situacao){
                        case 1:
                            lista.atualizarSituacao(codigoAluno, "Ativo");
                            break;
                        case 2:
                            lista.atualizarSituacao(codigoAluno, "Irregular");
                            break;
                        case 3:
                            lista.atualizarSituacao(codigoAluno, "Inativo");
                            break;
                        case 4:
                            lista.atualizarSituacao(codigoAluno, "Atendimento pedagogico");
                            break;
                    }
                    break;
                case 5:
                    Scanner tecladoAtend = new Scanner(System.in);
                    System.out.print("Informe o código do aluno: ");
                    int codigoAlunoAtend = tecladoAtend.nextInt();
                    System.out.print("Informe o código do pedagogo: ");
                    int codigoPedagogoAtend = tecladoAtend.nextInt();
                    lista.realizarAtendimento(codigoAlunoAtend, codigoPedagogoAtend);
                    System.out.println("Atendimento realizado com sucesso!");
                    break;
                case 6:
                    String menu1 = menu.menuRelatorio();
                    System.out.println(menu1);
                    switch (menu1){
                        case "1.1":
                            lista.listarRelatorioPessoas("Aluno");
                            break;
                        case "1.2":
                            lista.listarRelatorioPessoas("Professor");
                            break;
                        case "1.3":
                            lista.listarRelatorioPessoas("Pedagogo");
                            break;
                        case "1.4":
                            lista.listarRelatorioPessoas("Todos");
                            break;
                        case "2.1":
                            lista.listaRelatorioAlunos("Ativo");
                            break;
                        case "2.2":
                            lista.listaRelatorioAlunos("Irregular");
                            break;
                        case "2.3":
                            lista.listaRelatorioAlunos("Atendimento pedagogico");
                            break;
                        case "2.4":
                            lista.listaRelatorioAlunos("Inativo");
                            break;
                        case "2.5":
                            lista.listaRelatorioAlunos("Todos");
                            break;
                        case "3.1":
                            lista.listaRelatorioProfessores("Front-end");
                            break;
                        case "3.2":
                            lista.listaRelatorioProfessores("Back-end");
                            break;
                        case "3.3":
                            lista.listaRelatorioProfessores("Full Stack");
                            break;
                        case "3.4":
                            lista.listaRelatorioProfessores("Todos");
                            break;
                        case "4":
                            lista.listaRelatorioAtendimentoAluno();
                            break;
                        case "5":
                            lista.listaRelatorioAtendimentoPedagogo();
                    }
                    break;
                case 7:
                    sair = 1;
                    break;
            }
        }
    }
}