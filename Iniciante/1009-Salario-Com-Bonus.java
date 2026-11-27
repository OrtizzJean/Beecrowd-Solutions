/*
* Beecrowd 1009 - Salário com Bonus.
* https://judge.beecrowd.com/pt/problems/view/1009
* Faça um programa que leia o nome de um vendedor,
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
informar o total a receber no final do mês, com duas casas decimais.    
*/  

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double salTotal = salario + (vendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", salTotal);
        
        sc.close();
    }
 
}
