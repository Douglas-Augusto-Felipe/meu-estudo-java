package douglas.caixaeletronico;


// CaixaEletronico.java
public class caixaeletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 35.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}