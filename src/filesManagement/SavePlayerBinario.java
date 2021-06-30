package filesManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import players.Player;
/**
 *
 * @author Luis
 */
public class SavePlayerBinario {
    //Constante Estática global de la clase
    public static final File ARCHIVOUSUARIO = new File("Jugadores");
    
    public void guardarPlayer(ArrayList<Player> players) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;
        ObjectOutputStream objetoSalida;
        
        for (Player player : players) {//Se indica el recorrido de un pasaporte, tipo de archivo definido
            archivoSalida = new FileOutputStream(ARCHIVOUSUARIO+"/"+player.getNombre());//Nombre del archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicación de archivo donde estará
            objetoSalida.writeObject(player);//Lector del objeto
            objetoSalida.close();//cerrar el objeto de salida
        }
    }
    
    public static void tablaPlayers(ArrayList<Player> players,JTable tabla){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Partidas Jugadas");
        modeloTabla.addColumn("Partidas Ganadas");
        modeloTabla.addColumn("Partidas Perdidas");
        
        for (Player player: players) {
            modeloTabla.addRow(new Object[]{player.getId(),player.getNombre(),player.getApellido(),player.getPartJugadas(),player.getPartGanadas(),player.getPartPerdidas()});
        }
    }
}
