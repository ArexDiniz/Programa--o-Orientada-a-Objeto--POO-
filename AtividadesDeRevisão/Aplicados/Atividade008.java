package AtividadesDeRevisão.Aplicados;

/*08 - Escreva um método que verifique se uma data é válida, a partir de um dado recebido do usuário no formato
DD/MM/AAAA. Se a data for inválida, informe ao usuário onde está o erro. */
import java.util.*;

public class Atividade008 {

    public static void main(String[] args) {
        int dias[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a data no formato DD/MM/AAAA");
        String data = sc.nextLine();
        sc.close();

        String[] dataSeparada = data.split("/");

        int mes = Integer.parseInt(dataSeparada[1]);
        int dia = Integer.parseInt(dataSeparada[0]);
        int ano = Integer.parseInt(dataSeparada[2]);
        if (mes >= 12 && dia <= dias[mes] && ano > 0) {
            System.out.println("Data é válida");
        } else {
            System.out.print("Data inválida por conta do: ");
            if (mes > 12) {
                System.out.print("Mês");
            } else if (dia > dias[mes]) {
                System.out.print("Dia");
            } else {
                System.out.print("Ano inválido");
            }
        }

    }
}
