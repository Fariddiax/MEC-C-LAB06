import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FramePersonas extends javax.swing.JFrame {
        Thread p1;
        Thread p2;
        Thread p3;
        
        boolean respuesta1 = false;
        boolean respuesta2 = false;
        boolean respuesta3 = false;
        
        public FramePersonas(){
            initComponents();
            this.setLocationRelativeTo(null);
            this.setTitle("ANGEL MEZA HILOS");
            getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPersonaUno = new javax.swing.JLabel();
        lblPersonaDos = new javax.swing.JLabel();
        lblPersonaTres = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        cbDificultad = new javax.swing.JComboBox<>();
        btnDetenerPersona1 = new javax.swing.JButton();
        btnDetenerPersona3 = new javax.swing.JButton();
        btnDetenerPersona2 = new javax.swing.JButton();
        btnMenú = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Angelo´s Clubs Night €");

        lblPersonaUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        lblPersonaDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.jpg"))); // NOI18N

        lblPersonaTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.jpg"))); // NOI18N

        btnIniciar.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        cbDificultad.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cbDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dificil", "Normal", "Facil", " " }));
        cbDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDificultadActionPerformed(evt);
            }
        });

        btnDetenerPersona1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        btnDetenerPersona1.setText("DETENER");
        btnDetenerPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona1ActionPerformed(evt);
            }
        });

        btnDetenerPersona3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        btnDetenerPersona3.setText("DETENER");
        btnDetenerPersona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona3ActionPerformed(evt);
            }
        });

        btnDetenerPersona2.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        btnDetenerPersona2.setText("DETENER");
        btnDetenerPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona2ActionPerformed(evt);
            }
        });

        btnMenú.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnMenú.setText("Menú");
        btnMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenúActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblPersonaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(lblPersonaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(lblPersonaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(cbDificultad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenú, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnDetenerPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetenerPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(btnDetenerPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDetenerPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetenerPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetenerPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
       int tiempoMilisegundos = 0;

switch (cbDificultad.getSelectedIndex()) {
    case 0: tiempoMilisegundos = 0; break;
    case 1: tiempoMilisegundos = 100; break;
    case 2: tiempoMilisegundos = 500; break;
    default: tiempoMilisegundos = 0; break;
};

p1 = new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            tarea(lblPersonaUno); // Aquí debes pasar el JLabel correspondiente a cada hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});

p2 = new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            tarea(lblPersonaDos); // Aquí debes pasar el JLabel correspondiente a cada hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});

p3 = new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            tarea(lblPersonaTres); // Aquí debes pasar el JLabel correspondiente a cada hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});

respuesta1 = false;
respuesta2 = false;
respuesta3 = false;
btnIniciar.setEnabled(false);

p1.start();
p2.start();
p3.start();

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void tarea(JLabel persona) throws InterruptedException {
        int tiempo = (int)(Math.random()*500 + 100);
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Imagenes\\" + numero + ".jpg";
            ImageIcon imageIcon = new ImageIcon(ruta);
            persona.setIcon(imageIcon);
            Thread.sleep(tiempo);
        }
    }
    
    private void btnDetenerPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona1ActionPerformed
        p1.stop();
        respuesta1 = true;
        comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona1ActionPerformed

    private void btnDetenerPersona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona2ActionPerformed
        p2.stop();
        respuesta2 = true;
        comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona2ActionPerformed

    private void btnDetenerPersona3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona3ActionPerformed
        p3.stop();
        respuesta3 = true;
        comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona3ActionPerformed

    private void btnMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenúActionPerformed
        Menu opcion = new Menu();
        opcion.setVisible(true);
        this.setVisible (false);
    }//GEN-LAST:event_btnMenúActionPerformed

    private void cbDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDificultadActionPerformed

   
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
            java.util.logging.Logger.getLogger(FramePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetenerPersona1;
    private javax.swing.JButton btnDetenerPersona2;
    private javax.swing.JButton btnDetenerPersona3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMenú;
    private javax.swing.JComboBox<String> cbDificultad;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPersonaDos;
    private javax.swing.JLabel lblPersonaTres;
    private javax.swing.JLabel lblPersonaUno;
    // End of variables declaration//GEN-END:variables
     
     private void comprobarResultado (){
        if (respuesta1 && respuesta2 && respuesta3) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException ex) {
               Logger.getLogger(FramePersonas.class.getName()).log(Level.SEVERE,null,ex);
            }
            btnIniciar.setEnabled(true);
             if (lblPersonaUno.getIcon().toString().equals(lblPersonaDos.getIcon().toString()) && lblPersonaUno.getIcon().toString().equals("src/Imagenes/IUno.jpg")){
                JOptionPane.showMessageDialog(null, "Felicitaciones, has sido GANADOR!!!");
            }else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
            }
        }
     
     }

}
