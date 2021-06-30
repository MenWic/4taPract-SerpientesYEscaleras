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
    public int obtenerNum(){
        valor=(int)(Math.random()*(6-1)+1);
            return valor;
    }
}
