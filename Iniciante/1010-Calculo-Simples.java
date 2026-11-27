/*
* Beecrowd 1010 - Calculo Simples.
* https://judge.beecrowd.com/pt/problems/view/1010
* Neste problema, deve-se ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após,
calcule e mostre o valor a ser pago.    
*/  

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int cod1 = sc.nextInt();
    int qtd1 = sc.nextInt();
    double preco1 = sc.nextDouble();
    
    int cod2 = sc.nextInt();
    int qtd2 = sc.nextInt();
    double preco2 = sc.nextDouble();
    
    double valPagar = (qtd1 * preco1) + (qtd2 * preco2);
    
    
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valPagar);
    
    sc.close();
    
    }
 
}
