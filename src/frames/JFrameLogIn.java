package frames;

import filesManagement.SavePlayerBinario;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import players.Player;
/**
 *
 * @author Luis
 */
public class JFrameLogIn extends javax.swing.JFrame { 
    /**
     * Creates new form logInPlayer
     */
    SavePlayerBinario guardarInfo = new SavePlayerBinario();
    public JFrameLogIn() {
        initComponents();
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

        loginjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombrejTextField = new javax.swing.JTextField();
        apellidojTextField = new javax.swing.JTextField();
        idjTextField = new javax.swing.JTextField();
        registrarsejButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Usuarios");
        setResizable(false);

        loginjPanel.setBackground(new java.awt.Color(255, 153, 0));
        loginjPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- Registrar Jugador -");

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel3.setText("Apellido: ");

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel4.setText("ID: ");

        nombrejTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombrejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrejTextFieldActionPerformed(evt);
            }
        });
        nombrejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrejTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrejTextFieldKeyTyped(evt);
            }
        });

        apellidojTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidojTextFieldActionPerformed(evt);
            }
        });
        apellidojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidojTextFieldKeyTyped(evt);
            }
        });

        idjTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idjTextFieldActionPerformed(evt);
            }
        });
        idjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idjTextFieldKeyTyped(evt);
            }
        });

        registrarsejButton.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        registrarsejButton.setText("REGISTRAR");
        registrarsejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarsejButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese los datos del Jugador en los siguientes campos...");

        javax.swing.GroupLayout loginjPanelLayout = new javax.swing.GroupLayout(loginjPanel);
        loginjPanel.setLayout(loginjPanelLayout);
        loginjPanelLayout.setHorizontalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginjPanelLayout.createSequentialGroup()
                .addGap(50, 102, Short.MAX_VALUE)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addComponent(nombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(loginjPanelLayout.createSequentialGroup()
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginjPanelLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(registrarsejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginjPanelLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginjPanelLayout.setVerticalGroup(
            loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginjPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(apellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(loginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(registrarsejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrejTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrejTextFieldKeyPressed
        //No hace nada
    }//GEN-LAST:event_nombrejTextFieldKeyPressed

    private void nombrejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrejTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El Nombre no puede contener numeros");
        }
    }//GEN-LAST:event_nombrejTextFieldKeyTyped

    private void apellidojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidojTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El Apellido no puede contener numeros");
        }
    }//GEN-LAST:event_apellidojTextFieldKeyTyped

    private void idjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idjTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El ID no puede contener letras");
        }
    }//GEN-LAST:event_idjTextFieldKeyTyped
    /**
     * Metodo registrarse
     * @param evt boton para registra al player, evaula si algun campo esta vacio y lo envia 
     * a la clase SavePlayerBinario que guarda en binarios la informacion
     */
    //Metodo para registrar y guardar al Jugador
    private void registrarsejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarsejButtonActionPerformed

        //Uso de try-catch
        try { 
            ArrayList<Player> players = new ArrayList<>();
            String nombre = nombrejTextField.getText();
            String apellido = apellidojTextField.getText();
            int id = Integer.valueOf(idjTextField.getText());
            if (nombre.isEmpty() || apellido.isEmpty() || id <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, llene la(s) casilla(s) vacias");
            } 
            else {
                Player player = new Player(nombre, apellido, id, 0, 0, 0);
                players.add(player);
                JOptionPane.showMessageDialog(null, "Jugador registrado exitosamente");
                limpiarCampos();
                try{
                    this.guardarInfo.guardarPlayer(players);
                } catch(IOException ex){
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la(s) casilla(s) vacias");
        }

    }//GEN-LAST:event_registrarsejButtonActionPerformed
    
    //Boton para salir del JFrameLogIn
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombrejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrejTextFieldActionPerformed

    private void apellidojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidojTextFieldActionPerformed

    private void idjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idjTextFieldActionPerformed

    /**
     * Metodo limpiraCampos: accede a los textfield's que se llenaron para registrar a u player
     * y limpia lo escrito en dicho registro para dejar todo limpio para el siguiente registro
     */
    public void limpiarCampos() {
        nombrejTextField.setText("");
        apellidojTextField.setText("");
        idjTextField.setText("");
    }

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
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidojTextField;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel loginjPanel;
    private javax.swing.JTextField nombrejTextField;
    private javax.swing.JButton registrarsejButton;
    // End of variables declaration//GEN-END:variables
}
