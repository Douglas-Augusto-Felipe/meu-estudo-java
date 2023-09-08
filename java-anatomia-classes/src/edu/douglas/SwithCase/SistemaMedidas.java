package douglas.SwithCase;

public class SistemaMedidas {
    // mODO IF/ELSE
    // public static void main(String[] args) {
    // String sigla = "M";

    // if (sigla == "P")
    // System.out.println("PEQUENO");
    // else if (sigla == "M")
    // System.out.println("MÉDIO");
    // else if (sigla == "G")
    // System.out.println("GRANDE");
    // else
    // System.out.println("INDEFINIDO");

    // }
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

    }

}
