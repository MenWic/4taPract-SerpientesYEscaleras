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
    //Constante Estática global de la clase que indica un nuevo archivo en la carpeta Jugadores\
    public static final File ARCHIVOUSUARIO = new File("Jugadores");
    
    /**
     * metodo guardarPlayer
     * @param players acepta un arrayList de players y los guarda en archivos binario
     * @throws IOException
     * @throws FileNotFoundException 
     */
    //Metodo para guardar players en carpeta Jugadores
    public void guardarPlayer(ArrayList<Player> players) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;
        ObjectOutputStream objetoSalida;
        
        for (Player player : players) {//Recorrido de pasaporte, tipo de archivo ya definido
            archivoSalida = new FileOutputStream(ARCHIVOUSUARIO+"/"+player.getNombre());//Nombre del archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//Indicación de localizacion del archivo
            objetoSalida.writeObject(player);//Lector del objeto de tipo Player
            objetoSalida.close();//Cierre del objeto de salida
        }
    }
    /**
     * MetodoTablaPlayers
     * @param players recibe a los jugadores leidos/recibidos de los archivos binarios guardados
     * @param tabla muestra a los players en una tabla de la ventana de reportes que esta en la 
     * opcon superior de JFramePrincipal
     */
    public static void tablaPlayers(ArrayList<Player> players,JTable tabla){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Partidas Jugadas");
        modeloTabla.addColumn("Partidas Ganadas");
        modeloTabla.addColumn("Partidas Perdidas");
        
        //Metodo para llenar la tabla con los players registrados previamente
        for (Player player: players) {
            modeloTabla.addRow(new Object[]{player.getId(),player.getNombre(),player.getApellido(),player.getPartJugadas(),player.getPartGanadas(),player.getPartPerdidas()});
        }
    }
}
