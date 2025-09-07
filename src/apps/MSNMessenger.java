package apps;

// Classe que herda métodos via herança
public class MSNMessenger extends ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Eviando mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens no MSN Messenger");
    }

}
