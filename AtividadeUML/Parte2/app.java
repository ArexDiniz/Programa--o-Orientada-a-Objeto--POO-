package AtividadeUML.Parte2;

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
        String nomeEquipe1 = "Red Tiger";
        String nomeEquipe2 = "Golians";

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Digite o primeiro time: ");
         * nomeEquipe1 = sc.nextLine();
         * System.out.println("Digite o nome do segundo time");
         * nomeEquipe2 = sc.nextLine();
         */
        Partida partida = new Partida(nomeEquipe1, nomeEquipe2);
        partida.iniciarPartida();

    }
}
