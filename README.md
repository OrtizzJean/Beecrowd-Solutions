# 🧩 Beecrowd Solutions (Java) 

Repositório destinado às minhas resoluções de problemas de lógica de programação e algoritmos da plataforma Beecrowd (antigo URI Online Judge), desenvolvidas em Java.

## 🚀 Como funciona?

Cada desafio resolvido tem seu próprio arquivo `.java` nomeado com o número e o nome do problema. O objetivo é focar em código limpo, estruturação lógica e otimização.

---

## 📝 Exemplo de Problema: 1001 - Extremamente Básico

### Enunciado
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme o exemplo apresentado abaixo. 

### Código da Solução (`Main.java`)

```java
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;
        
        System.out.println("X = " + X);
        
        sc.close();
    }
}
