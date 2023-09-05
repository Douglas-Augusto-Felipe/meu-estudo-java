package douglas.ExemploFor;

public class ExemploForStrings {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // for (int x = 0; x < alunos.length; x++){
        // System.out.println("O aluno no indice x = " + x +" é " + alunos[x]);
        // }

        // USANDO O FOR EACH
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
