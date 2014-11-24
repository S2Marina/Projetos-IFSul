package howard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {

    List<Roupas> listaA;
    List<Roupas> listaB;
    List<Roupas> listaC;
    List<Roupas> listaD;
    List<Roupas> listaE;
    public Tela() {
        initComponents();
        listaA = new ArrayList<Roupas> ();
        listaB = new ArrayList<Roupas> ();
        listaC = new ArrayList<Roupas> ();
        listaD = new ArrayList<Roupas> ();
        listaE = new ArrayList<Roupas> ();
    }
    
    private void Limpar(){
        txtDescricao.setText(" ");
        txtTipo.setText(" ");
        txtCor.setText(" ");
        cxPreferida.setSelectedIndex(0);
        cxFantasia.setSelectedIndex(0);
    }  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        cxPreferida = new javax.swing.JComboBox();
        cxFantasia = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExibir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Roupas do Howard");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("Cor:");

        jLabel6.setText("Essa roupa é uma das preferidas?");

        jLabel7.setText("Essa roupa é uma fantasia?");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        cxPreferida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        cxFantasia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExibir.setText("Exibir Roupas por Prateleira");
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btCadastrar)
                        .addGap(42, 42, 42)
                        .addComponent(btLimpar)
                        .addGap(37, 37, 37)
                        .addComponent(btExibir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxPreferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(88, Short.MAX_VALUE))
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
                            .addComponent(cxPreferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cxFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btExibir))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

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
        
        if(cxFantasia.getSelectedItem().equals("Sim")){
            r.setFantasia(true);
        }
        else{
            r.setFantasia(false);
        }
              
        if(p.qualPrateleira(r).equals("A")){
            listaA.add(r);
        }
        else if(p.qualPrateleira(r).equals("B")){
            listaB.add(r);
        }     
        else if(p.qualPrateleira(r).equals("C")){
            listaC.add(r);
        }
        else if(p.qualPrateleira(r).equals("D")){
            listaD.add(r);
        }
        else if(p.qualPrateleira(r).equals("E")){
            listaE.add(r);
        }
        
        Limpar();
        JOptionPane.showMessageDialog(null, " Roupa cadastrada com sucesso!!!");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
        int posicao = 0;
        
        
        JOptionPane.showMessageDialog(null,"Prateleira A:");   
        do{
            Roupas a = listaA.get(posicao);
           JOptionPane.showMessageDialog(null, a.retornoRoupa());            
        }while (posicao <= listaA.size());
        
        
        JOptionPane.showMessageDialog(null,"Prateleira B:");   
        do{
            Roupas b = listaB.get(posicao);
           JOptionPane.showMessageDialog(null, b.retornoRoupa());            
        }while (posicao <= listaB.size());
        
        
        JOptionPane.showMessageDialog(null,"Prateleira C:");   
        do{
            Roupas c = listaC.get(posicao);
           JOptionPane.showMessageDialog(null, c.retornoRoupa());            
        }while (posicao <= listaC.size());
        
       
        JOptionPane.showMessageDialog(null,"Prateleira D:");   
        do{
             Roupas d = listaD.get(posicao);
           JOptionPane.showMessageDialog(null, d.retornoRoupa());            
        }while (posicao <= listaD.size());
        
        
        JOptionPane.showMessageDialog(null,"Prateleira E:");   
        do{
            Roupas e = listaE.get(posicao);
           JOptionPane.showMessageDialog(null, e.retornoRoupa());            
        }while (posicao <= listaE.size());
    }//GEN-LAST:event_btExibirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox cxFantasia;
    private javax.swing.JComboBox cxPreferida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
