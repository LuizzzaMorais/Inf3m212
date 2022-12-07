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
public class Notas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Notas Escolares");
        System.out.print("Quantas notas serão inseridas? ");
        int nNotas = (int) leiaFloat();

        float notas[] = new float[nNotas + 1];

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (valideNota(notas[i])) {
                    System.out.println("Nota inválida, tente novamente!");
                }
            } while (valideNota(notas[i]));
            notas[nNotas] += notas[i];
        }
        notas[nNotas] = notas[nNotas] / nNotas;
        System.out.printf("Sua média foi de %.2f", notas[nNotas]);
        if (notas[nNotas] >= 6) {
            System.out.println(". Parabéns, você foi aprovado.");
        } else {
            System.out.println(". Você foi reprovado.");
        }
    }

    public static boolean valideNota(float nota) {
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
