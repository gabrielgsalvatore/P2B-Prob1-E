/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class WAVObject extends Projeto2 implements FormatoAudio {

    private WAVPlayer wav;
    
    @Override
    public void abrir(String caminho) {
        this.wav = new WAVPlayer(caminho);
    }
    
    @Override
    public void reproduzir() {
        this.wav.play();
    }
    
    @Override
    public void pausar() {
        this.wav.stop();
    }
    
    @Override
    public void parar() {
        this.pausar();
        int ms = this.wav.forward(0);
        this.wav.reward(ms);
    }
    
    @Override
    public void avancar(int segundos) {
        this.wav.forward(segundos * 1000);
    }
    
    @Override
    public void retomar(int segundos) {
        this.wav.reward(segundos * 1000);
    }
    
    @Override
    public void liberar() {
        this.wav = null;
    }
    
}
