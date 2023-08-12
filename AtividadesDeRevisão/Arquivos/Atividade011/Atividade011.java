package AtividadesDeRevisão.Arquivos.Atividade011;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Atividade011 {
    /*
     * 11 - Refaça o exercício 08, adicionando a capacidade de ler várias datas de
     * um arquivo texto. O arquivo conterá, em
     * sua primeira linha, o número de datas das linhas seguintes. Por exemplo,
     * 4
     * 12/02/2013
     * 14/11/2019
     * 31/04/2020
     * 26/01/2021
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\AlexG\\OneDrive\\\u00C1rea de Trabalho\\3\u00B0Periodo\\Programa\u00E7\u00E3o Orientada a Objeto (POO)\\AtividadesDeRevis\u00E3o\\Arquivos\\Atividade011\\Arq,txt";
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
            String qtdDeDatasParaLer = leitor.readLine();
            int qtdDeDatas = Integer.parseInt(qtdDeDatasParaLer);

            for (int i = 0; i < qtdDeDatas; i++) {
                String data = leitor.readLine();
                VerificarData(data);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void VerificarData(String data) {
        int dias[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] dataSeparada = data.split("/");

        int mes = Integer.parseInt(dataSeparada[1]);
        int dia = Integer.parseInt(dataSeparada[0]);
        int ano = Integer.parseInt(dataSeparada[2]);
        if (mes <= 12 && dia <= dias[mes] && ano > 0) {
            System.out.println("A data: " + dia + "/" + mes + "/" + ano + " é válida");

        } else {
            System.out.print("A data: " + dia + "/" + mes + "/" + ano + " é inválida por conta do: ");
            if (mes > 12) {
                System.out.print("Mês ");
                System.out.println();
            } else if (dia > dias[mes]) {
                System.out.print("Dia ");
                System.out.println();
            } else {
                System.out.print("Ano inválido ");
                System.out.println();
            }
        }

    }

}
