package AtividadesDeRevisão.Arquivos.Atividade010;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Atividade010 {
    /*
     * 10 - Refaça o exercício 02, sendo que os dados serão lidos de um arquivo
     * texto. O arquivo texto pode ter várias linhas
     * e cada linha representa um vetor a ser utilizado pelo método. O separador
     * usado é ponto e vírgula. Por exemplo:
     * 4;8;15;4;15;16;23;42;7;11;13;17;29;23;29;31;6;5;4;3;2;1
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\AlexG\\OneDrive\\Área de Trabalho\\3°Periodo\\Programação Orientada a Objeto (POO)\\AtividadesDeRevisão\\Arquivos\\Arq.txt";
        File file = new File(path);
        try {
            Leitura(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void Leitura(File arquivo) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo));) {
            String[] numerosDoVetor = leitor.readLine().split(";");

            int vetorInt[] = TransformarEmVetorDeInt(numerosDoVetor);
            SomarVizinho(vetorInt);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static int[] TransformarEmVetorDeInt(String[] numerosDoVetorEmString) {
        int[] vetorDeInt = new int[numerosDoVetorEmString.length];
        for (int i = 0; i < vetorDeInt.length; i++) {
            vetorDeInt[i] = Integer.parseInt(numerosDoVetorEmString[i]);
        }
        return vetorDeInt;
    }

    public static void SomarVizinho(int[] vetor) {
        if (vetor.length % 2 != 0) {
            int vetorNovo[] = new int[vetor.length + 1];
            for (int i = 0; i < vetor.length; i++) {
                vetorNovo[i] = vetor[i];
            }
            System.out.println("Vetor somado");
            vetorNovo[vetorNovo.length - 1] = vetor[vetor.length - 1];
            int vetorSomado[] = new int[vetorNovo.length / 2];
            int j = 1;
            int k = 0;
            for (int i = 0; i < vetorSomado.length; i++) {
                vetorSomado[i] = vetorNovo[k] + vetorNovo[j];
                j = j + 2;
                k = k + 2;
                System.out.print(vetorSomado[i] + "-");
            }

        } else {
            System.out.println("Vetor somado");

            int vetorSomado[] = new int[vetor.length / 2];
            int j = 1;
            int k = 0;
            for (int i = 0; i < vetorSomado.length; i++) {
                vetorSomado[i] = vetor[k] + vetor[j];
                j = j + 2;
                k = k + 2;
                System.out.print(vetorSomado[i] + "-");
            }
        }

    }
}
