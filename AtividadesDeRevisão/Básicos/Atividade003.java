package AtividadesDeRevisão.Básicos;

/*03 – Escreva um ou mais métodos para imprimir no console retângulos usando caracteres, como, por exemplo:
XXXXX
X   X
X   X
X   X
XXXXX */
import java.util.*;

public class Atividade003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do retangulo: altura / largura ");
        int altura = sc.nextInt();
        int largura = sc.nextInt();
        sc.close();
        EscreverLinhaInteira(largura);
        for (int i = 0; i < altura - 2; i++) {
            EscreverLaterais(largura);
        }
        EscreverLinhaInteira(largura);
    }

    public static void EscreverLinhaInteira(int largura) {
        for (int i = 0; i < largura; i++) {
            System.out.print("x");
        }
        System.out.println();
    }

    public static void EscreverLaterais(int largura) {
        for (int i = 0; i < largura; i++) {
            if (i == 0 || i == largura - 1) {
                System.out.print("x");

            } else {
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
