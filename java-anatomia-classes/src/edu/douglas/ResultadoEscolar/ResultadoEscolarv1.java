package douglas.ResultadoEscolar;

public class ResultadoEscolarv1 {
    public static void main(String[] args) {

        int nota = 3;

        // if(nota >= 7)
        // System.out.println("Aprovado");

        // else if( nota >= 5 && nota <7) // sempre tem que retornar true ou false
        // System.out.println("Prova Recuperação");

        // else
        // System.out.println("Reprovado");

        // Refatorando o codigo a cima
        String resultado = nota >= 7 ? "Aprovado" : nota >5 && nota <7 ? "Prova de Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
