// Classe que herda métodos via herança
public class FacebookMessenger extends ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    @Override
    public void enviarMensagem(){
        System.out.println("Eviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
