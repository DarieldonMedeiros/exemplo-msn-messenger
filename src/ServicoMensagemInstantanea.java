// Classe que tem os métodos que vão ser utilizados pelas classes filhas (Herança)
public abstract class ServicoMensagemInstantanea {
// Com abstração, a classe não sabe mais como os métodos serão implementados nas classes filhas
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    // Métodos abstratos não possuem corpo
}
