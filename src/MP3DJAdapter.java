/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class MP3DJAdapter implements FormatoAudio {
    
    private MP3DJ mp3;
    
    public void abrir(String caminho) {
        this.mp3 = new MP3DJ();
        this.mp3.setFile(caminho);
    }
    
    public void reproduzir() {
        this.mp3.play();
    }
    
    public void pausar() {
        this.mp3.stop();
    }
    
    public void parar() {
        this.mp3.stop();
    }
    
    public void avancar(int segundos) {
        this.mp3.forward(segundos);
    }
    
    public void retomar(int segundos) {
        this.mp3.reward(segundos);
    }
    
    public void liberar() {
        this.mp3.stop();
        this.mp3 = null;
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
