/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public interface FormatoAudio {
    
    public void abrir(String caminho) throws ExtensaoNaoSuportada;
    public void reproduzir();
    public void pausar();
    public void parar();
    public void avancar(int segundos);
    public void retomar(int segundos);
    public void liberar();
    
}
