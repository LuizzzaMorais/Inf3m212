/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 182120023
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println("ArrayList vazio?");
        System.out.println(nomes.isEmpty());
        
        nomes.add("Joao");

        System.out.println("Tamanho do array: " + nomes.size());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());

        System.out.println("Tamanho do array: " + nomes.size());

        System.out.println(nomes.toString());

        nomes.add(0, "Jubileu");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        System.out.println("Add Klara no Indice 3");

        nomes.add(3, "Klara");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        nomes.remove("Jubileu");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        System.out.println("Remove Indice 1");
        
        nomes.remove(1);
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        
        System.out.println("Impressão do Array");
        for (String nome : nomes) {
            System.out.println("Nome: "+ nome);
        }
        System.out.println("ArrayList vazio?");
        System.out.println(nomes.isEmpty());
        
        System.out.println("Index da Klara é "+ nomes.indexOf("Klara"));
        
        System.out.println("Ordenação de Array");
        nomes.add("Joao");
        nomes.add("Augusto");
        nomes.add("Marcelo");
        nomes.add("JJ");
            System.out.println("Sem Ordenação:"+ nomes.toString());
                // ordenação
        Collections.sort(nomes);
        System.out.println("Ordenado"+ nomes.toString());
        Collections.reverse(nomes);
        System.out.println("Ordem Reversa: "+ nomes.toString());

        nomes.remove("JJ");
        Collections.sort(nomes);
        System.out.println("Nomes sem o JJ: " + nomes.toString());        
    }// fim da main

}//fim geral
