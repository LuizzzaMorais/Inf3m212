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
public class NotaMatriz{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares");
        System.out.print("Quantidade de alunos: ");
        int nAlunos = (int) leiaFloat();
        System.out.print("Quantidade de notas: ");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];

        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Nome do aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("Digite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])){
                        System.out.println("Nota inválda, tente novamente.");
                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];
            }
            notas[i][nNotas] = notas[i][nNotas] / nNotas;
        }
        System.out.println("\n-Resultado-\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.print(alunos[i] + " sua média foi de " + notas[i][nNotas]);
            if (notas[i][nNotas] >= 6) {
                System.out.println(" e você foi aprovado(a).");
            } else {
                System.out.println(" e você foi reprovado(a).");
            }
        }
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
}
