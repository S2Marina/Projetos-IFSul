/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EmissoraTela extends javax.swing.JFrame {
    
    int posicao = 0;
    
    List<Emissora> lista;           
    
    public EmissoraTela() {
        initComponents();
        lista = new ArrayList <Emissora>();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        botLimpar = new javax.swing.JButton();
        selecExibicao = new javax.swing.JComboBox();
        botInserir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botPrimeiro = new javax.swing.JButton();
        botAnter = new javax.swing.JButton();
        botProx = new javax.swing.JButton();
        botUlt = new javax.swing.JButton();
        botExc = new javax.swing.JButton();
        botCons = new javax.swing.JButton();
        botAtu = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Exibição:");

        jLabel4.setBackground(new java.awt.Color(102, 0, 255));
        jLabel4.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("EMISSORA");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        botLimpar.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botLimpar.setForeground(new java.awt.Color(153, 102, 255));
        botLimpar.setText("Limpar");
        botLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimparActionPerformed(evt);
            }
        });

        selecExibicao.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        selecExibicao.setForeground(new java.awt.Color(153, 102, 255));
        selecExibicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Aberta", "Fechada" }));
        selecExibicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecExibicaoActionPerformed(evt);
            }
        });

        botInserir.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botInserir.setForeground(new java.awt.Color(153, 102, 255));
        botInserir.setText("Cadastrar Emissora");
        botInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInserirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 2, 24), new java.awt.Color(102, 0, 255))); // NOI18N

        botPrimeiro.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botPrimeiro.setForeground(new java.awt.Color(153, 102, 255));
        botPrimeiro.setText("Primeiro");
        botPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPrimeiroActionPerformed(evt);
            }
        });

        botAnter.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botAnter.setForeground(new java.awt.Color(153, 102, 255));
        botAnter.setText("Anterior");
        botAnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAnterActionPerformed(evt);
            }
        });

        botProx.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botProx.setForeground(new java.awt.Color(153, 102, 255));
        botProx.setText("Próximo");
        botProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botProxActionPerformed(evt);
            }
        });

        botUlt.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botUlt.setForeground(new java.awt.Color(153, 102, 255));
        botUlt.setText("Último");
        botUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botUltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botPrimeiro)
                .addGap(26, 26, 26)
                .addComponent(botAnter)
                .addGap(30, 30, 30)
                .addComponent(botProx)
                .addGap(26, 26, 26)
                .addComponent(botUlt)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botPrimeiro)
                    .addComponent(botAnter)
                    .addComponent(botProx)
                    .addComponent(botUlt))
                .addContainerGap())
        );

        botExc.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botExc.setForeground(new java.awt.Color(153, 102, 255));
        botExc.setText("Excluir");
        botExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcActionPerformed(evt);
            }
        });

        botCons.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botCons.setForeground(new java.awt.Color(153, 102, 255));
        botCons.setText("Consultar");
        botCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConsActionPerformed(evt);
            }
        });

        botAtu.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        botAtu.setForeground(new java.awt.Color(153, 102, 255));
        botAtu.setText("Atualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botExc)
                        .addGap(46, 46, 46)
                        .addComponent(botLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecExibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botAtu)
                        .addGap(45, 45, 45)
                        .addComponent(botCons)
                        .addGap(31, 31, 31)
                        .addComponent(botInserir)
                        .addGap(79, 79, 79))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selecExibicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botInserir)
                    .addComponent(botLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botCons)
                    .addComponent(botAtu)
                    .addComponent(botExc))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void botLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimparActionPerformed
        //botão limpar:
        Limpar();

    }//GEN-LAST:event_botLimparActionPerformed

    private void botInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInserirActionPerformed
        Emissora obj = new Emissora();
        obj.setNome(txtNome.getText());
        obj.setEndereco(txtEndereco.getText());
        if (selecExibicao.getSelectedItem().toString().equals("Aberta") == true){
            obj.setAberta(true);
        }
        else{
            obj.setAberta(true);
        }
        lista.add(obj);
        Limpar();
        JOptionPane.showMessageDialog(null, " Emissora cadastrada com sucesso!!!");
    }//GEN-LAST:event_botInserirActionPerformed

    private void botPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPrimeiroActionPerformed
        posicao = 0;
        //pegar o primeiro elemento da lista:
        Emissora elemento = lista.get(0);
        if (lista.size()>0){
            
            txtNome.setText(elemento.getNome());
            txtEndereco.setText(elemento.getEndereco());
            if(elemento.isAberta() == true){
                selecExibicao.setSelectedIndex(2);
            }
            else{
                selecExibicao.setSelectedIndex(1);
            }
        
        }
    }//GEN-LAST:event_botPrimeiroActionPerformed

    private void botAnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAnterActionPerformed
        posicao = lista.size() - 1;
        if(posicao > 0){// se tem mais de um elemento cadastrado ele mostra o anterior
            Emissora elemento = lista.get(posicao - 1);
            if (lista.size()>0){

                txtNome.setText(elemento.getNome());
                txtEndereco.setText(elemento.getEndereco());
                if(elemento.isAberta() == true){
                    selecExibicao.setSelectedIndex(2);
                }
                else{
                    selecExibicao.setSelectedIndex(1);
                }

        }
        }
        else{ // senão ele mostra o primeiro(o único q tem)
        Emissora elemento = lista.get(0);
        if (lista.size()>0){

                txtNome.setText(elemento.getNome());
                txtEndereco.setText(elemento.getEndereco());
                if(elemento.isAberta() == true){
                    selecExibicao.setSelectedIndex(2);
                }
                else{
                    selecExibicao.setSelectedIndex(1);
                }

            } 
        }
    }//GEN-LAST:event_botAnterActionPerformed

    private void botProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botProxActionPerformed
        Emissora elemento = lista.get(posicao + 1);
            if (lista.size()>0){

                txtNome.setText(elemento.getNome());
                txtEndereco.setText(elemento.getEndereco());
                if(elemento.isAberta() == true){
                    selecExibicao.setSelectedIndex(2);
                }
                else{
                    selecExibicao.setSelectedIndex(1);
                }

        }  
    }//GEN-LAST:event_botProxActionPerformed

    private void botUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botUltActionPerformed
         posicao = lista.size() - 2;
         Emissora elemento = lista.get(posicao + 1);
            if (lista.size()>0){

                txtNome.setText(elemento.getNome());
                txtEndereco.setText(elemento.getEndereco());
                if(elemento.isAberta() == true){
                    selecExibicao.setSelectedIndex(2);
                }
                else{
                    selecExibicao.setSelectedIndex(1);
                }
            }
    }//GEN-LAST:event_botUltActionPerformed

    private void selecExibicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecExibicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecExibicaoActionPerformed

    private void botExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_botExcActionPerformed

    private void botConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConsActionPerformed
        Emissora elemento = new Emissora();
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        int posicaoachou = 0;
        boolean enc = false;
        for (Emissora emissora : lista) {
            //perguntar se o nome informado é igual a algum nome da lista
            if(nome.equals(emissora.getNome())){
                posicao = posicaoachou;
                enc = true;
                txtNome.setText(elemento.getNome());
                txtEndereco.setText(elemento.getEndereco());
                if(elemento.isAberta() == true){
                    selecExibicao.setSelectedIndex(2);
                }
                else{
                    selecExibicao.setSelectedIndex(1);
                }
                //atualizo a posição:
                break;
            }
         }
        if (enc == false){
             JOptionPane.showMessageDialog(null, "Essa emissora não está cadastrada!!!");
        }
        posicaoachou++;
    }//GEN-LAST:event_botConsActionPerformed

    private void Limpar(){
        txtNome.setText("");
        txtEndereco.setText(""); 
        selecExibicao.setSelectedIndex(0);
    }  
    
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
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmissoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmissoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAnter;
    private javax.swing.JButton botAtu;
    private javax.swing.JButton botCons;
    private javax.swing.JButton botExc;
    private javax.swing.JButton botInserir;
    private javax.swing.JButton botLimpar;
    private javax.swing.JButton botPrimeiro;
    private javax.swing.JButton botProx;
    private javax.swing.JButton botUlt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox selecExibicao;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
