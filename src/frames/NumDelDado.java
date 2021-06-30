/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class NumDelDado {
    
    
    private ImageIcon icono;
    private ImageIcon iconoFinal;
    
    public ImageIcon gifDado(){    
        icono = new javax.swing.ImageIcon(getClass().getResource("/imagenes/dados1.gif"));         
        return icono;
    }
    
    public ImageIcon dadoResultante(int dado){
        switch(dado){
            case 1: 
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"));
                break;
            case 2:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"));
                break;
            case 3:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"));
                break;
            case 4:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png"));
                break;
            case 5:
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/5.png"));
                break;
            case 6:    
                iconoFinal=new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.png"));
                break;
        }
        return iconoFinal;
    }
}
