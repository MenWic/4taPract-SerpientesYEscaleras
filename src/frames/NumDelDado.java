package frames;

import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class NumDelDado {
    
    
    private ImageIcon icono;
    private ImageIcon iconoFinal;
    
    /**
        *Funcion gifDado
        *animacion de dado gif, unicamnete utilizado  para mostrar animacion del dado
    */
    //Metodo que devuelve variable icono que se llama al presionar el JButton de tirar dado en JFramePrincipal
    public ImageIcon gifDado(){    
        icono = new javax.swing.ImageIcon(getClass().getResource("/imagenes/dados1.gif"));         
        return icono; //Retorna 
    }
    
    //Metodo para obtener y mostrar una imagen segun sea el numero obtenido por el metodo obtenerNum 
    // guardado en la variable Valor, de la clase Dado
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
