/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import filesManagement.*;
import players.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import manejoArchivos.CargarUsuarioBInario;
//import manejoArchivos.LectorTableroEnTexto;
//import usuario.ConstructorTablero;
//import usuario.Ficha;
//import usuario.Usuario;
import java.lang.Object;

/**
 *
 * @author Luis
 */
public class JFramePrincipal extends javax.swing.JFrame {
    /**
     * Creates new form JFramePrincipal
     */
    LoadPlayerBinario carga = new LoadPlayerBinario();
    JFrameReportes reportesFrame;
    TextReaderTablero lector;
    private boolean colorCorrecto;
    private boolean rojoDisponible=true;
    private boolean amarilloDisponible=true;
    private boolean azulDisponible=true;
    private boolean naranjaDisponible=true;
    private boolean blancoDisponible=true;
    private boolean negroDisponible=true;

    public JFramePrincipal() {
        lector = new TextReaderTablero();
        reportesFrame = new JFrameReportes();
        initComponents();
        inicializarLabelNombres();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        girarDadotJButton = new javax.swing.JButton();
        detenerDadoJButton = new javax.swing.JButton();
        dadojLabel = new javax.swing.JLabel();
        jugarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jugador1jLabel = new javax.swing.JLabel();
        jugador2jLabel = new javax.swing.JLabel();
        jugador3jLabel = new javax.swing.JLabel();
        jugador4jLabel = new javax.swing.JLabel();
        jugador5jLabel = new javax.swing.JLabel();
        jugador6jLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        colorJugador1jLabel = new javax.swing.JLabel();
        colorJugador2jLabel = new javax.swing.JLabel();
        colorJugador3jLabel = new javax.swing.JLabel();
        colorJugador4jLabel = new javax.swing.JLabel();
        colorJugador5jLabel = new javax.swing.JLabel();
        colorJugador6jLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serpientes y Escaleras");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPrincipal.setForeground(new java.awt.Color(204, 0, 0));

        girarDadotJButton.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        girarDadotJButton.setText("Girar Dado");
        girarDadotJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girarDadotJButtonActionPerformed(evt);
            }
        });

        detenerDadoJButton.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        detenerDadoJButton.setText("Detener Dado");
        detenerDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerDadoJButtonActionPerformed(evt);
            }
        });

        jugarjButton.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jugarjButton.setText("Cargar Tablero");
        jugarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player 1: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 2: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player 3:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player 4:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Player 5: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player 6: ");

        jugador1jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador1jLabel.setForeground(new java.awt.Color(255, 255, 255));

        jugador2jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador2jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jugador2jLabel.setText("jLabel7");

        jugador3jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador3jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jugador3jLabel.setText("jLabel7");

        jugador4jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador4jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jugador4jLabel.setText("jLabel7");

        jugador5jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador5jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jugador5jLabel.setText("jLabel7");

        jugador6jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugador6jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jugador6jLabel.setText("jLabel7");

        jButton1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButton1.setText("Regresar a Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        colorJugador1jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador1jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador1jLabel.setText("jLabel7");

        colorJugador2jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador2jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador2jLabel.setText("jLabel8");

        colorJugador3jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador3jLabel.setText("jLabel7");

        colorJugador4jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador4jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador4jLabel.setText("jLabel7");

        colorJugador5jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador5jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador5jLabel.setText("jLabel7");

        colorJugador6jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        colorJugador6jLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorJugador6jLabel.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("JUGADORES");

        jLabel8.setText("1. Se carga un tablero");

        jLabel9.setText("2. En opciones, seleccionar Jugar");

        jLabel10.setText("3. Se personaliza la Partida");

        jLabel11.setText("Empezar:");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(998, 998, 998)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jugador1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador4jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador5jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(colorJugador5jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorJugador6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(colorJugador1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorJugador2jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(colorJugador3jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(colorJugador4jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(detenerDadoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(girarDadotJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jugarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugador1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(colorJugador1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador2jLabel)
                    .addComponent(jLabel2)
                    .addComponent(colorJugador2jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jugador3jLabel)
                    .addComponent(colorJugador3jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jugador4jLabel)
                    .addComponent(colorJugador4jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jugador5jLabel)
                    .addComponent(colorJugador5jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador6jLabel)
                    .addComponent(colorJugador6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girarDadotJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detenerDadoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Reportes");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Jugar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para inicializar Nombres de Jugadores (sin ser visible)
    public void inicializarLabelNombres() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jugador1jLabel.setVisible(false);
        jugador2jLabel.setVisible(false);
        jugador3jLabel.setVisible(false);
        jugador4jLabel.setVisible(false);
        jugador5jLabel.setVisible(false);
        jugador6jLabel.setVisible(false);
        colorJugador1jLabel.setVisible(false);
        colorJugador2jLabel.setVisible(false);
        colorJugador3jLabel.setVisible(false);
        colorJugador4jLabel.setVisible(false);
        colorJugador5jLabel.setVisible(false);
        colorJugador6jLabel.setVisible(false);
    }

    //Boton para activar gif del Dado en movimiento
    private void girarDadotJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girarDadotJButtonActionPerformed
    }//GEN-LAST:event_girarDadotJButtonActionPerformed
    //Boton para detener gif 
    private void detenerDadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerDadoJButtonActionPerformed
    }//GEN-LAST:event_detenerDadoJButtonActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reportesFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jugarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarjButtonActionPerformed
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);
        
        //Seleccionar preset en documento .txt para el tablero a usar (Mandará el Inge)
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //Se selecciona y guarda el FILE que empleará el FileReader
            File fichero = fileChosser.getSelectedFile();
            
            //try-catch para capturar error
            try {
                this.lector.leerTexto(fichero);
            } 
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
            }
        }
    }//GEN-LAST:event_jugarjButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int contador = 0;
        String color = null;
        Juego juego=new Juego();
        int numeroJugadores = Integer.valueOf((JOptionPane.showInputDialog(null, "Numero de jugadores para la partida","", JOptionPane.PLAIN_MESSAGE, null, new Object[]{2, 3, 4, 5, 6}, "Seleccione")).toString());
        try {
            ArrayList<Player> player;
            player = carga.cargarPlayerBinario();
            if (player.get(numeroJugadores - 1).getNombre() != null) {
                
                //Ciclo para ingresar la cantidad de Jugadores pedida previamente y las opciones
                for (int i = 0; i < numeroJugadores; i++) {
                    boolean nombreCorrecto = false;
                    colorCorrecto=false;
                    contador += i;
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Jugador No: "+(i+1));
                    if (nombre==null) {
                        i = numeroJugadores;
                        inicializarLabelNombres();
                        rojoDisponible=true;
                        amarilloDisponible=true;
                        azulDisponible=true;
                        blancoDisponible=true;
                        negroDisponible=true;
                        naranjaDisponible=true;
                    } 
                    else {
                        color = (JOptionPane.showInputDialog(null, "Color de Ficha","", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Rojo", "Amarillo", "Blanco", "Negro", "Naranja", "Azul"},"Seleccione")).toString();
                        JLabel ficha=elegirColor(color);
                        //Mostrar mensaje cuando se guarde la personalizacion o mostrar mensaje de error
                        for (int j = 0; j < numeroJugadores && !nombreCorrecto; j++) {
                            if (player.get(j).getNombre().equals(nombre) && colorCorrecto==true) {
                                juego.registrarJugadores(player.get(i), ficha);
                                ponerNombres(i,nombre,color);
                                JOptionPane.showMessageDialog(null, "Jugador correcto");
                                nombreCorrecto = true;
                            } 
                            else {
                                nombreCorrecto = false;
                            }
                        }
                        if (nombreCorrecto == false) {
                            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                            i--;
                        }
                    }
                }
                if (contador == numeroJugadores) {
                    juego.Jugar(1); //Por el parametro
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen " + numeroJugadores + " jugadores, registre Previamente la cantidad necesaria de jugadores");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cantidad de Usuarios no existente, registrese previamente");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    JLabel imagen;
    Ficha ficha =new Ficha();
    public JLabel elegirColor(String color){
        if(color.equals("Rojo") && rojoDisponible==true){
            colorCorrecto=true;
            rojoDisponible=false;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaRoja());
            imagen=Ficha.getFichaRoja();
        } 
        else if(color.equals("Amarillo") && amarilloDisponible==true){
            amarilloDisponible=false;
            colorCorrecto=true;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaAmarilla());
            imagen=Ficha.getFichaAmarilla();
        } else if(color.equals("Naranja") && naranjaDisponible==true){
            naranjaDisponible=false;
            colorCorrecto=true;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaNaranja());
            imagen=Ficha.getFichaNaranja();
        } else  if(color.equals("Azul")&& azulDisponible==true){
            azulDisponible=false;
            colorCorrecto=true;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaAzul());
            imagen=Ficha.getFichaAzul();
        } else if(color.equals("Blanco") && blancoDisponible==true){
            blancoDisponible=false;
            colorCorrecto=true;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaBlanca());
            imagen=Ficha.getFichaBlanca();
        } else if(color.equals("Negro") && negroDisponible==true){
            negroDisponible=false;
            colorCorrecto=true;
            CrearTablero.getTableroPanel()[CrearTablero.getTablero().getFilas()-1][CrearTablero.getTablero().getColumnas()-1].add(Ficha.getFichaNegra());
            imagen=Ficha.getFichaNegra();
        } else {
            JOptionPane.showMessageDialog(null,"Color ya utilizado");
            colorCorrecto=false;
        }
        return imagen;
    }
    
    public void ponerNombres(int i, String nombre,String color) {
        if (i == 0) {
            jugador1jLabel.setText(nombre);
            colorJugador1jLabel.setText("Color: "+color);
            jugador1jLabel.setVisible(true);
            jLabel1.setVisible(true);
            colorJugador1jLabel.setVisible(true);
        }
        if (i == 1) {
            jugador2jLabel.setText(nombre);
            colorJugador2jLabel.setText("Color: "+color);
            jugador2jLabel.setVisible(true);
            jLabel2.setVisible(true);
            colorJugador2jLabel.setVisible(true);
        }
        if (i == 2) {
            jugador3jLabel.setText(nombre);
            colorJugador3jLabel.setText("Color: "+color);
            jugador3jLabel.setVisible(true);
            jLabel3.setVisible(true);
            colorJugador3jLabel.setVisible(true);
        }
        if (i == 3) {
            jugador4jLabel.setText(nombre);
            colorJugador4jLabel.setText("Color: "+color);
            jugador4jLabel.setVisible(true);
            jLabel4.setVisible(true);
            colorJugador4jLabel.setVisible(true);
        }
        if (i == 4) {
            jugador5jLabel.setText(nombre);
            colorJugador5jLabel.setText("Color: "+color);
            jugador5jLabel.setVisible(true);
            jLabel5.setVisible(true);
            colorJugador5jLabel.setVisible(true);
        }
        if (i == 5) {
            jugador6jLabel.setText(nombre);
            colorJugador6jLabel.setText("Color: "+color);
            jugador6jLabel.setVisible(true);
            jLabel6.setVisible(true);
            colorJugador6jLabel.setVisible(true);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorJugador1jLabel;
    private javax.swing.JLabel colorJugador2jLabel;
    private javax.swing.JLabel colorJugador3jLabel;
    private javax.swing.JLabel colorJugador4jLabel;
    private javax.swing.JLabel colorJugador5jLabel;
    private javax.swing.JLabel colorJugador6jLabel;
    public static javax.swing.JLabel dadojLabel;
    public static javax.swing.JButton detenerDadoJButton;
    public static javax.swing.JButton girarDadotJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel jugador1jLabel;
    private javax.swing.JLabel jugador2jLabel;
    private javax.swing.JLabel jugador3jLabel;
    private javax.swing.JLabel jugador4jLabel;
    private javax.swing.JLabel jugador5jLabel;
    private javax.swing.JLabel jugador6jLabel;
    public static javax.swing.JButton jugarjButton;
    // End of variables declaration//GEN-END:variables
}
