package AtividadesDeRevisão.Básicos;

/*04 - Elabore um programa que leia uma frase e mostre-a invertida na tela. Após mostrar a primeira frase, o programa
deve ler e imprimir outra, assim fazendo até que o usuário digite a palavra “fim”. */
import java.util.*;

public class Atividade004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("Escreva a frase");
            String frase = sc.nextLine();
            if (frase.equalsIgnoreCase("fim")) {
                System.out.println("Sistema Finalizado");
                i++;
            } else {
                InverterFrase(frase);
            }
        }
        sc.close();
    }

    public static void InverterFrase(String frase) {
        int j = frase.length() - 1;
        for (int i = 0; i < frase.length(); i++) {
            char carac = frase.charAt(j);
            System.out.print(carac);
            j--;
        }
        System.out.println();
    }
}
