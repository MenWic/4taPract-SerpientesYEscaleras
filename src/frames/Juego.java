package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import players.CrearTablero;
import players.Player;
import static frames.JFramePrincipal.*;

/**
 *
 * @author Luis
 */
public class Juego {
    
    private static ArrayList<Player> players;
    private static ArrayList<JLabel> fichas;
    //private boolean[] turnoJugador; //NO ME FUNCIONO, MEJOR BORRE EL METODO
    private boolean turnoDisponible;
    private boolean ganador;
    private int posicionXJ1;
    private int posicionYJ1;
    private int posicionXJ2;
    private int posicionYJ2;
    private int posicionXJ3;
    private int posicionYJ3;
    private int posicionXJ4;
    private int posicionYJ4;
    private int posicionXJ5;
    private int posicionYJ5;
    private int posicionXJ6;
    private int posicionYJ6;
    
    int contadorj1;
    int contadorj2;
    int contadorj3;
    int contadorj4;
    int contadorj5;
    int contadorj6;
    
    /**
     * Constructor de la clase Juego, inicializa las posisciones de las fihcas en X y Y 
     * y se inicializa arrayLista de players y fichas para los jugadores de la partida
     */
    public Juego() {
        players = new ArrayList<>();
        fichas = new ArrayList<>();
        posicionXJ1 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ1 = CrearTablero.getTablero().getFilas() - 1;
        posicionXJ2 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ2 = CrearTablero.getTablero().getFilas() - 1;
        posicionXJ3 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ3 = CrearTablero.getTablero().getFilas() - 1;
        posicionXJ4 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ4 = CrearTablero.getTablero().getFilas() - 1;
        posicionXJ5 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ5 = CrearTablero.getTablero().getFilas() - 1;
        posicionXJ6 = CrearTablero.getTablero().getColumnas() - 1;
        posicionYJ6 = CrearTablero.getTablero().getFilas() - 1;
        turnoDisponible = true;
    }
    /**
     * 
     * @param player recibe el parametro players de la clase JFramePrincipal, 
     * al pedir nombre y cantidad de jugadores
     * @param ficha  recible un JLabel para poder tener el usuarioa y la ficha 
     * en un mismo indice de los ArrayList
     */
    //Metodo para registrar jugadores en JFrameLogIn
    public void registrarJugadores(Player player, JLabel ficha) {
        players.add(player);
        fichas.add(ficha);
    }
    /**
     * Metodo jugar: realiza los turnos de jugadores en la partida
     */
    //Metodo de incio de turno en la partida
    public void Jugar(int numero) { //El parametro int numero no se usa de momento
        ganador = false;
        try {
            //Hacer mientras se realicen las condicionantes (No es necesario que se llenen los 6 espacios
            while (ganador != true) {
                if (players.get(0) != null && turnoDisponible == true) {
                    turnoJugador1(players.get(0), fichas.get(0));
                    buscarGanador(fichas.get(0), players.get(0));
                }
                if (players.get(1) != null && turnoDisponible == true) {
                    turnoJugador2(players.get(1), fichas.get(1));
                    buscarGanador(fichas.get(1), players.get(1));
                }
                if (players.get(2) != null && turnoDisponible == true) {
                    turnoJugador3(players.get(2), fichas.get(2));
                    buscarGanador(fichas.get(2), players.get(2));
                }
                if (players.get(3) != null && turnoDisponible == true) {
                    turnoJugador4(players.get(3), fichas.get(3));
                    buscarGanador(fichas.get(3), players.get(3));
                }
                if (players.get(4) != null && turnoDisponible == true) {
                    turnoJugador5(players.get(4), fichas.get(4));
                    buscarGanador(fichas.get(4), players.get(4));
                }
                if (players.get(5) != null && turnoDisponible == true) {
                    turnoJugador6(players.get(5), fichas.get(5));
                    buscarGanador(fichas.get(5), players.get(5));
                }
            }
        } 
        catch (Exception e) {
        }
    }
    
    //Aqui tenia el metodo de pasar reportes, ahora esta en linea 328

    //Metodo de Turnos en el Juego
    public void turnos(Player player) {
    }
    
    /**
     * Metodo TurnoJugador1 
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    //Turnos de Jugadores en partida
    public void turnoJugador1(Player player, JLabel ficha) {
        contadorj1 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj1 == 0) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    girarDadotJButton.setEnabled(false);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }
            });
            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ1][posicionYJ1].remove(ficha);
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ1 =- dados;
                    CrearTablero.getTableroPanel()[posicionXJ1][posicionYJ1].add(ficha);
                    turnoDisponible = false;
                    girarDadotJButton.setEnabled(true);
                    contadorj1 = 1;
                }
            });
        }
    }
    /**
     * Metodo TurnoJugador2 
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    public void turnoJugador2(Player player, JLabel ficha) {
        contadorj2 = 0;
        turnoDisponible=false;
        if (contadorj2 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.setEnabled(true);
            girarDadotJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }
            });
            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ2][posicionYJ2].remove(ficha);
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ2 -= dados;
                    CrearTablero.getTableroPanel()[posicionXJ2][posicionYJ2].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj2 = 1;
                }
            });
        }
    }
    /**
     * Metodo TurnoJugador3
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    public void turnoJugador3(Player player, JLabel ficha) {
        contadorj3 = 0;
        girarDadotJButton.setEnabled(true);
        turnoDisponible=false;
        if (contadorj3 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                    girarDadotJButton.setEnabled(true);
                }
            });
            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ3][posicionYJ3].remove(ficha);
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ3 -= dados;
                    CrearTablero.getTableroPanel()[posicionXJ3][posicionYJ3].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj3 = 1;
                }
            });
        }
    }
    /**
     * Metodo TurnoJugador4
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    public void turnoJugador4(Player player, JLabel ficha) {
        contadorj4 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj4 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }

            });
            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ4][posicionYJ4].remove(ficha);
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ4 =- dados;
                    CrearTablero.getTableroPanel()[posicionXJ4][posicionYJ4].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj4 = 1;
                }
            });
        }
    }
    /**
     * Metodo TurnoJugador5
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    public void turnoJugador5(Player player, JLabel ficha) {
        contadorj5 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj5 == 0) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }
            });

            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Dado dado = new Dado();
                    //ConstructorTablero.getTableroPanel()[posicionXJ5][posicionYJ5].remove(ficha);
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ5 -= dados;
                    CrearTablero.getTableroPanel()[posicionXJ5][posicionYJ5].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj5 = 1;
                }
            });
        }
    }
    /**
     * Metodo TurnoJugador6
     * @param player Recibie como parametro un player para mostrar el nombre e instrucciones
     * @param ficha  recibe como parametro un label para mover la ficha 
     */
    public void turnoJugador6(Player player, JLabel ficha) {
        contadorj6 = 0;
        turnoDisponible=false;
        girarDadotJButton.setEnabled(true);
        if (contadorj6 != 1) {
            JOptionPane.showMessageDialog(null, "Turno de " + player.getNombre() + ", tire dado y parelo");
            girarDadotJButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    NumDelDado imagenDado = new NumDelDado();
                    detenerDadoJButton.setEnabled(true);
                    dadojLabel.setIcon(imagenDado.gifDado());
                }
            });
            JFramePrincipal.detenerDadoJButton.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    //ConstructorTablero.getTableroPanel()[posicionXJ6][posicionYJ6].remove(ficha);
                    Dado dado = new Dado();
                    int dados = dado.obtenerNum();
                    NumDelDado imagenDado = new NumDelDado();
                    dadojLabel.setIcon(imagenDado.dadoResultante(dados));
                    detenerDadoJButton.setEnabled(false);
                    posicionYJ6 -= dados;
                    CrearTablero.getTableroPanel()[posicionXJ6][posicionYJ6].add(ficha);
                    turnoDisponible = true;
                    girarDadotJButton.setEnabled(true);
                    contadorj6 = 1;
                }
            });
        }
    }
    /**
     * metodo buscarGanador
     * @param ficha  recibe un label como parametro para evaluarla si esta llego a posicio 0,0 
     * @param player recibe al player si llego a 0,0 usar el setPartGanadas++ (incrementa 1)
     * @return retorna  un boolean ganador para terminar el while del turno actual iniciado con el
     * metodo Juego.jugar
     */
    public boolean buscarGanador(JLabel ficha, Player player) {
        if (CrearTablero.getTableroPanel()[0][0].getComponents().equals(ficha)) {
            JOptionPane.showMessageDialog(null, " El Ganador: " + player.getNombre());
            player.setPartGanadas(1);
            ganador = true;
        } 
        else {
            ganador= false;
        }
       return ganador;
    }
    /**
     * Metodo que envia int de partidas jugadas, ganadas y perdidas a los jugadores para luego
     * poder mostrar actualizada la tabla de reportes
     */
    public void enviarReportes() {
        for (int i = 0; i < players.size(); i++) {
            players.get(i).setPartJugadas(1);
        }
    }
}
