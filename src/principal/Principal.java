
package principal;

import javax.swing.JOptionPane;
import monedas.Conversor;
import temperatura.ConvertirTemperatura;

/**
 *
 * @author lupit
 */
public class Principal {

    public static void main(String[] args) {
        
        Conversor monedas = new Conversor();
        ConvertirTemperatura temperatura = new ConvertirTemperatura();
        
   while(true){
   String opc = "";
        try{
            opc = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión: ","Menú",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moneda","Conversor de temperatura"},"Seleccion")).toString();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Programa terminado");
            System.exit(0);
        }
    switch(opc){
        case "Conversor de moneda":
            String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a convertir: ");
            if(ValidarNumero(input) == true){
                double input2 = Double.parseDouble(input);
                monedas.ConvertirMonedas(input2);
                
                int respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                 if (JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opcion afirmativa");
                     }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                       System.exit(0);
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;
                        
        case "Conversor de temperatura":
            input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
             if(ValidarNumero(input) == true) {
                 double Minput = Double.parseDouble(input);
                 temperatura.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");
                    System.exit(0);
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
             
        }                
    }
    }        
    
    
      public static boolean ValidarNumero(String numero){
        try {
            double x = Double.parseDouble(numero);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
    
 }
    
  
    
    

