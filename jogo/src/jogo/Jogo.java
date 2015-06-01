package jogo;

import audio.Audio;
import dao.PerguntaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelo.Jogador;
import modelo.JogoCompleto;
import modelo.Pergunta;

public class Jogo extends javax.swing.JFrame {
    
    private Integer nivel;
    private Integer premio = 2500;
    private Jogador jogador;
    private Integer ganhos;
    private Integer err;
    private Integer acert;
    private JogoCompleto completo;
    ButtonGroup bg;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    List<Pergunta> perguntas;
    Pergunta at; //perguntaAtual
       
    public Jogo() {
        initComponents();
        bg = new ButtonGroup();
        bg.add(btA);
        bg.add(btB);
        bg.add(btC);
        bg.add(btD);
        nivel = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btA = new javax.swing.JRadioButton();
        btB = new javax.swing.JRadioButton();
        btC = new javax.swing.JRadioButton();
        btD = new javax.swing.JRadioButton();
        btConfirma = new javax.swing.JButton();
        btPular = new javax.swing.JButton();
        btParar = new javax.swing.JButton();
        btCartas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acertar = new javax.swing.JLabel();
        errar = new javax.swing.JLabel();
        parar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAMouseClicked(evt);
            }
        });
        btA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAActionPerformed(evt);
            }
        });

        btB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBActionPerformed(evt);
            }
        });

        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });

        btD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDActionPerformed(evt);
            }
        });

        btConfirma.setText("Confirma");
        btConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmaActionPerformed(evt);
            }
        });

        btPular.setText("Pular");
        btPular.setEnabled(false);
        btPular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPularActionPerformed(evt);
            }
        });

        btParar.setText("Parar");
        btParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPararActionPerformed(evt);
            }
        });

        btCartas.setText("Cartas");

        lblPergunta.setForeground(new java.awt.Color(0, 0, 204));
        lblPergunta.setText("Pergunta");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("jogador");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/artes.png"))); // NOI18N

        jLabel7.setText("Errar");

        jLabel8.setText("Parar");

        jLabel9.setText("Acertar");

        acertar.setText("2500");

        errar.setText("0");

        parar.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(errar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(acertar))
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertar)
                    .addComponent(errar)
                    .addComponent(parar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfirma)
                        .addGap(37, 37, 37)
                        .addComponent(btPular)
                        .addGap(37, 37, 37)
                        .addComponent(btParar)
                        .addGap(30, 30, 30)
                        .addComponent(btCartas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btC, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btD, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btA, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btB, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2)))
                                .addGap(0, 78, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btA))
                        .addGap(18, 18, 18)
                        .addComponent(btB)
                        .addGap(18, 18, 18)
                        .addComponent(btC)
                        .addGap(18, 18, 18)
                        .addComponent(btD)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirma)
                    .addComponent(btPular)
                    .addComponent(btParar)
                    .addComponent(btCartas))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked


    private void btConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmaActionPerformed
        JogoCompleto completo = new JogoCompleto();
        Audio audio = new Audio();
        ganhos = completo.getGanhos();
        
        boolean acertou = false;
        String x= null;
        
        if(btA.isSelected() == true){
            x = "A";
        }
        else if(btB.isSelected() == true){
            x = "B";
        }
        else if(btC.isSelected() == true){
            x = "C";
        }
        else if(btD.isSelected() == true){
            x = "D";
        }
                     
        if(!x.equals(at.getCerta())){
            acertou = false;
            JOptionPane.showMessageDialog(null, "Errada");
            
            completo.setGanhos(err);
            Fim f = new Fim();
            f.setCompleto(completo);
            f.setVisible(true);
            this.setVisible(false);
            
        }
        else{
            audio.tocar("certa.wav");
            acertou = true;
            JOptionPane.showMessageDialog(null, "Certa");
            
            ganhos = ganhos + premio;
            completo.setGanhos(ganhos);
            System.out.println(ganhos);
            

            PerguntaDAO dao = new PerguntaDAO();
            perguntas.remove(0);
            if(perguntas.isEmpty())
            {
                nivel ++;
                premio = premio * nivel;

                if (nivel >= 3)
                {
                    completo.setGanhos(acert);
                    Fim tela = new Fim();
                    tela.setCompleto(completo);                  
                    tela.setVisible(true);
                    this.setVisible(false);
                    return;
                }
                perguntas = dao.listarNivel(nivel);
            }
            at = perguntas.get(0);

            lblPergunta.setText(at.getEnunciado());
            btA.setText(at.getA());
            btB.setText(at.getB());
            btC.setText(at.getC());
            btD.setText(at.getD());
            
            //mostrar pontuação
            //se eu acertar
            acert  = ganhos + premio;
            acertar.setText(acert.toString());
            
            //se eu parar
            parar.setText(ganhos.toString());
            
            //se eu errar
            err = ganhos / 2;
            errar.setText(err.toString());
            
            bg.clearSelection();
        }
    }//GEN-LAST:event_btConfirmaActionPerformed

    private void btPularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPularActionPerformed
            PerguntaDAO dao = new PerguntaDAO();
            perguntas.remove(0);
            if(perguntas.isEmpty())
            {
                nivel ++;
                premio = premio * nivel;

                if (nivel >= 3)
                {
                    completo.setGanhos(acert);
                    Fim tela = new Fim();
                    tela.setCompleto(completo);                  
                    tela.setVisible(true);
                    this.setVisible(false);
                    return;
                }
                perguntas = dao.listarNivel(nivel);
            }
            at = perguntas.get(0);

            lblPergunta.setText(at.getEnunciado());
            btA.setText(at.getA());
            btB.setText(at.getB());
            btC.setText(at.getC());
            btD.setText(at.getD());
            
    }//GEN-LAST:event_btPularActionPerformed

    private void btPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPararActionPerformed
        Fim f = new Fim();
        f.setCompleto(completo);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btPararActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel4.setText(jogador.getLogin());
        
        JogoCompleto completo = new JogoCompleto();
        completo.setJogador(jogador);
        premio = 2500;
        
        PerguntaDAO dao = new PerguntaDAO();
        perguntas = dao.listarNivel(nivel);
        at = perguntas.get(0);

        lblPergunta.setText(at.getEnunciado());
        btA.setText(at.getA());
        btB.setText(at.getB());
        btC.setText(at.getC());
        btD.setText(at.getD());

    }//GEN-LAST:event_formWindowOpened

    private void btAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAMouseClicked
        
    }//GEN-LAST:event_btAMouseClicked

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
        Audio audio = new Audio();
        if(btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true){
           audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btBActionPerformed

    private void btAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAActionPerformed
       Audio audio = new Audio();
        if(btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true){
           audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btAActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
        Audio audio = new Audio();
        if(btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true){
           audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btCActionPerformed

    private void btDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDActionPerformed
        Audio audio = new Audio();
        if(btA.isSelected() == true || btB.isSelected() == true || btC.isSelected() == true || btD.isSelected() == true){
           audio.tocar("certeza.wav");
        }
    }//GEN-LAST:event_btDActionPerformed

        public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertar;
    private javax.swing.JRadioButton btA;
    private javax.swing.JRadioButton btB;
    private javax.swing.JRadioButton btC;
    private javax.swing.JButton btCartas;
    private javax.swing.JButton btConfirma;
    private javax.swing.JRadioButton btD;
    private javax.swing.JButton btParar;
    private javax.swing.JButton btPular;
    private javax.swing.JLabel errar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel parar;
    // End of variables declaration//GEN-END:variables
}
