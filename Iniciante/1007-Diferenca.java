/*
* Beecrowd 1007 - Diferença.
* https://judge.beecrowd.com/pt/problems/view/1007
* Leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).    
*/  

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int diferenca = (a * b) - (c * d);
        
        System.out.println("DIFERENCA = " + diferenca);
        
        sc.close();
 
    }
 
}
