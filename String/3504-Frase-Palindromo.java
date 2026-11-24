/*
* Beecrowd 3504 - Frase Palíndromo.
* https://judge.beecrowd.com/pt/problems/view/3504
* Faça um programa que leia uma frase e informe se ela é palíndrome.
Uma frase ou palavra é chamada de palíndrome quando pode ser lida de traz para frente e de frente para traz, que ela eh igual.
ex: arara -> é palíndrome
Arara -> nao é palíndrome pq A é diferente de a
a rara -> nao é palíndrome pq espaço é diferente de r     
*/  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase = br.readLine();

        // Evita erro caso a entrada seja nula
        if (frase == null) {
            return;
        }

        boolean ehPalindrome = true;
        int esquerda = 0;
        int direita = frase.length() - 1;

        // Compara as extremidades avançando em direção ao centro
        while (esquerda < direita) {
            if (frase.charAt(esquerda) != frase.charAt(direita)) {
                ehPalindrome = false;
                break; // Já encontrou diferença, não precisa continuar
            }
            esquerda++;
            direita--;
        }

        if (ehPalindrome) {
            System.out.println("A frase [" + frase + "] eh palindrome");
        } else {
            System.out.println("A frase [" + frase + "] nao eh palindrome");
        }
    }
}
