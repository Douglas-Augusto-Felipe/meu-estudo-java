/*
 * Simulação do uso da classe MSNMessenger
 */

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido = "tgl";

        if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
        smi = new FacebookMessenger();
        else if (appEscolhido.equals("tgl"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
