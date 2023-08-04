package AtividadesDeRevisão.Básicos;

import java.util.*;
/*01 - Escreva dois métodos em Java: o primeiro deve ser utilizado para preencher um vetor de 6 números inteiros a
partir da entrada do usuário. O segundo deve inverter as posições dos números do vetor. Por exemplo, se o vetor
original era 4-8-15-16-23-42, deve ficar 43-23-16-15-8-4 após a execução do segundo método. Escreva um
programa que execute e teste os dois métodos. */

public class Atividade001 {
    public static void main(String[] args) {
        int vetor[] = new int[6];
        PreencherVetor(vetor);
        InverterVetorOriginal(vetor);
    }

    public static int[] PreencherVetor(int[] vet) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite os valores do Vetor");
            vet[i] = sc.nextInt();

        }
        sc.close();
        System.out.println("Vetor Original");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "-");
        }
        System.out.println();
        return vet;
    }

    public static void InverterVetorOriginal(int[] vet) {
        int vetInvertido[] = new int[vet.length];
        int j = vet.length - 1;
        for (int i = 0; i < vet.length; i++) {
            vetInvertido[j] = vet[i];
            j--;
        }

        System.out.println("Vetor Invertido");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vetInvertido[i] + "-");
        }
        System.out.println();

    }
}
