# 🧩 Beecrowd Solutions (Java) 

Repositório destinado às minhas resoluções de problemas de lógica de programação e algoritmos da plataforma [Beecrowd](https://www.beecrowd.com.br/) (antigo URI Online Judge), desenvolvidas em Java.

O objetivo deste espaço é documentar minha evolução no estudo de lógica, estruturas de dados e programação orientada a objetos, servindo também como um portfólio prático das minhas habilidades de resolução de problemas.

## 🚀 Como funciona?
Cada desafio resolvido possui o seu próprio arquivo `.java` nomeado com o número e o título correspondente na plataforma. O foco das resolções é manter um código limpo, de fácil leitura e com otimização lógica de tempo e espaço.

**Exemplos de nomenclatura:**
* `1048_Aumento_de_Salario.java`
* `1052_Mes.java`

---

## 📝 Exemplo de Problema: 1001 - Extremamente Básico ✅ ACCEPTED

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
