/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

/**
 *
 * @author Jhon B
 */
import java.util.Scanner;

public class Atividade2 {
  public static void main(String[] args){
      int a, b, c;
      Scanner SD;
      SD = new Scanner(System.in);
      
      System.out.print("Digite um número inteiro: ");
      a = SD.nextInt();
      
      System.out.print("Digite um número inteiro: ");
      b = SD.nextInt();  
      
      System.out.print("Digite um número inteiro: ");
      c = SD.nextInt();
      
      int soma = a + b;
      
      if (soma < c) {
          System.out.println("A soma a + b é menor que c. ");
      }else{
          System.out.println("A soma de a + b é maior que c.");
      }
    
  }
    
}
