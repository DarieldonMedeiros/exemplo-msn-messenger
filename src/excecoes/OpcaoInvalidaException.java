package excecoes;

/**
 * Exceção lançada quando os parâmetros de entrada são inválidos para a seleção do Messenger
 * <p>
 * Situação típica: quando a opção escolhida for diferente de 1, 2 ou 3
 */
public class OpcaoInvalidaException extends NullPointerException{
    private static final String MENSAGEM_PADRAO = "Parâmetros Inválidos: A opção escolhida é diferente de 1, 2 ou 3";

    /**
     * Cria uma nova exceção com a mensagem padrão.
     */
    public OpcaoInvalidaException(){
        super(MENSAGEM_PADRAO);
    }

    /**
     * Cria uma nova exceção com uma mensagem personalizada.
     *
     * @param mensagem mensagem descritiva do erro
     */
    public OpcaoInvalidaException(String mensagem){
        super(mensagem);
    }
}
