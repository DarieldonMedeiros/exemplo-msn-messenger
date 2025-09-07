// Classe que herda métodos via herança
public class MSNMessenger extends ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    @Override
    public void enviarMensagem(){
        System.out.println("Eviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
