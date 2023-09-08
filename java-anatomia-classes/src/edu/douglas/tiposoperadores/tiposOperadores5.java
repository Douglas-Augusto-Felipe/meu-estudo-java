package douglas.tiposoperadores;

public class tiposOperadores5 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        

        // System.out.println("numero1 é igual a numero2? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numero1 é diferente a numero2? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numero1 é maior a numero2? " + simNao);
        if (numero1 > numero2) {
            System.out.print("Numero 1 maior que numero 2");
        }
        if (numero1 < numero2) {
            System.out.print("Numero 1 menor que numero 2");
        }
        if (numero1 >= numero2) {
            System.out.print("Numero 1 maior ou igual que numero 2");
        }
        if (numero1 <= numero2){
            System.out.print("Numero 1 menor ou igual que numero 2");
        }
        if (numero1 != numero2){
            System.out.print("Numero 1 é diferente de numero 2");
        }
    }
}
