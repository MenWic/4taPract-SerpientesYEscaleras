package frames;
/**
 *
 * @author Luis
 */
public class Dado {
    private int valor;
    /**
        *Funcion: obtenerNum
        *genera un numero un random de 1 a 6 y devuelve el mayor
    */
    //Variable de tipo int que contiene un numero aleatorio generado entre 1 y 6, para usar donde sea (publica)
    public int obtenerNum(){
        valor=(int)(Math.random()*(6-1)+1);
            return valor;
    }
}
