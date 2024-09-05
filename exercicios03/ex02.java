
/*2.  Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50. */
package exercicios03;

import java.util.Scanner;

public class ex02 {
 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i;
            int somatorio = 0;
            int valorProduto;
          
            for(i=0;i<50;i++){
              System.out.print("Qual o valor do produto?");
              valorProduto = scanner.nextInt();
               somatorio = somatorio + valorProduto; 
            }
               
             System.out.print("o somatório é  " + somatorio);
          
               scanner.close();
              }
          }
  

