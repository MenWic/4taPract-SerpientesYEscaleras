package filesManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import players.*;
/**
 *
 * @author Luis
 */
public class TextReaderTablero {
    
    //Variables globales de la clase para lectura de presets en .txt
    private int filas;
    private int columnas;
    private int filaPierdeTurno;
    private int columnaPierdeTurno;
    
    private int filaTiraDado;
    private int columnaTiraDado;
    
    private int filaAvanza;
    private int columnaAvanza;
    private int cantPosicionesAvanza;
    private int filaRetrocede;
    private int columnaRetrocede;
    private int cantPosicionesRetrocede;
    
    private int filaInicialRetroceso;
    private int columnaInicialRetroceso;
    private int filaFinalRetroceso;
    private int columnaFinalRetroceso;
    
    private int filaInicialSubida;
    private int columnaInicialSubida;
    private int filaFinalSubida;
    private int columnaFinalSubida;
    Tablero tablero;

    /**
     * Metodo leerTexto
     * @param Archivo pide como parametro "archivo" leido por JFileChooser
     * @throws FileNotFoundException 
     * @throws IOException 
     * <- Excepciones empleadas
     */
    //Metodo para leer documento .txt 
    public void leerTexto(File Archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(Archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        //Bucle de repeticion mientras linea no contenga nada
        while ((linea = br.readLine())!=null) {
            try {
                separarCampos(linea);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Iniciacion de variable tablero para guardar un preset de Tablero a usar en partida
        tablero = new Tablero(filas,columnas,filaPierdeTurno,columnaPierdeTurno,filaTiraDado,columnaTiraDado,filaAvanza,columnaAvanza,cantPosicionesAvanza,filaRetrocede,columnaRetrocede,cantPosicionesRetrocede,filaInicialSubida,columnaInicialSubida,filaFinalSubida,columnaFinalSubida,filaInicialRetroceso,columnaInicialRetroceso,filaFinalRetroceso,columnaFinalRetroceso);
        CrearTablero crearTablero=new CrearTablero(tablero);
        crearTablero.construirTableroPanel();
    }

    //Metodo de separacion de campos dados en .txt
    public void separarCampos(String linea) {
        String inicioTablero = "tablero(";
        String inicioPierdeTurno = "pierdeTurno(";
        String inicioTiraDados = "tiraDado(";
        String inicioAvanza = "avanza(";
        String inicioRetrocede = "retrocede(";
        String inicioSubida = "subida(";
        String inicioBajada = "bajada(";

        //Condiciones de ciclo if-else para leer doc de texto de un preset de Tablero
        if (linea.contains(inicioTablero)) {
            String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filas =Integer.valueOf(campos[0]);
            columnas=Integer.valueOf(campos[1]);
        }
        if (linea.contains(inicioPierdeTurno)) {
            String lineaDeCampos = linea.substring(inicioPierdeTurno.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaPierdeTurno =Integer.valueOf(campos[0]);
            columnaPierdeTurno= Integer.valueOf(campos[1]);
        }
        if (linea.contains(inicioTiraDados)) {
            String lineaDeCampos = linea.substring(inicioTiraDados.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaTiraDado =Integer.valueOf(campos[0]);
            columnaTiraDado =Integer.valueOf(campos[1]);
        }
        if (linea.contains(inicioAvanza)) {
            String lineaDeCampos = linea.substring(inicioAvanza.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaAvanza =Integer.valueOf(campos[0]);
            columnaAvanza=Integer.valueOf(campos[1]);
            cantPosicionesAvanza = Integer.valueOf(campos[2]);
        }
        if (linea.contains(inicioRetrocede)) {
            String lineaDeCampos = linea.substring(inicioRetrocede.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaRetrocede =Integer.valueOf(campos[0]);
            columnaRetrocede=Integer.valueOf(campos[1]);
            cantPosicionesRetrocede = Integer.valueOf(campos[2]);
        }
        if (linea.contains(inicioSubida)) {
            String lineaDeCampos = linea.substring(inicioSubida.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaInicialSubida = Integer.valueOf(campos[0]);
            columnaInicialSubida=Integer.valueOf(campos[1]);
            filaFinalSubida =Integer.valueOf(campos[2]);
            columnaFinalSubida=Integer.valueOf(campos[3]);
        }
        if (linea.contains(inicioBajada)) {
            String lineaDeCampos = linea.substring(inicioBajada.length(), linea.length()-1);
            String[] campos = lineaDeCampos.split(",");
            //Inicializar variables
            filaInicialRetroceso = Integer.valueOf(campos[0]);
            columnaInicialRetroceso=Integer.valueOf(campos[1]);
            filaFinalRetroceso =Integer.valueOf(campos[2]);
            columnaFinalRetroceso=Integer.valueOf(campos[3]);
        } 
    }
}
