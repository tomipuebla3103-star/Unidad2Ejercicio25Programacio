import java.util.ArrayList;

public class GestorAlerta {
    private NotificadorEmail email;
    private NotificadorSMS sms;
    private NotificadorPush push;

    public GestorAlerta() {
        email = new NotificadorEmail();
        sms = new NotificadorSMS();
        push = new NotificadorPush();
    }

    public void difundirMensaje(String destinatario, String mensaje) {
        email.enviar(destinatario, mensaje);
        sms.enviar(destinatario, mensaje);
        push.enviar(destinatario, mensaje);
    }
}
