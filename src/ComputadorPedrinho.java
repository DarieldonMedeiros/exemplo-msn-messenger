import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;
import excecoes.OpcaoInvalidaException;

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args)  throws OpcaoInvalidaException{
        Scanner scanner = new Scanner(System.in);
        ServicoMensagemInstantanea servico;
        /*
          Não se sabe qual aplicativo, mas qualquer um deverá enviar e receber mensagem
        */
        System.out.println("Digite qual opção será escolhida: ");
        System.out.println("1. MSN Messenger");
        System.out.println("2. Facebook Messenger");
        System.out.println("3. Telegram Messenger");
        int appEscolhido = scanner.nextInt();

        servico = switch(appEscolhido){
            case 1 -> new MSNMessenger();
            case 2 -> new FacebookMessenger();
            case 3 -> new TelegramMessenger();
            default -> throw new OpcaoInvalidaException();
        };

        servico.enviarMensagem();
        servico.receberMensagem();

        scanner.close();
    }
}
