/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120039
 */
public class NotaMenu {

    static String alunos[];
    static float notas[][];
    static int nAlunos, contAlunos, nNotas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares");
        System.out.print("Quantidade de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantidade de notas: ");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];

        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    InserirAlunoNotas();
                    break;
                case 2:
                    ImprimirAlunosNota();
                    break;
                case 3:
                    System.out.println("Aplicação encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        } while (opM != 3);

    }

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("O valor digitado deve ser um número, tente novamente.");
            return leiaFloat();
        }
    }

    public static void menu() {
        System.out.println("1 - Inserir Notas do Aluno");
        System.out.println("2 - Imprimir Notas do Aluno");
        System.out.println("3 - Sair");
        System.out.print("Digite aqui: ");
    }

    public static void InserirAlunoNotas() {
        Scanner leia = new Scanner(System.in);

        if (contAlunos < nAlunos) {
            System.out.print("Nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("Digite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota inválda, tente novamente.");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];
            }
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é mais possível lançar notas, todas posições foram ocupadas.");
        }
    }

    public static void ImprimirAlunosNota() {

        System.out.println("\n-Resultado-\n");
        for (int i = 0; i < contAlunos; i++) {
            System.out.print(alunos[i] + " sua média foi de " + notas[i][nNotas]);
            if (notas[i][nNotas] >= 6) {
                System.out.println(" e você foi aprovado(a).");
            } else {
                System.out.println(" e você foi reprovado(a).");
            }
        }
    }
}
