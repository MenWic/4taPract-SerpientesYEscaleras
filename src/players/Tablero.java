package players;
/**
 *
 * @author Luis
 */
public class Tablero {
    //Varibles gloales de clase
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
    
    private int filaInicialSubida;
    private int columnaInicialSubida;
    private int filaFinalSubida;
    private int columnaFinalSubida;
    
    private int filaInicialRetroceso;
    private int columnaInicialRetroceso;
    private int filaFinalRetroceso;
    private int columnaFinalRetroceso;
    
    /**
     * Constructor con los parametros para crear un nuevo Tablero
     * @param filas
     * @param columnas
     * @param filaPierdeTurno
     * @param columnaPierdeTurno
     * @param filaTiraDado
     * @param columnaTiraDado
     * @param filaAvanza
     * @param columnaAvanza
     * @param cantPosicionesAvanza
     * @param filaRetrocede
     * @param columnaRetrocede
     * @param cantPosicionesRetrocede
     * @param filaInicialSubida
     * @param columnaInicialSubida
     * @param filaFinalSubida
     * @param columnaFinalSubida
     * @param filaInicialRetroceso
     * @param columnaInicialRetroceso
     * @param filaFinalRetroceso
     * @param columnaFinalRetroceso 
     */
    //Constructor de Tablero's
    public Tablero(int filas, int columnas, int filaPierdeTurno, int columnaPierdeTurno, int filaTiraDado, int columnaTiraDado, int filaAvanza, int columnaAvanza, int cantPosicionesAvanza, int filaRetrocede, int columnaRetrocede, int cantPosicionesRetrocede, int filaInicialSubida, int columnaInicialSubida, int filaFinalSubida, int columnaFinalSubida, int filaInicialRetroceso, int columnaInicialRetroceso, int filaFinalRetroceso, int columnaFinalRetroceso) {
        this.filas = filas;
        this.columnas = columnas;
        this.filaPierdeTurno = filaPierdeTurno;
        this.columnaPierdeTurno = columnaPierdeTurno;
        this.filaTiraDado = filaTiraDado;
        this.columnaTiraDado = columnaTiraDado;
        this.filaAvanza = filaAvanza;
        this.columnaAvanza = columnaAvanza;
        this.cantPosicionesAvanza = cantPosicionesAvanza;
        this.filaRetrocede = filaRetrocede;
        this.columnaRetrocede = columnaRetrocede;
        this.cantPosicionesRetrocede = cantPosicionesRetrocede;
        this.filaInicialSubida = filaInicialSubida;
        this.columnaInicialSubida = columnaInicialSubida;
        this.filaFinalSubida = filaFinalSubida;
        this.columnaFinalSubida = columnaFinalSubida;
        this.filaInicialRetroceso = filaInicialRetroceso;
        this.columnaInicialRetroceso = columnaInicialRetroceso;
        this.filaFinalRetroceso = filaFinalRetroceso;
        this.columnaFinalRetroceso = columnaFinalRetroceso;
    }

    //Getters 
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public int getFilaPierdeTurno() {
        return filaPierdeTurno;
    }
    public int getColumnaPierdeTurno() {
        return columnaPierdeTurno;
    }
    public int getFilaTiraDados() {
        return filaTiraDado;
    }
    public int getColumnaTiraDados() {
        return columnaTiraDado;
    }
    public int getFilaAvanza() {
        return filaAvanza;
    }
    public int getColumnaAvanza() {
        return columnaAvanza;
    }
    public int getCantPosicionesAvanza() {
        return cantPosicionesAvanza;
    }
    public int getFilaRetrocede() {
        return filaRetrocede;
    }
    public int getColumnaRetrocede() {
        return columnaRetrocede;
    }
    public int getCantPosicionesRetrocede() {
        return cantPosicionesRetrocede;
    }
    public int getFilaInicialSubida() {
        return filaInicialSubida;
    }
    public int getColumnaInicialSubida() {
        return columnaInicialSubida;
    }
    public int getFilaFinalSubida() {
        return filaFinalSubida;
    }
    public int getColumnaFinalSubida() {
        return columnaFinalSubida;
    }
    public int getFilaInicialRetroceso() {
        return filaInicialRetroceso;
    }
    public int getColumnaInicialRetroceso() {
        return columnaInicialRetroceso;
    }
    public int getFilaFinalRetroceso() {
        return filaFinalRetroceso;
    }
    public int getColumnaFinalRetroceso() {
        return columnaFinalRetroceso;
    }
    
    //Sobreesribir Método toString
    @Override
    public String toString() {
        return "Tablero{" + "Filas = " + filas + ", Columnas = " + columnas + ", FilaPierdeTurno = " + filaPierdeTurno + ", ColumnaPierdeTurno = " + columnaPierdeTurno + ", FilaTiraDados = " + filaTiraDado + ", ColumnaTiraDados = " + columnaTiraDado + ", FilaAvanza = " + filaAvanza + ", ColumnaAvanza = " + columnaAvanza + ", CantPosicionesAvanza = " + cantPosicionesAvanza + ", FilaRetrocede = " + filaRetrocede + ", ColumnaRetrocede = " + columnaRetrocede + ", CantPosicionesRetrocede = " + cantPosicionesRetrocede + ", FilaInicialSubida = " + filaInicialSubida + ", ColumnaInicialSubida = " + columnaInicialSubida + ", FilaFinalSubida = " + filaFinalSubida + ", ColumnaFinalSubida = " + columnaFinalSubida + ", FilaInicialRetroceso = " + filaInicialRetroceso + ", ColumnaInicialRetroceso = " + columnaInicialRetroceso + ", FilaFinalRetroceso = " + filaFinalRetroceso + ", ColumnaFinalRetroceso = " + columnaFinalRetroceso + "}"; //'}'
    }
}
