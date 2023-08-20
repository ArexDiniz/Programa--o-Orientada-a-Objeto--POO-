package AtividadeUML.Parte2;

import java.util.*;

public class Partida {
    String nomeEquipe1;
    String nomeEquipe2;
    int[] pontosEquipe1 = { 97, 99, 83, 85 };
    int[] pontosEquipe2 = { 87, 83, 51, 74 };

    public Partida(String nomeEquipe1, String nomeEquipe2) {
        this.nomeEquipe1 = nomeEquipe1;
        this.nomeEquipe2 = nomeEquipe2;
        pontosEquipe1 = new int[4];
        pontosEquipe2 = new int[4];

    }

    public void iniciarPartida() {
        calcularQuartos();
        int[] Totais = somatoriaDosPontos();
        Boolean temVencedor = verificarSeTemVencedor(Totais);
        if (temVencedor) {
            formatadorDoPlacarSemProrrogacao(Totais);
        } else {
            prorrogacoes(Totais);
        }
    }

    public void calcularQuartos() {
        int contadorDeQuartos = 1;
        Scanner sc = new Scanner(System.in);
        while (contadorDeQuartos - 1 < 4) {
            System.out.println("Quantos pontos a " + nomeEquipe1 + " fez no " + contadorDeQuartos + "Q");
            pontosEquipe1[contadorDeQuartos - 1] = sc.nextInt();
            System.out.println("Quantos pontos a " + nomeEquipe2 + " fez no " + contadorDeQuartos + "Q");
            pontosEquipe2[contadorDeQuartos - 1] = sc.nextInt();
            contadorDeQuartos++;
        }
        sc.close();
    }

    public int[] somatoriaDosPontos() {
        int totalEquipe1 = 0;
        int totalEquipe2 = 0;
        for (int i = 0; i < pontosEquipe1.length; i++) {
            totalEquipe1 = totalEquipe1 + pontosEquipe1[i];
            totalEquipe2 = totalEquipe2 + pontosEquipe2[i];
        }
        int totais[] = { totalEquipe1, totalEquipe2 };
        return totais;

    }

    public void formatadorDoPlacarSemProrrogacao(int totais[]) {
        System.out.println("          Q1   Q2   Q3   Q4   PR   Final");
        System.out.print(nomeEquipe1 + " ");
        int i = 0;
        while (i < 4) {
            System.out.print(pontosEquipe1[i] + "   ");
            i++;
        }
        System.out.print("--  " + totais[0]);
        i = 0;
        System.out.println();
        System.out.print(nomeEquipe2 + "   ");
        while (i < 4) {
            System.out.print(pontosEquipe2[i] + "   ");
            i++;
        }

        System.out.print("--  " + totais[1]);

    }

    public Boolean verificarSeTemVencedor(int[] totais) {
        if (totais[0] == totais[1]) {
            return false;
        } else {
            return true;
        }
    }

    public void prorrogacoes(int[] totais) {

    }

    public int[] getPontosEquipe1() {
        return pontosEquipe1;
    }

    public void setPontosEquipe1(int[] pontosEquipe1) {
        this.pontosEquipe1 = pontosEquipe1;
    }

    public int[] getPontosEquipe2() {
        return pontosEquipe2;
    }

    public void setPontosEquipe2(int[] pontosEquipe2) {
        this.pontosEquipe2 = pontosEquipe2;
    }
}