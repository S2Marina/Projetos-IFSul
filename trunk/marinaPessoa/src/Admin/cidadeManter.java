package Admin;

import Modelo.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class cidadeManter extends javax.swing.JFrame {

    List<Cidade> lista;
    int posicao = 0;
    
    public cidadeManter() {
        initComponents();
        lista = new ArrayList<Cidade>();
    }

    public void Limpar(){
        txtC.setText(null);
        txtN.setText(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCons = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btLimp = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();

        jLabel2.setText("Nome:");

        jLabel1.setText("Código:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Navegação")));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        btPrimeiro.setText("Primeiro");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(btPrimeiro);

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btAnterior);

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btProximo);

        btUltimo.setText("Último");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btUltimo);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel3.setLayout(new java.awt.GridLayout());

        btCons.setText("Consultar");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });
        jPanel3.add(btCons);

        btExc.setText("Excluir");
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });
        jPanel3.add(btExc);

        btLimp.setText("Limpar");
        btLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpActionPerformed(evt);
            }
        });
        jPanel3.add(btLimp);

        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        jPanel3.add(btCad);

        jLabel3.setText("Nome:");

        jLabel4.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Cidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtC, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(txtN))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = 0;

        Cidade c = lista.get(0);
        if (lista.size()>0){
            txtN.setText(c.getNome());
            txtC.setText(c.getCod().toString());
            
        if (lista.size() == 1)
        {
            btProximo.setEnabled(false);
            btAnterior.setEnabled(false);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma cidade cadastrada!!!");
        }

    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed

        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        if(posicao > 0){
            posicao = posicao - 1;
            Cidade c = lista.get(posicao);
            txtN.setText(c.getNome());
            txtC.setText(c.getCod().toString());
            
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma pessoa cadastrada!!!");
        }

    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = posicao + 1;

        Cidade c = lista.get(posicao);
        txtN.setText(c.getNome());
        txtC.setText(c.getCod().toString());
        

        if (posicao == lista.size() - 1) {
            btProximo.setEnabled(false);
            btUltimo.setEnabled(true);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);

        posicao = lista.size() - 1;

        Cidade c = lista.get(posicao);
        txtN.setText(c.getNome());
        txtC.setText(c.getCod().toString());
        

    }//GEN-LAST:event_btUltimoActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        Cidade c = new Cidade();
        String nome = JOptionPane.showInputDialog("Informe a cidade a ser pesquisada:");
        int posicaoachou = 0;
        boolean enc = false;
        for (Cidade cidade : lista) {
            if(nome.equals(cidade.getNome())){
                posicao = posicaoachou;
                enc = true;
                txtC.setText(cidade.getCod().toString());
                txtN.setText(cidade.getNome());
                
                break;
            }
            posicaoachou++;
        }
        if (enc == false){
            JOptionPane.showMessageDialog(null, "Essa cidade não está cadastrada!!!");
        }

    }//GEN-LAST:event_btConsActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcActionPerformed

    private void btLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimpActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        Cidade c = new Cidade();
        Boolean x = false;

        c.setCod(Integer.parseInt(txtC.getText()));
        c.setNome(txtN.getText());
        
        if(txtC.getText().isEmpty() || txtN.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!!");
        }
        else{
            try {
                c.setCod(Integer.parseInt(txtC.getText()));
                x = true;
            } catch (Exception e) {
                x = false;
                JOptionPane.showMessageDialog(rootPane, "O código deve ser numérico!!!");
            }
        }

        if (x==true){
            lista.add(c);
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!!" );
        }
        Limpar();
    }//GEN-LAST:event_btCadActionPerformed

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
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cidadeManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cidadeManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btLimp;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
