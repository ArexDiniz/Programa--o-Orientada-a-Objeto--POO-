package AtividadesDeRevisão.Aplicados;

import java.text.SimpleDateFormat;
import java.util.*;

/* 09 - Sabendo que 1º de janeiro de 2024 será uma segunda feira, escreva um método que receba uma data e diga em
qual dia da semana esta data acontecerá em 2024. Escreva um programa principal para testar seu método. */

public class Atividade009 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data que você quer consultar");
        String dataStr = sc.nextLine();
        sc.close();
        try {
            Date data = sdf.parse(dataStr);

            String diaSemana2024 = diaDaSemanaEm2024(data);

            System.out.println("A data " + dataStr + " ocorrerá em um(a) " + diaSemana2024 + " em 2024.");
        } catch (Exception e) {
            System.out.println("Erro ao analisar a data: " + e.getMessage());
        }
    }

    public static String diaDaSemanaEm2024(Date data) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);

        int dias = (calendario.get(Calendar.DAY_OF_YEAR) - 1) % 7;

        String[] diasDaSemana = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
                "Sábado", "Domingo" };

        return diasDaSemana[dias];
    }
}
