package filesManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import players.Player;
/**
 *
 * @author Luis
 */

/**
     * Metdodo cargarPlayerBinario: carga los archivos binarios guardados en carpeta Jugadores
     * @return return ArrayList que contiene jugadores
     * @throws FileNotFoundException  
     * @throws IOException
     * @throws ClassNotFoundException 
     * <- Excepciones empleadas
     */
public class LoadPlayerBinario {
    //ArrayList que contiene objetos de tipo Player
    public ArrayList<Player> cargarPlayerBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Player> players = new ArrayList<>();//indicamos un array list de pasaporte para leer los archivos
        String[] archivos = SavePlayerBinario.ARCHIVOUSUARIO.list();
        ObjectInputStream leerArchivo;//leemos el archivo
        
        //Ciclo de recorrido para cargar jugador
        for (int i = 0; i < archivos.length; i++) {//Rrcorrido for para ir hasta la capacidad de binarios que posea
            String archivo = archivos[i];//Variable que aumenta el contador cuando se cargra un archivo 
            leerArchivo = new ObjectInputStream(new FileInputStream(SavePlayerBinario.ARCHIVOUSUARIO+"/"+archivo));
            Player player =((Player)leerArchivo.readObject());//Lectura del objeto y casteo al jugador
            players.add(player);//Añadir un jugador
            leerArchivo.close();//cerrar el lector
        }
        return players;
    }
}
