package douglas.ProjetoContador;

public class NewProjects {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2900.0);
        analisarCandidato(2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase = salarioPretendido)
            System.out.println("LIGAR PARA O CANDITADO, COM CONTRA PROPOSTA");

        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

    }
}
