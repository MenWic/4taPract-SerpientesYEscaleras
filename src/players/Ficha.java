package players;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Luis
 */
public class Ficha {
    //Variables globales de clase
    private ImageIcon colorAmarillo;
    private ImageIcon colorAzul;
    private ImageIcon colorNaranja;
    private ImageIcon colorNegro;
    private ImageIcon colorBlanco;
    private ImageIcon colorRojo;
    
    private static JLabel fichaAmarilla;
    private static JLabel fichaRoja;
    private static JLabel fichaNegra;
    private static JLabel fichaNaranja;
    private static JLabel fichaBlanca;
    private static JLabel fichaAzul;
    
    //Constructor de fichas para tablero
    public Ficha(){
        fichaAmarilla();
        fichaAzul();
        fichaBlanca();
        fichaNaranja();
        fichaNegra();
        fichaRoja();
    }
    /**
     * Funcion ficha Amarilla: retorna el label amarillo
     * @return 
     */
        //Constructor Ficha Amarilla
    public JLabel fichaAmarilla(){
        colorAmarillo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/amarillo.png"));
        fichaAmarilla=new JLabel(colorAmarillo);
        fichaAmarilla.setIcon(colorAmarillo);
        return fichaAmarilla;
    }
    
    /**
     * Funcion ficha Roja: retorna el label rojo
     * @return 
     */
    //Constructor Ficha Roja
    public JLabel fichaRoja(){
        colorRojo=new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo.png"));
        fichaRoja=new JLabel(colorRojo);
        fichaRoja.setIcon(colorRojo);
        fichaRoja.setVisible(true);
        return fichaRoja;
    }
    
    /**
     * Funcion ficha Negra: retorna el label negro
     * @return 
     */
    //Constructor Ficha Negra
    public JLabel fichaNegra(){
        colorNegro=new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro.png"));
        fichaNegra=new JLabel(colorNegro);
        fichaNegra.setIcon(colorNegro);
        return fichaNegra;
    }
    
    /**
     * Funcion ficha Naranja: retorna el label naranja
     * @return 
     */
    //Constructor Ficha Anaranjada
    public JLabel fichaNaranja(){
        colorNaranja=new javax.swing.ImageIcon(getClass().getResource("/imagenes/naranja.png"));
        fichaNaranja=new JLabel(colorNaranja);
        fichaNaranja.setIcon(colorNaranja);
        return fichaNaranja;
    }
    
    /**
     * Funcion ficha Blanca: retorna el label blanco
     * @return 
     */
    //Constructor Ficha Blanca
    public JLabel fichaBlanca(){
        colorBlanco=new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"));
        fichaBlanca=new JLabel(colorBlanco);
        fichaBlanca.setIcon(colorBlanco);
        return fichaBlanca;
    }
    
    /**
     * Funcion ficha Azul: retorna el label azul
     * @return 
     */
    //Constructor Ficha Azul
    public JLabel fichaAzul(){
        colorAzul=new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul.png"));
        fichaAzul=new JLabel(colorAzul);
        fichaAzul.setIcon(colorAzul);
        return fichaAzul;
    }

    //Getters de Label's Ficha que iran dentro de un panel contenido en las 
    //casillas del array del tablero para cuando esten todas las fichas en una casilla
    public static JLabel getFichaAmarilla() {
        return fichaAmarilla;
    }
    public static JLabel getFichaRoja() {
        return fichaRoja;
    }
    public static JLabel getFichaNegra() {
        return fichaNegra;
    }
    public static JLabel getFichaNaranja() {
        return fichaNaranja;
    }
    public static JLabel getFichaBlanca() {
        return fichaBlanca;
    }
    public static JLabel getFichaAzul() {
        return fichaAzul;
    }
}
