/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class ExtensaoNaoSuportada extends Exception {

    public ExtensaoNaoSuportada() {
    }

    public ExtensaoNaoSuportada(String message) {
        super(message);
    }

    public ExtensaoNaoSuportada(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtensaoNaoSuportada(Throwable cause) {
        super(cause);
    }

    public ExtensaoNaoSuportada(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
