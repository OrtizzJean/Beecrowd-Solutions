/*
* Beecrowd 1006 - Média.
* https://judge.beecrowd.com/pt/problems/view/1006
* Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e
a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.    
*/  

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double media = ((a * 2.0)+(b * 3.0)+(c * 5.0))/10.0;
      
        System.out.printf("MEDIA = %.1f%n", media);
        
        sc.close();
 
    }
 
}
