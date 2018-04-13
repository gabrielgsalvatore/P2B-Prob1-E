/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class AIFFObject extends Projeto2 implements FormatoAudio{
    
    private AIFFSuperPlayer aiff;
    
    @Override
    public void abrir(String caminho) {
        this.aiff = new AIFFSuperPlayer(caminho);
    }

    @Override
    public void reproduzir() {
        this.aiff.play();
    }

    @Override
    public void pausar() {
        this.aiff.pause();
    }

    @Override
    public void parar() {
        this.aiff.stop();
    }

    @Override
    public void avancar(int segundos) {
        int segundoAtual = this.aiff.pause();
        this.aiff.setCursor(segundoAtual + segundos);
        this.aiff.play();
    }

    @Override
    public void retomar(int segundos) {
        int segundoAtual = this.aiff.pause();
        this.aiff.setCursor(segundoAtual - segundos);
        this.aiff.play();
    }

    @Override
    public void liberar() {
        this.aiff.release();
    }
    
}
