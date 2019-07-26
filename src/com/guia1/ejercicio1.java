/*
 *Nombre de la clase: ejercicio1
 *Fecha:23  de julio del 2019
 *Version:1.0
 *copyright: Itca-Fepade
 *@autor: Douglas Menjivar Quiterio
 */
package com.guia1;

import java.text.DecimalFormat;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Administrador
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        
        double radio;
        double area;
        double diametro;
        
        DecimalFormat dc = new DecimalFormat("#.##");
        int seleccion = JOptionPane.showOptionDialog(null, "seleccione una opcion", "selector de opciones", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,
            new Object[]{"area", "diametro"},"opcion 1");
        
        if (seleccion == 0)
        {
            radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
            area = (Math.PI * Math.pow(radio,2));
            
            JOptionPane.showMessageDialog(null, "el area es: " + dc.format(area));
            
        }else{
            radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
            diametro = (radio *2);
            
            JOptionPane.showMessageDialog(null, "el area es: " + dc.format(diametro));
        }

       
        
    }
}
