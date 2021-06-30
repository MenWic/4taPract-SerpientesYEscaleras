package players;

import frames.JFramePrincipal;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Luis
 */
public class CrearTablero {
    //Variables globales de la clase
    private static Tablero tablero; //Tablero como tal
    private static JPanel[][] tableroPanel; //Es un panel que contendrá a varias fichas en una casilla para no sobreponer imagen sobre imagen
    
    //Constructor de tablero general
    public CrearTablero(Tablero tablero){
        this.tablero=tablero;
    }

    public static Tablero getTablero() {
        return tablero;
    }

    public static JPanel[][] getTableroPanel() {
        return tableroPanel;
    }
    /**
     * Metodo que constuye un tablero a partir de los lineamientos 
     * para tablero brindados con el archivo de texto que se leera
     */
    //Constructor de TableroPanel (un tablero hecho de casillas de tipo  JPanel)
    public static  void construirTableroPanel(){
        //Variables para coordenadas y tamaño del TableroPanel
        int x=10;
        int y=10;
        int pos=0;
        tableroPanel=new JPanel[tablero.getFilas()][tablero.getColumnas()];
        
        //Ciclo de creacion de casillas del tablero que estan creando
        for(int i=0;i<tablero.getFilas();i++){
            for(int j=0;j<tablero.getColumnas();j++){
                tableroPanel[i][j]=new JPanel();
                tableroPanel[i][j].setBounds(x,y,100,100); //110, 110
                JFramePrincipal.jPanelPrincipal.add(tableroPanel[i][j]);
                tableroPanel[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                tableroPanel[i][j].setOpaque(true);
                tableroPanel[i][j].setBackground(Color.MAGENTA);
                if(i==0 &&j==0){
                    tableroPanel[0][0].add(new JLabel(" META ")); //Casilla final
                } 
                else if ((i+1)==tablero.getFilas() && (j+1)==tablero.getColumnas()){ 
                    tableroPanel[i][j].add(new JLabel(" START ")); //Casilla de inicio
                } 
                else {
                    tableroPanel[i][j].add(new JLabel(tablero.getColumnas()*tablero.getFilas()-j-pos+""));
                }
                tableroPanel[i][j].setVisible(true);
                x+=100; //110
            }
            pos+=tablero.getColumnas();
            x=10;
            y+=100; //110
        }
        JFramePrincipal.jugarjButton.setEnabled(false);
    }
}
