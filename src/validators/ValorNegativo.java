package validators;

import javax.swing.JOptionPane;

public class ValorNegativo extends Exception{
    
    private Number valor;

    public ValorNegativo(Number valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        //JOptionPane.showMessageDialog(null, "Digte um valor positivo para conversão");
        return "Digte um valor positivo para conversão";
    }
    
    
    
}
