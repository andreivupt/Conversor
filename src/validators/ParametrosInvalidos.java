package validators;

import javax.swing.JOptionPane;

public class ParametrosInvalidos extends Exception{
    
    private String from;
    private String to;

    public ParametrosInvalidos(String from, String to) {
        super();
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
         JOptionPane.showMessageDialog(null,"Verifique os parametros de moedas selecionados.");
         return "Verifique os parametros de moedas selecionados.";
    }  
    
}
