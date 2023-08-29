package edu.douglas.segundasemana;
public class MinhasClasse {
    
    public static void main (String [] args){
        String primeiroNome = "Douglas";
        String segundoNome = "Augusto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
