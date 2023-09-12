package douglas.desafioJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class testes {

    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        // Entrada dos tipos de ativos
        int quantidadeAtivos = teste.nextInt();
        teste.nextLine();

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = teste.nextLine();
            ativos.add(codigoAtivo);
        }

        // TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        // TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        System.out.println(ativos);
    }
}
