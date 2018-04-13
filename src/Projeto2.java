


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Projeto2 implements FormatoAudio{

    /**
     * @param args the command line arguments
     */
  
    private String extension = null;
    private Projeto2 file;
    
    @Override
    public void abrir(String s) {
       
            String[] formato = s.split(".");
            extension = formato[formato.length-1];
       
        switch(extension){
            case "aiff": 
               
            break;
            
            case "wma": 
                
            break;
            
            case "wav": 
                
            break;
        }
    }

    @Override
    public void reproduzir() {
        
        
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancar(int segundos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retomar(int segundos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void liberar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
