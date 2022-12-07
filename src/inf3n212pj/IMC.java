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
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float peso, altura, IMC;
	String nome, imcClass;
        Scanner leia = new Scanner(System.in);
        
		System.out.println("--Sistema de Cálculo de Ìndice de Massa Corpórea (IMC)");
		System.out.print("\nInforme seu nome: ");
		nome = leia.next();
		System.out.print("Informe o seu peso em kilos: ");
		peso = leia.nextFloat();
		System.out.print("Informe sua altura em metros: ");
		altura = leia.nextFloat();
		IMC = peso / (altura * altura);
                
		if(IMC<=18.5){
			imcClass = ("Abaixo do Peso");
		}else if(IMC<=24.9){
			imcClass = ("Saudável");
		}else if(IMC<=29.9){
			imcClass = ("Sobrepeso");
		}else if(IMC<=34.9){
			imcClass = ("Obesidade Grau I");
		}else if(IMC<=39.9){
			imcClass = ("Obesidade Grau II");
		}else{
			imcClass = ("Obesidade Grau III (mórbida)");
		}
		System.out.print(nome + ", o seu IMC tem o valor de " + IMC + " e sua classificação é " + imcClass + ".");
    }
    
}
