package AtividadesDeRevisão.Aplicados;

/*Mensalmente, a organização de moradores do bairro faz um sorteio cujos bilhetes contêm números de 6 dígitos.
O sorteio é baseado nos dois primeiros números da loteria federal, sendo que o número vencedor no sorteio da
organização é formado pelos três primeiros dígitos do segundo prêmio e os três últimos dígitos do primeiro prêmio
da loteria federal. Por exemplo, se o primeiro prêmio fosse 34.582 e o segundo 54.098, o número vencedor seria
540.582. Escreva um programa que leia os prêmios da loteria federal e retorna o número vencedor da organização */
import java.util.*;

public class Atividade006 {
    public static void main(String[] args) {
        String primeiroPremio;
        String segundoPremio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Numeros sorteados");
        System.out.print("Primeiro Premio: ");
        primeiroPremio = sc.nextLine();

        System.out.print("Segundo premio: ");
        segundoPremio = sc.nextLine();

        sc.close();

        char leitor;

        System.out.print("Bilhete vencedor: ");
        for (int i = 0; i < 4; i++) {
            leitor = segundoPremio.charAt(i);
            if (leitor == '.') {

            } else {
                System.out.print(leitor);
            }

        }
        System.out.print(".");
        for (int j = 3; j < 6; j++) {
            leitor = primeiroPremio.charAt(j);
            System.out.print(leitor);

        }

    }
}
