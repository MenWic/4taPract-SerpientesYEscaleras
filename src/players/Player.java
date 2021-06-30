package players;

import java.io.Serializable;
/**
 *
 * @author Luis
 */
public class Player implements Serializable{
    //Variables globales de clase
    private String nombre;
    private String apellido;
    private int id;
    private int partJugadas;
    private int partGanadas;
    private int partPerdidas;
   
    //Constructor de Player's
    public Player(String nombre, String apellido, int id, int partJugadas, int partGanadas, int partPerdidas) {
        //Inicialización con referencia "this"
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.partJugadas = partJugadas;
        this.partGanadas = partGanadas;
        this.partPerdidas = partPerdidas;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartJugadas() {
        return partJugadas;
    }

    public void setPartJugadas(int partidasJugadas) {
        this.partJugadas = partidasJugadas;
    }

    public int getPartGanadas() {
        return partGanadas;
    }

    public void setPartGanadas(int partidasGanadas) {
        this.partGanadas = partidasGanadas;
    }

    public int getPartPerdidas() {
        return partPerdidas;
    }

    public void setPartPerdidas(int partidasPerdidas) {
        this.partPerdidas = partidasPerdidas;
    }
    
    //Sobreescribir Metodo toString
    @Override
    public String toString() {
        return "Usuario{" + "Nombre = " + nombre + ", Apellido = " + apellido + ", ID = " + id + ", Psrtidas Jugadas = " + partJugadas + ", Partidas Ganadas = " + partGanadas + ", Partidas Perdidas = " + partPerdidas + "}"; //'}'
    }   
}
