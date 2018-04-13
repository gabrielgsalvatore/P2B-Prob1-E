/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gabri
 */
public interface FormatoAudio {
    
    public void abrir(String s);
    public void reproduzir();
    public void pausar();
    public void parar();
    public void avancar(int segundos);
    public void retomar(int segundos);
    public void liberar();
    
    
    
}
