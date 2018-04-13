/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class WMAObject extends Projeto2 implements FormatoAudio {

    private wmaPlay wma;
    private int segundoAtual = 0;
    
    @Override
    public void abrir(String caminho) {
        this.wma = new wmaPlay();
        this.wma.setFile(caminho);
        this.wma.open();
    }
    
    @Override
    public void reproduzir() {
        this.wma.setLocation(this.segundoAtual);
        this.wma.play();
    }
    
    @Override
    public void pausar() {
        this.segundoAtual = this.wma.getLocation();
        this.wma.stop();
    }
    
    @Override
    public void parar() {
        this.wma.stop();
    }
    
    @Override
    public void avancar(int segundos) {
        this.pausar();
        this.segundoAtual += segundos;
        this.wma.play();
    }
    
    @Override
    public void retomar(int segundos) {
        this.pausar();
        this.segundoAtual -= segundos;
        this.wma.play();
    }
    
    @Override
    public void liberar() {
        this.wma.stop();
        this.wma.setFile(null);
    }
    
}
