package AtividadeUML.Parte2;

public class Partida {
    String nomeEquipe1; // Nome da equipe 1
    String nomeEquipe2; // Nome da equipe 2
    int[] pontosEquipe1; // Guardar os pontos do time 1
    int[] pontosEquipe2; // Guardar pontos do time 2
    int totais[];

    // Construtor da classe

    public Partida(String nomeEquipe1, String nomeEquipe2) {
        this.nomeEquipe1 = nomeEquipe1;
        this.nomeEquipe2 = nomeEquipe2;
        pontosEquipe1 = new int[4];
        pontosEquipe2 = new int[4];
        totais = new int[2];
    }

    public int[] somatoriaDosPontos(int[] pontosEquipe1, int[] pontosEquipe2) {

        int totalEquipe1 = 0;
        int totalEquipe2 = 0;
        for (int i = 0; i < pontosEquipe1.length; i++) {
            totalEquipe1 = totalEquipe1 + pontosEquipe1[i];
            totalEquipe2 = totalEquipe2 + pontosEquipe2[i];
        }
        this.totais[0] = totalEquipe1;
        this.totais[1] = totalEquipe2;
        return totais;

    }

    public Boolean verificarSeTemVencedor() {
        if (this.totais[0] == this.totais[1]) {
            return false;
        } else {
            return true;
        }
    }

    public String formatarPlacar(String placarAGerar, String elemento) {
        placarAGerar += elemento + "\t";
        return placarAGerar;
    }

    public void implementarTotal(int elemento, int time) {
        totais[time] += elemento;
    }
}
