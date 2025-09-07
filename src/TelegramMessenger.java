// Classe que herda métodos via herança
public class TelegramMessenger extends ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    @Override
    public void enviarMensagem(){
        System.out.println("Eviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
