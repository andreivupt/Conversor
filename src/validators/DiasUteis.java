package validators;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class DiasUteis extends Exception{
    
    
    public DiasUteis(String data, Calendar dt, SimpleDateFormat sdf) {
        
        //DOMINGO
        if(dt.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            JOptionPane.showMessageDialog(null, "Data indisponível!");
        }
        //Defini dia útil anterior de sabado
        else if(dt.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            dt.add(Calendar.DATE, -1);
            JOptionPane.showMessageDialog(null, "Data informada indisponível!\n"
                    + "A cotação será realizada do dia "+sdf.format(dt.getTime()));
        }
    }

    /*@Override
    public String toString() {
    return "DiasUteis{" + '}';
    }*/
    
    
}
