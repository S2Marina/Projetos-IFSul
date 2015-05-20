
package televisao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AtorTela extends javax.swing.JFrame {

    List<Ator> lista;
    int posicao = 0;
    Ator ator = new Ator();
    
    public AtorTela() {
        initComponents();
        lista = new ArrayList<Ator>();
    }
    
    public void Limpar(){
       txtNome.setText(" ");
       txtNasc.setText(" ");
       txtNovela.setText(" ");
       txtEmail.setText(" ");
       txtNomeart.setText(" ");
       txtSalario.setText(" ");
       txtCache.setText(" ");
       txtCidade.setText(" ");
       txtBairro.setText(" ");
       boxEstado.setSelectedIndex(0);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        txtNovela = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNomeart = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCache = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        boxEstado = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btStatus = new javax.swing.JButton();
        btGanhos = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ator");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de Nascimento:");

        jLabel4.setText("Novelas:");

        jLabel6.setText("Nome Artístico:");

        jLabel7.setText("Salário:");

        jLabel8.setText("Cachê:");

        jLabel9.setText("Estado:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Bairro:");

        txtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "RS", "SC", "PR" }));

        jLabel13.setText("Email:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        btPrimeiro.setText("Primeiro");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });

        btUltimo.setText("Último");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btPrimeiro)
                .addGap(26, 26, 26)
                .addComponent(btAnterior)
                .addGap(18, 18, 18)
                .addComponent(btProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPrimeiro)
                    .addComponent(btUltimo)
                    .addComponent(btAnterior)
                    .addComponent(btProximo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btStatus.setText("Exibir Status");
        btStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStatusActionPerformed(evt);
            }
        });

        btGanhos.setText("Exibir Ganhos");
        btGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGanhosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(131, 131, 131)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(62, 62, 62)
                                        .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGap(122, 122, 122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(123, 123, 123))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(327, 327, 327))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(120, 120, 120)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNovela, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNomeart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel6))
                                    .addGap(123, 123, 123))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(90, 90, 90)
                                    .addComponent(txtSalario))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(92, 92, 92)
                                    .addComponent(txtCache, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(btStatus)
                                .addGap(46, 46, 46)
                                .addComponent(btGanhos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btLimpar)
                                .addGap(47, 47, 47)
                                .addComponent(btExcluir)
                                .addGap(46, 46, 46)
                                .addComponent(btConsultar)
                                .addGap(40, 40, 40)
                                .addComponent(btInserir)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNovela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNomeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btStatus)
                    .addComponent(btGanhos))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btConsultar)
                    .addComponent(btInserir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
 
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascActionPerformed
  
    }//GEN-LAST:event_txtNascActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
   
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Ator ator = new Ator();
        ator.setNome(txtNome.getText());
        ator.setNasc(txtNasc.getText());
        ator.setEmail(txtEmail.getText());
        ator.setNome_art(txtNomeart.getText());
        ator.setNovelas(Double.parseDouble(txtNovela.getText()));
        ator.setSalario(Double.parseDouble(txtSalario.getText()));
        ator.setCache(Double.parseDouble(txtCache.getText()));
        ator.setEstado(boxEstado.getSelectedItem().toString());
        ator.setCidade(txtCidade.getText());
        ator.setBairro(txtBairro.getText());
                
        lista.add(ator); 
        posicao ++;
        JOptionPane.showMessageDialog(null, " Ator cadastrado com sucesso!!!");
        Limpar();
        
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
        Ator elemento = lista.get(0);
        if (lista.size() > 0){
            posicao = 0;
            txtNome.setText(elemento.getNome());
            txtNasc.setText(elemento.getNasc());
            txtNovela.setText(String.valueOf(elemento.getNovelas()));
            txtEmail.setText(elemento.getEmail());
            txtNomeart.setText(String.valueOf(elemento.getNome_art()));
            txtSalario.setText(String.valueOf(elemento.getSalario()));
            txtCache.setText(String.valueOf(elemento.getCache()));
            if (elemento.getEstado().equals("RS")){
               boxEstado.setSelectedIndex(1); 
            }
            else if(elemento.getEstado().equals("SC")){
                boxEstado.setSelectedIndex(2);
                }
            else{
                boxEstado.setSelectedIndex(3);
            }            
            txtCidade.setText(elemento.getCidade());
            txtBairro.setText(elemento.getBairro());
            
            if (lista.size() == 1)
            {
                btProximo.setEnabled(false);
                btAnterior.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhum ator cadastrado!!!");
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStatusActionPerformed
        Ator ator = lista.get(posicao);
        JOptionPane.showMessageDialog(null, " O status do ator é:" + ator.returnStatus());
    }//GEN-LAST:event_btStatusActionPerformed

    private void btGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGanhosActionPerformed
        Ator ator = lista.get(posicao);
        JOptionPane.showMessageDialog(null, " Os ganhos totais do ator são de:" + ator.calcularGanhos());
    }//GEN-LAST:event_btGanhosActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
        Ator elemento = lista.get(posicao - 1);
        if (lista.size() > 0){
       
            
            txtNome.setText(elemento.getNome());
            txtNasc.setText(elemento.getNasc());
            txtNovela.setText(elemento.getEmail());
            txtEmail.setText(elemento.getNome_art());
            txtNomeart.setText(String.valueOf(elemento.getNovelas()));
            txtSalario.setText(String.valueOf(elemento.getSalario()));
            txtCache.setText(String.valueOf(elemento.getCache()));
            
            if (elemento.getEstado().equals("RS")){
               boxEstado.setSelectedIndex(1); 
            }
            else if(elemento.getEstado().equals("SC")){
                boxEstado.setSelectedIndex(2);
                }
            else{
                boxEstado.setSelectedIndex(3);
            }         
            txtCidade.setText(elemento.getCidade());
            txtBairro.setText(elemento.getBairro());
            
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhum ator cadastrado!!!");
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);   
        
        Ator elemento = lista.get(lista.size() - 1);
            txtNome.setText(elemento.getNome());
            txtNasc.setText(elemento.getNasc());
            txtNovela.setText(elemento.getEmail());
            txtEmail.setText(elemento.getNome_art());
            txtNomeart.setText(String.valueOf(elemento.getNovelas()));
            txtSalario.setText(String.valueOf(elemento.getSalario()));
            txtCache.setText(String.valueOf(elemento.getCache()));
            if (elemento.getEstado().equals("RS")){
               boxEstado.setSelectedIndex(1); 
            }
            else if(elemento.getEstado().equals("SC")){
                boxEstado.setSelectedIndex(2);
                }
            else{
                boxEstado.setSelectedIndex(3);
            }         
            txtCidade.setText(elemento.getCidade());
            txtBairro.setText(elemento.getBairro());
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);        
        
        Ator elemento = lista.get(posicao + 1);
            txtNome.setText(elemento.getNome());
            txtNasc.setText(elemento.getNasc());
            txtNovela.setText(elemento.getEmail());
            txtEmail.setText(elemento.getNome_art());
            txtNomeart.setText(String.valueOf(elemento.getNovelas()));
            txtSalario.setText(String.valueOf(elemento.getSalario()));
            txtCache.setText(String.valueOf(elemento.getCache()));
            if (elemento.getEstado().equals("RS")){
               boxEstado.setSelectedIndex(1); 
            }
            else if(elemento.getEstado().equals("SC")){
                boxEstado.setSelectedIndex(2);
                }
            else{
                boxEstado.setSelectedIndex(3);
            }         
            txtCidade.setText(elemento.getCidade());
            txtBairro.setText(elemento.getBairro());
            
            // se lista.size - 1 == posicao é pq eu estou na ultima posicao, então eu desativo proximo e ultimo
            if (lista.size() - 1 == posicao)
            {
                btProximo.setEnabled(false);
                btUltimo.setEnabled(false);
            }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Ator a = new Ator();
        boolean enc = true;
        int posicao_consulta = 0;
        String at;
        at = JOptionPane.showInputDialog(" Informe o ator a ser consultado:");
        for (Ator ator : lista) {
           if(at.equals(a.getNome())){
                posicao = posicao_consulta;
                enc = true;
                
                txtNome.setText(a.getNome());
                txtNasc.setText(a.getNasc());
                txtNovela.setText(a.getEmail());
                txtEmail.setText(a.getNome_art());
                txtNomeart.setText(String.valueOf(a.getNovelas()));
                txtSalario.setText(String.valueOf(a.getSalario()));
                txtCache.setText(String.valueOf(a.getCache()));
                if (a.getEstado().equals("RS")){
                   boxEstado.setSelectedIndex(1); 
                }
                else if(a.getEstado().equals("SC")){
                    boxEstado.setSelectedIndex(2);
                    }
                else{
                    boxEstado.setSelectedIndex(3);
                }            
                txtCidade.setText(a.getCidade());
                txtBairro.setText(a.getBairro());
                break;
                
               }
            
            
            if (enc == false)
        {
            JOptionPane.showMessageDialog(null, "Ator ainda não cadastrado!");
        }
            posicao_consulta ++;
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    
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
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

              java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEstado;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGanhos;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btStatus;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCache;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeart;
    private javax.swing.JTextField txtNovela;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
