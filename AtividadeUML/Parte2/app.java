package AtividadeUML.Parte2;

import java.util.Scanner;

/*3) Uma partida de basquete é disputada por duas equipes adversárias. Suas pontuações são marcadas em 4 períodos,
chamados de “quartos” e, ao final, ganha a partida quem marcou mais ponto na soma dos períodos. Em caso de
empate, haverá quantas prorrogações forem necessárias até que uma equipe saia vencedora. É necessário saber o
nome da equipe vencedora de uma partida, bem como imprimir o placar no formato abaixo:
        1Q 2Q 3Q 4Q PR FINAL
EQUIPE1 21 19 23 24 -- 87
EQUIPE2 32 25 20 20 -- 97 */
//import java.util.*;

public class app {
    public static void main(String[] args) {
        String nomeEquipe1 = "The Blues";
        String nomeEquipe2 = "The Reds";
        Scanner sc = new Scanner(System.in);

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Digite o primeiro time: ");
         * nomeEquipe1 = sc.nextLine();
         * System.out.println("Digite o nome do segundo time");
         * nomeEquipe2 = sc.nextLine();
         */
        Partida partida = new Partida(nomeEquipe1, nomeEquipe2);
        int pontosTime1[] = new int[4];
        int pontosTime2[] = new int[4];
        for (int i = 1; i < pontosTime1.length + 1; i++) {
            System.out.println("Quantos pontos o " + nomeEquipe1 + " fez no " + i + "Q");
            pontosTime1[i - 1] = sc.nextInt();
            System.out.println("Quantos pontos o " + nomeEquipe2 + " fez no " + i + "Q");
            pontosTime2[i - 1] = sc.nextInt();
        }
        int totalTimes[] = new int[2];
        totalTimes = partida.somatoriaDosPontos(pontosTime1, pontosTime2);

        Boolean temVencedor = partida.verificarSeTemVencedor();
        String periodosEscritos = "\t\tQ1\tQ2\tQ3\tQ4\t";
        String pontosTime1Escrito = nomeEquipe1 + "\t" + pontosTime1[0] + "\t" + pontosTime1[1] + "\t" + pontosTime1[2]
                + "\t" + pontosTime1[3] + "\t";
        String pontosTime2Escrito = nomeEquipe2 + "\t" + pontosTime2[0] + "\t" + pontosTime2[1] + "\t" + pontosTime2[2]
                + "\t" + pontosTime2[3] + "\t";
        if (temVencedor) {

            periodosEscritos += "PR\tFINAL";
            pontosTime1Escrito += "--\t" + totalTimes[0];
            pontosTime2Escrito += "--\t" + totalTimes[1];
            System.out.println(periodosEscritos + "\n" + pontosTime1Escrito + "\n" + pontosTime2Escrito);

        } else {
            int elemento;
            while (!temVencedor) {
                periodosEscritos = partida.formatarPlacar(periodosEscritos, "PR");

                System.out.println("Quanto os " + nomeEquipe1 + " fez nessa prorrogação");
                elemento = sc.nextInt();
                pontosTime1Escrito = partida.formatarPlacar(pontosTime1Escrito, Integer.toString(elemento));
                partida.implementarTotal(elemento, 0);

                System.out.println("Quanto os " + nomeEquipe2 + " fez nessa prorrogação");
                elemento = sc.nextInt();
                pontosTime2Escrito = partida.formatarPlacar(pontosTime2Escrito, Integer.toString(elemento));
                partida.implementarTotal(elemento, 1);

                temVencedor = partida.verificarSeTemVencedor();
            }
            sc.close();
            periodosEscritos += "PR\tFINAL";
            pontosTime1Escrito += "--\t" + totalTimes[0];
            pontosTime2Escrito += "--\t" + totalTimes[1];
            System.out.println(periodosEscritos + "\n" + pontosTime1Escrito + "\n" + pontosTime2Escrito);
        }
    }
}
