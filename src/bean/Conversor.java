package bean;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMBinOp;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validators.ParametrosInvalidos;

public class Conversor {
    
    private String from;
    private String to;
    private Number valor;
    private String data;
    
    public BigDecimal currencyQuotation(String from,String to, Number valor,String data) {
        
        
            
            try {
                if(from.equals(to)){
                    //JOptionPane.showMessageDialog(null, "Aqui2");
                    //throw new ParametrosInvalidos(from,to);
                }
                else{
                    throw new ParametrosInvalidos(from,to);  
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Verifique os parametros de moedas selecionados.");
            }
            
        
        return null;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
