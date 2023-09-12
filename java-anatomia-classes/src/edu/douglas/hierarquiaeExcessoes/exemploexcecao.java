package douglas.hierarquiaeExcessoes;

import static java.text.NumberFormat.getInstance;

import java.text.ParseException;

public class exemploexcecao {
    public static void main(String[] args) {

        Number valor;
        try {
            valor = getInstance().parse("a1.75");
             System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
    }
}
