package douglas.desafioJava;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in); cria um leitor de entradas, com métodos úteis com prefixo "next";
// - System.out.println(): imprime um texto de saída(output) e pulando uma linha.
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        // Lê os valores de entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBaneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        // TODO criar as demais condições para as aliquotas de 10.00% e 15.00%.

        // Calcula e Imprime a saida (com 3 casas decimais):
        float saida = valorSalario - valorImposto + valorBaneficios;

        System.out.println(String.format("%.2F", saida));
    }
}
