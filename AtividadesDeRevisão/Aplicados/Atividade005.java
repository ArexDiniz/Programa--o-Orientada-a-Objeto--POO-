
package AtividadesDeRevisão.Aplicados;

import java.util.*;
/*5 – Um estudante muito organizado está matriculado em N disciplinas, e dispões de um total semanal de H horas e
M minutos para estudar. Sua intenção é dividir o tempo disponível igualmente para as N disciplinas, e distribuir o
tempo de descanso que sobrar nas pausas entre as disciplinas. Crie um ou mais métodos para informar ao estudante
como ele deve organizar seu plano de estudos. */

public class Atividade005 {
    public static void main(String[] args) {
        int disciplinas = Matriculas();
        int horas = HorasSemanais();
        CalculoDeEstudo(disciplinas, horas);

    }

    public static int Matriculas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em quantas matérias você se matriculou?");
        int matriculas = sc.nextInt();
        sc.close();
        return matriculas;
    }

    public static int HorasSemanais() {
        Scanner leitor = new Scanner(System.in);
        int horas;
        System.out.println("Quantas horas totais você tem na semana para estudo?");
        System.out.print("Horas: ");
        horas = leitor.nextInt();
        System.out.print("Minutos: ");
        int minutos = leitor.nextInt();
        horas = horas * 60;
        horas = minutos + horas;
        leitor.close();
        return horas;

    }

    public static void CalculoDeEstudo(int disciplinas, int horas) {
        int horarioDeEstudo = horas / disciplinas;

        horarioDeEstudo = horarioDeEstudo / 60;
        System.out.println("Você irá estudar " + horarioDeEstudo + "Cada matéria ");
    }
}