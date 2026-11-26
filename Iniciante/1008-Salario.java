/*
* Beecrowd 1008 - Salário.
* https://judge.beecrowd.com/pt/problems/view/1008
* Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.    
*/  

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numFunc = sc.nextInt();
        int horas = sc.nextInt();
        double valHora = sc.nextDouble();
        
        double salario = horas * valHora;
        
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
        sc.close();
 
    }
 
}
