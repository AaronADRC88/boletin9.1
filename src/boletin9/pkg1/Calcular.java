
package boletin9.pkg1;

import javax.swing.JOptionPane;

public class Calcular {
public Calcular(){
    }
    private float numeros;
    private int positivo,negativo,cero;
    public void pedirNumeros(){
    for (int contador=0;contador<=10;contador++){
        String dato=JOptionPane.showInputDialog("introduce nº:");
        float numero=Float.parseFloat(dato);
       if(numero>0){
            JOptionPane.showMessageDialog(null, "+");
            positivo++;
        }
        else{
            if (numero==0){
            JOptionPane.showMessageDialog(null, "0");
            cero++;
        }
            else {
            JOptionPane.showMessageDialog(null, "-");
            negativo++;
        }
      }
    JOptionPane.showMessageDialog(null,"+="+positivo+"\n"+"-="+negativo+"\n"+"0="+cero);
}


  }
}
