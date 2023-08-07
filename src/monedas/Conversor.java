
package monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author lupit
 */
public class Conversor {
        ConvertirMonedas monedas = new ConvertirMonedas();
	ConversionesContrarias pesos = new ConversionesContrarias();
	
    public void ConvertirMonedas(double input2) {
        
        String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosADolares(input2);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(input2);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(input2);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(input2);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(input2);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesos(input2);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(input2);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(input2);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(input2);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(input2);
            break;
        }       
    }
}
