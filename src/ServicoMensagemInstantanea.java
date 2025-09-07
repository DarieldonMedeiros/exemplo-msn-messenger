// Classe que tem os métodos que vão ser utilizados pelas classes filhas (Herança)
public class ServicoMensagemInstantanea {
    // Encapsulamento aplicado
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Eviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
