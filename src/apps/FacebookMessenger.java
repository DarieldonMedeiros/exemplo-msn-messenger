package apps;

// Classe que herda métodos via herança
public class FacebookMessenger extends ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Eviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens no Facebook Messenger");
    }
}
