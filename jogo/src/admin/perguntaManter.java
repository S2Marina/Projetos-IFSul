package admin;

import dao.PerguntaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pergunta;

public class perguntaManter extends javax.swing.JFrame {
    
    List<Pergunta> lista;
    int posicao = 0;
    
    public perguntaManter() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        lista = dao.listar();
        }
    
    public void Limpar(){
        txtEnunciado.setText(null);
        txtA.setText(null);
        txtB.setText(null);
        txtC.setText(null);
        txtD.setText(null);
        boxNivel.setSelectedIndex(0);
        boxCerta.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtB = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btCons = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btLimp = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        btAt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btListagem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boxCerta = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        boxNivel = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btCons.setText("Consultar");
        btCons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });
        jPanel3.add(btCons);

        btExc.setText("Excluir");
        btExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });
        jPanel3.add(btExc);

        btLimp.setText("Limpar");
        btLimp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpActionPerformed(evt);
            }
        });
        jPanel3.add(btLimp);

        btCad.setText("Cadastrar");
        btCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        jPanel3.add(btCad);

        btAt.setText("Atualizar");
        btAt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtActionPerformed(evt);
            }
        });
        jPanel3.add(btAt);

        jLabel5.setText("A:");

        jLabel1.setText("Enunciado:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Navegação")));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        btPrimeiro.setText("Primeiro");
        btPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setText("Respostas:");

        btListagem.setText("Listagem");
        btListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListagemActionPerformed(evt);
            }
        });

        jLabel4.setText("Pergunta");

        jLabel6.setText("B:");

        jLabel7.setText("C:");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        jLabel8.setText("D:");

        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });

        jLabel9.setText("Resposta Certa:");

        boxCerta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "A", "B", "C", "D" }));

        jLabel10.setText("Nível:");

        boxNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "1", "2", "3", "4", "5" }));
        boxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNivelActionPerformed(evt);
            }
        });

        jLabel3.setText("ID:");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(369, 369, 369)
                            .addComponent(btListagem))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addComponent(jLabel4)))
                            .addGap(76, 76, 76)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(26, 26, 26)
                                            .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(boxCerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel2))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtId))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boxCerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btListagem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        Pergunta p = new Pergunta();
        Integer perg = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da pergunta a ser pesquisada:"));
        int posicaoachou = 0;
        boolean enc = false;
        
        for (Pergunta pergunta : lista) {
            if(perg == p.getId()){
                posicao = posicaoachou;
                enc = true;
                txtId.setText(p.getId().toString());
                txtEnunciado.setText(p.getEnunciado());
                txtA.setText(p.getA());
                txtC.setText(p.getC());
                txtB.setText(p.getB());
                txtD.setText(p.getD());
                boxNivel.setSelectedIndex(Integer.parseInt(p.getNivel().toString()));
                boxCerta.setSelectedItem(p.getCerta());
                break;
            }
          //  posicaoachou++;
        }
        if (enc == false){
            JOptionPane.showMessageDialog(null, "Essa pergunta não está cadastrada!!!");
        }
    }//GEN-LAST:event_btConsActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        if(txtId.getText().isEmpty() == false){
            PerguntaDAO dao = new PerguntaDAO();
            boolean x = dao.excluir(lista.get(posicao));
            if (x == true){
                JOptionPane.showMessageDialog(rootPane, "Excluído com sucesso!!!");
                lista = dao.listar();
                Limpar();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!!!");
            }
        }
    }//GEN-LAST:event_btExcActionPerformed

    private void btLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimpActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        Pergunta p = new Pergunta();
        Boolean x = false;

        if(txtEnunciado.getText().isEmpty() || txtA.getText().isEmpty()|| txtB.getText().isEmpty() || txtC.getText().isEmpty()|| txtD.getText().isEmpty()||boxNivel.getSelectedIndex()==0| boxCerta.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!!");
            x = false;
        }else{
            p.setEnunciado(txtEnunciado.getText());
            p.setA(txtA.getText());
            p.setB(txtB.getText());
            p.setC(txtC.getText());
            p.setD(txtD.getText());
            p.setCerta(boxCerta.getSelectedItem().toString());
            p.setNivel(Integer.parseInt(boxNivel.getSelectedItem().toString()));
            x = true;
        }  
            
       if(x == true){
            PerguntaDAO dao = new PerguntaDAO();
            dao.inserir(p);
            lista = dao.listar();
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!!" );
            Limpar();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar!!!" );
        }
    }//GEN-LAST:event_btCadActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = 0;

        if (lista.size()>0){
            Pergunta p = lista.get(0);
            txtEnunciado.setText(p.getEnunciado());
            txtId.setText(p.getId().toString());
            txtA.setText(p.getA());
            txtB.setText(p.getB());
            txtC.setText(p.getC());
            txtD.setText(p.getD());
            boxNivel.setSelectedItem(p.getNivel().toString());
            boxCerta.setSelectedItem(p.getCerta());

            if (lista.size() == 1)
            {
                btProximo.setEnabled(false);
                btAnterior.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma pergunta cadastrada!!!");
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed

        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        if(posicao > 0){
            posicao = posicao - 1;
            Pergunta p = lista.get(posicao);
            txtEnunciado.setText(p.getEnunciado());
            txtId.setText(p.getId().toString());
            txtA.setText(p.getA());
            txtB.setText(p.getB());
            txtC.setText(p.getC());
            txtD.setText(p.getD());
            boxNivel.setSelectedItem(p.getNivel().toString());
            boxCerta.setSelectedItem(p.getCerta());
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhum jogador cadastrado!!!");
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);

        posicao = posicao + 1;

        Pergunta p = lista.get(posicao);
        txtEnunciado.setText(p.getEnunciado());
        txtId.setText(p.getId().toString());
        txtA.setText(p.getA());
        txtB.setText(p.getB());
        txtC.setText(p.getC());
        txtD.setText(p.getD());
        boxNivel.setSelectedItem(p.getNivel().toString());
        boxCerta.setSelectedItem(p.getCerta());

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

        Pergunta p = lista.get(posicao);
        txtEnunciado.setText(p.getEnunciado());
        txtId.setText(p.getId().toString());
        txtA.setText(p.getA());
        txtB.setText(p.getB());
        txtC.setText(p.getC());
        txtD.setText(p.getD());
        boxNivel.setSelectedItem(p.getNivel().toString());
        boxCerta.setSelectedItem(p.getCerta());
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListagemActionPerformed
        perguntaListar lista = new perguntaListar();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btListagemActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDActionPerformed

    private void boxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNivelActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtActionPerformed
        if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Registro não informado!!!");
        }
        else{
            Pergunta p = new Pergunta();
            p.setId(Integer.parseInt(txtId.getText()));
            p.setEnunciado(txtEnunciado.getText());
            p.setCerta(boxCerta.getSelectedItem().toString());
            p.setNivel(Integer.parseInt(boxNivel.getSelectedItem().toString()));
            
            PerguntaDAO dao = new PerguntaDAO();
            boolean x;
            x = dao.atualizar(p);

            if(x==true){
                JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso!!!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao alterar o registro!!!");
            }
            lista = dao.listar();
        }
    }//GEN-LAST:event_btAtActionPerformed

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
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCerta;
    private javax.swing.JComboBox boxNivel;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btAt;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btLimp;
    private javax.swing.JButton btListagem;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
