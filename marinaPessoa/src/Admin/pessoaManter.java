package Admin;

import Modelo.Pessoa;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class pessoaManter extends javax.swing.JFrame {

    List<Pessoa> lista;
    int posicao = 0;
    
    public pessoaManter() {
        initComponents();
        lista = new ArrayList<Pessoa>();
        }

    public void Limpar(){
        txtCod.setText(null);
        txtNome.setText(null);
        boxSexo.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxSexo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        btCons = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btLimp = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btListagem = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sexo:");

        boxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "M", "F" }));

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Pessoa");

        btListagem.setText("Listagem");
        btListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCod, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boxSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel4)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btListagem)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListagem)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        Pessoa p = new Pessoa();
        
        Boolean x = false;
        
         if(txtCod.getText().isEmpty() || txtNome.getText().isEmpty()|| boxSexo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!!");
        }
         else{
            try {
                  p.setCod(Integer.parseInt(txtCod.getText()));    
                  x = true;
                } catch (Exception e) {
                    x = false;
                   JOptionPane.showMessageDialog(rootPane, "O código deve ser numérico!!!");
                 }
         }
        
        p.setCod(Integer.parseInt(txtCod.getText()));
        p.setNome(txtNome.getText());
        p.setSexo(boxSexo.getSelectedItem().toString());
        
        
         if (x==true){
             lista.add(p);  
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!!" );
         }
         Limpar();
    }//GEN-LAST:event_btCadActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        Pessoa p = new Pessoa();
        String nome = JOptionPane.showInputDialog("Informe o nome a ser pesquisado:");
        int posicaoachou = 0;
        boolean enc = false;
        for (Pessoa pessoa : lista) {
            if(nome.equals(pessoa.getNome())){
                posicao = posicaoachou;
                enc = true;
                txtCod.setText(pessoa.getCod().toString());
                txtNome.setText(pessoa.getNome());
                if(pessoa.getSexo().equals("F")){
                    boxSexo.setSelectedIndex(2);
                }
                else{
                   boxSexo.setSelectedIndex(1); 
                }
                break;
            }
            posicaoachou++;
          }
          if (enc == false){
              JOptionPane.showMessageDialog(null, "Essa pessoa não está cadastrada!!!");
          }
    }//GEN-LAST:event_btConsActionPerformed

    private void btLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimpActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
       
        posicao = 0;
        
        Pessoa p = lista.get(0);
        if (lista.size()>0){ 
           txtNome.setText(p.getNome());
           txtCod.setText(p.getCod().toString());
           if(p.getSexo().equals("F")){
                boxSexo.setSelectedIndex(2);
           }
           else{
                boxSexo.setSelectedIndex(1);
           }
           
           if (lista.size() == 1)
            {
                btProximo.setEnabled(false);
                btAnterior.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma pessoa cadastrada!!!");
        }
       
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
        if(posicao > 0){
           posicao = posicao - 1;
           Pessoa p = lista.get(posicao);
           txtNome.setText(p.getNome());
           txtCod.setText(p.getCod().toString());
           if(p.getSexo().equals("F")){
                boxSexo.setSelectedIndex(2);
           }
           else{
                boxSexo.setSelectedIndex(1);
           }
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
        
        Pessoa p = lista.get(posicao);
        txtNome.setText(p.getNome());
        txtCod.setText(p.getCod().toString());
        if(p.getSexo().equals("F")){
             boxSexo.setSelectedIndex(2);
        }
        else{
             boxSexo.setSelectedIndex(1);
        }
        
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
         
        Pessoa p = lista.get(posicao);
        txtCod.setText(p.getCod().toString());
        if(p.getSexo().equals("F")){
             boxSexo.setSelectedIndex(2);
        }
        else{
             boxSexo.setSelectedIndex(1);
        }
        
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListagemActionPerformed
        pessoaListar lista = new pessoaListar();
        lista.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btListagemActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxSexo;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btLimp;
    private javax.swing.JButton btListagem;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
