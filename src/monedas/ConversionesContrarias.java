
package monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author lupit
 */
public class ConversionesContrarias {
    
    public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 16.67;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicanos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 18.37;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 21.42;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicanos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.013;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicanos");
	}
}
