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
    /* 
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

    public void registrarJugadores(Player player, JLabel ficha) {
        players.add(player);
        fichas.add(ficha);
    }

    public void Jugar(int numero) {
        ganador = false;
        try {
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
    
    public void enviarReportes() {
        for (int i = 0; i < players.size(); i++) {
            players.get(i).setPartJugadas(1);
        }
    }
}
