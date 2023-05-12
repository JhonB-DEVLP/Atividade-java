/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.java;

/**
 *
 * @author Jhon B
 */
import java.util.Scanner;
public class AtividadeJava {

    public static void main(String[] args) {
       Scanner pi = new Scanner(System.in);
       
       System.out.println("Digite um número inteiro: ");
       int numero = pi.nextInt();
       
       if (numero % 2 == 0){
           System.out.println("Seu número " + numero + " é par." );
                   } else {    
           System.out.println("O número " + numero + " é impar.");
           
       }
        pi.close();
    }
}
