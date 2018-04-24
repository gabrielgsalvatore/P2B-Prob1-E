
/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class AACAdapter implements FormatoAudio {
   
    private AACPlayer aac;
    private int segundoAtual = 0;
    
    public void abrir(String caminho) {
        this.aac = new AACPlayer(caminho);
    }
    
    public void reproduzir() {
        this.aac.play();
    }
    
    public void pausar() {
        this.aac.stop();
        this.segundoAtual = this.aac.getLocation();
    }
    
    public void parar() {
        this.aac.stop();
        this.aac.stop();
    }
    
    public void avancar(int segundos) {
        this.segundoAtual = this.aac.getLocation() + segundos;
        this.aac.setLocation(this.segundoAtual);
    }
    
    public void retomar(int segundos) {
        this.segundoAtual = this.aac.getLocation() - segundos;
        this.aac.setLocation(this.segundoAtual);
    }
    
    public void liberar() {
        this.aac.stop();
        this.aac = null;
    }
    
    public void reproduzirSimples(String caminho) throws ExtensaoNaoSuportada {
        this.abrir(caminho);
        this.reproduzir();
    }
    
    public void pararSimples() {
        this.parar();
        this.liberar();
    }
    
}
