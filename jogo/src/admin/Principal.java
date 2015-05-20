package admin;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jogador = new javax.swing.JMenu();
        jGerenciar = new javax.swing.JMenuItem();
        jListar = new javax.swing.JMenuItem();
        pergunta = new javax.swing.JMenu();
        pGerenciar = new javax.swing.JMenuItem();
        pListar = new javax.swing.JMenuItem();
        ranking = new javax.swing.JMenu();
        rListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jogador.setText("Jogador");

        jGerenciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jGerenciar.setText("Gerenciar");
        jGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerenciarActionPerformed(evt);
            }
        });
        jogador.add(jGerenciar);

        jListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jListar.setText("Listar");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });
        jogador.add(jListar);

        jMenuBar1.add(jogador);

        pergunta.setText("Pergunta");

        pGerenciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        pGerenciar.setText("Gerenciar");
        pGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGerenciarActionPerformed(evt);
            }
        });
        pergunta.add(pGerenciar);

        pListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        pListar.setText("Listar");
        pListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pListarActionPerformed(evt);
            }
        });
        pergunta.add(pListar);

        jMenuBar1.add(pergunta);

        ranking.setText("Ranking");

        rListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        rListar.setText("Listar");
        rListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rListarActionPerformed(evt);
            }
        });
        ranking.add(rListar);

        jMenuBar1.add(ranking);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerenciarActionPerformed
        jogadorManter tela = new jogadorManter();
        //fechar só a janela:
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_jGerenciarActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
        jogadorListar tela = new jogadorListar();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_jListarActionPerformed

    private void pGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGerenciarActionPerformed
        perguntaManter tela = new perguntaManter();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_pGerenciarActionPerformed

    private void pListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pListarActionPerformed
        perguntaListar tela = new perguntaListar();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_pListarActionPerformed

    private void rListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rListarActionPerformed
        rankingListar tela = null;
        try {
            tela = new rankingListar();
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_rListarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/d.jpg")));
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jGerenciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jListar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jogador;
    private javax.swing.JMenuItem pGerenciar;
    private javax.swing.JMenuItem pListar;
    private javax.swing.JMenu pergunta;
    private javax.swing.JMenuItem rListar;
    private javax.swing.JMenu ranking;
    // End of variables declaration//GEN-END:variables
}
