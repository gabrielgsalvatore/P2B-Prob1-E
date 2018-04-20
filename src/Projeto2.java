
import java.util.regex.Pattern;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novaes
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class Projeto2 implements FormatoAudio{

    private Projeto2 arquivo;
    
    @Override
    public void abrir(String caminho) throws ExtensaoNaoSuportada {
        String extensao = caminho.split(Pattern.quote("."))[caminho.split(Pattern.quote(".")).length - 1];
        
        switch (extensao) {
            case "aiff":
                this.arquivo = new AIFFObject();
                break;
            case "wma":
                this.arquivo = new WMAObject();
                break;
            case "wav":
                this.arquivo = new WAVObject();
                break;
            default:
                throw new ExtensaoNaoSuportada(extensao);
                
        }
        this.arquivo.abrir(caminho);
    }

    @Override
    public void reproduzir() {
        this.arquivo.reproduzir();
    }

    @Override
    public void pausar() {
        this.arquivo.pausar();
    }

    @Override
    public void parar() {
        this.arquivo.parar();
    }

    @Override
    public void avancar(int segundos) {
        this.arquivo.avancar(segundos);
    }

    @Override
    public void retomar(int segundos) {
        this.arquivo.retomar(segundos);
    }

    @Override
    public void liberar() {
        this.arquivo.liberar();
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
