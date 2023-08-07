package AtividadesDeRevisão.Aplicados;
/*Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos funciona assim: para multiplicar 81 x 11,
some os dígitos do número (8 + 1 = 9) e insira o resultado entre os dígitos (891). Se a soma der maior que 9,
incremente o dígito da esquerda (vai-um): 56 x 11 = 616. Escreva um programa que efetue multiplicações por 11
usando este algoritmo. */

import java.util.*;

public class Atividade007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Multiplicador de 11  de dois digitos , qual valor você quer multiplicar?");
        String valor = sc.nextLine();
        sc.close();

        char c = valor.charAt(0);
        int primeiroDigito = Character.digit(c, 10);

        c = valor.charAt(1);
        int segundoDigito = Character.digit(c, 10);

        int inteiro = primeiroDigito + segundoDigito;
        if (inteiro > 9) {
            inteiro = inteiro - 10;
            System.out.println(primeiroDigito + 1 + "" + inteiro + "" + segundoDigito);
        } else {
            System.out.println(primeiroDigito + "" + inteiro + "" + segundoDigito);
        }
    }
}
