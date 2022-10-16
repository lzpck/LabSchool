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
                    System.out.println(Arrays.toString(lista.Aluno.toArray()));
                    System.out.println(Arrays.toString(lista.Pedagogo.toArray()));
                    break;
                case 6:
                    System.out.println(menu.menuRelatorio());
                    break;
                case 7:
                    sair = 1;
                    break;
            }
        }
    }
}