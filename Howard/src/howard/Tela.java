package howard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {
    int posicao = 0;
    List<Roupas> lista; 
    
    public Tela() {
        initComponents();
        lista = new ArrayList();
    }

    private void Limpar(){
        txtDescricao.setText(" ");
        txtTipo.setText(" ");
        txtCor.setText(" ");
        cxPreferida.setSelectedIndex(0);
      }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        cxPreferida = new javax.swing.JComboBox();
        txtTipo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        cxPreferida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Roupas do Howard");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Essa roupa é uma das preferidas?");

        jLabel5.setText("Cor:");

        jLabel4.setText("Descrição:");

        jLabel3.setText("Tipo:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        btPrimeiro.setText("Primeiro");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        btUltimo.setText("Último");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btPrimeiro)
                .addGap(32, 32, 32)
                .addComponent(btAnterior)
                .addGap(34, 34, 34)
                .addComponent(btProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btUltimo)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPrimeiro)
                    .addComponent(btAnterior)
                    .addComponent(btUltimo)
                    .addComponent(btProximo))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addGap(35, 35, 35)
                .addComponent(btLimpar)
                .addGap(41, 41, 41)
                .addComponent(btConsultar)
                .addGap(27, 27, 27)
                .addComponent(btCadastrar)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDescricao)
                                            .addGap(58, 58, 58)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(cxPreferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cxPreferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btConsultar)
                    .addComponent(btExcluir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Roupas r = new Roupas();
        Prateleiras p = new Prateleiras();

        r.setDescricao(txtDescricao.getText());
        r.setTipo(txtTipo.getText());
        r.setCor(txtCor.getText());
        if(cxPreferida.getSelectedItem().equals("Sim")){
            r.setPreferida(true);
        }
        else{
            r.setPreferida(false);
        }

        Limpar();
        JOptionPane.showMessageDialog(null, " Roupa cadastrada com sucesso!!!");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
        posicao = 0;
        Roupas r = lista.get(0);
        if (lista.size()>0){ 
           txtDescricao.setText(r.getDescricao());
           txtTipo.setText(r.getTipo());
           txtCor.setText(r.getCor());
           if(r.isPreferida() == true){
                cxPreferida.setSelectedIndex(1);
           }
           else{
                cxPreferida.setSelectedIndex(2);
           }
           
           if (lista.size() == 1)
            {
                btProximo.setEnabled(false);
                btAnterior.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma roupa cadastrada!!!");
        }
        
        
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
        if(posicao > 0){
            Roupas r = lista.get(posicao - 1);
           txtDescricao.setText(r.getDescricao());
           txtTipo.setText(r.getTipo());
           txtCor.setText(r.getCor());
           if(r.isPreferida() == true){
                cxPreferida.setSelectedIndex(1);
           }
           else{
                cxPreferida.setSelectedIndex(2);
           }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma roupa cadastrada!!!");
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);     
        
        Roupas r = lista.get(posicao + 1);
           txtDescricao.setText(r.getDescricao());
           txtTipo.setText(r.getTipo());
           txtCor.setText(r.getCor());
           if(r.isPreferida() == true){
                cxPreferida.setSelectedIndex(1);
           }
           else{
                cxPreferida.setSelectedIndex(2);
           }
          if (lista.size() - 1 == posicao)
            {
                btProximo.setEnabled(false);
                btUltimo.setEnabled(false);
            }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);  
        
        
         Roupas r = lista.get(lista.size() - 1);
            if (lista.size()>0){
                txtDescricao.setText(r.getDescricao());
                txtTipo.setText(r.getTipo());
                txtCor.setText(r.getCor());
                if(r.isPreferida() == true){
                     cxPreferida.setSelectedIndex(1);
                }
                else{
                     cxPreferida.setSelectedIndex(2);
                }
            }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Prateleiras p = new Prateleiras();
        String descricao = JOptionPane.showInputDialog("Digite a roupa a ser pesquisada:");
        int posicaoachou = 0;
        boolean enc = true;
        for (Roupas roupa  : lista) {
            if(descricao.equals(roupa.getDescricao())){
                posicao = posicaoachou;
                enc = true;
                txtDescricao.setText(roupa.getDescricao());
                txtTipo.setText(roupa.getTipo());
                txtCor.setText(roupa.getCor());
                if(roupa.isPreferida() == true){
                     cxPreferida.setSelectedIndex(1);
                }
                else{
                     cxPreferida.setSelectedIndex(2);
                }
                JOptionPane.showMessageDialog(null, "Esta roupa está na prateleira:" + p.qualPrateleira(roupa)); 
                break;
            }
         }
        if (enc == false){
             JOptionPane.showMessageDialog(null, "Essa roupa não está cadastrada!!!");
        }
        posicaoachou++;
    }//GEN-LAST:event_btConsultarActionPerformed
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JComboBox cxPreferida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

