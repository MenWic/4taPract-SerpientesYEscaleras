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
public class LoadPlayerBinario {
    public ArrayList<Player> cargarPlayerBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Player> players = new ArrayList<>();//indicamos un array list de pasaporte para leer los archivos
        String[] archivos = SavePlayerBinario.ARCHIVOUSUARIO.list();
        ObjectInputStream leerArchivo;//leemos el archivo
        
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(SavePlayerBinario.ARCHIVOUSUARIO+"/"+archivo));
            Player player =((Player)leerArchivo.readObject());//leemos el objeto y lo casteamos a Usuario
            players.add(player);//añadimos un usuario
            leerArchivo.close();//cerramos el lector
        }
        return players;
    }
}
