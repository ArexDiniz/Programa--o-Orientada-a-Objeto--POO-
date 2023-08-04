
package AtividadesDeRevisão.Básicos;

import java.util.*;

/*02 - Escreva um método que receba como parâmetro um vetor de inteiros e crie outro vetor, contendo a soma de
cada par de vizinhos do vetor original. Por exemplo, se o vetor original era 4-8-15-16-23-42, o retorno deve ser um
vetor 12-31-65 (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último número deve ser somado
consigo mesmo. Para ler o vetor, pode aproveitar o método do exercício 02. Escreva um programa que execute e teste
os métodos */
public class Atividade002 {
    public static void main(String[] args) {
        int vet[] = PreencherVetor();
        CriarNovoVetor(vet);
    }

    public static int[] PreencherVetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho do Vetor?");
        int tamanho = sc.nextInt();
        int vetor[] = new int[tamanho];
        System.out.println("Agora vamos colocar os valores dentro do vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor ");
            vetor[i] = sc.nextInt();
        }
        sc.close();
        return vetor;
    }

    public static void CriarNovoVetor(int[] vetor) {
        if (vetor.length % 2 != 0) {
            int vetorNovo[] = new int[vetor.length + 1];
            for (int i = 0; i < vetor.length; i++) {
                vetorNovo[i] = vetor[i];
            }
            System.out.println("Vetor somado");
            vetorNovo[vetorNovo.length - 1] = vetor[vetor.length - 1];
            int vetorSomado[] = new int[vetorNovo.length / 2];
            int j = 1;
            int k = 0;
            for (int i = 0; i < vetorSomado.length; i++) {
                vetorSomado[i] = vetorNovo[k] + vetorNovo[j];
                j = j + 2;
                k = k + 2;
                System.out.print(vetorSomado[i] + "-");
            }

        } else {
            System.out.println("Vetor somado");

            int vetorSomado[] = new int[vetor.length / 2];
            int j = 1;
            int k = 0;
            for (int i = 0; i < vetorSomado.length; i++) {
                vetorSomado[i] = vetor[k] + vetor[j];
                j = j + 2;
                k = k + 2;
                System.out.print(vetorSomado[i] + "-");
            }
        }

    }
}
