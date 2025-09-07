public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("Telegram");
        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
