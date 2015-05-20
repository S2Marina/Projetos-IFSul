package televisao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NovelaTela extends javax.swing.JFrame {
    List <Novela> lista;
    
    int posicao = 0;
    
    public NovelaTela() {
        initComponents();
        lista = new ArrayList <Novela>();
    }

    public void Limpar(){
       txtTitulo.setText(" ");
       txtDuracao.setText(" ");
       txtHorario.setText(" ");
       txtAutor.setText(" ");
       txtEmissora.setText(" ");
       txtAudiencia.setText(" ");
       v.setSelectedIndex(0);
       s.setSelectedIndex(0);
       d.setSelectedIndex(0);
    }
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btInserir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        d = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        s = new javax.swing.JComboBox();
        txtDuracao = new javax.swing.JTextField();
        hora = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        duracao = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        emissora = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtEmissora = new javax.swing.JTextField();
        ibope = new javax.swing.JLabel();
        txtAudiencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        v = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(24, 24, 24)
                .addComponent(btPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btAnterior)
                .addGap(33, 33, 33)
                .addComponent(btProximo)
                .addGap(27, 27, 27)
                .addComponent(btUltimo)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPrimeiro)
                    .addComponent(btUltimo)
                    .addComponent(btAnterior)
                    .addComponent(btProximo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Novela");

        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        jLabel5.setText("Uso de drogas:");

        s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));

        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        hora.setText("Horário:");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        duracao.setText("Duração:");

        titulo.setText("Título:");

        autor.setText("Autor:");

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        emissora.setText("Emissora:");

        ibope.setText("Audiência:");

        txtAudiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAudienciaActionPerformed(evt);
            }
        });

        jLabel2.setText("- A novela contém cenas de:");

        jLabel3.setText("Violência:");

        v.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sim", "Não" }));
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duracao)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(v, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addComponent(hora)
                                    .addComponent(autor)
                                    .addComponent(emissora)
                                    .addComponent(ibope))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmissora, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHorario)
                                    .addComponent(txtAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracao)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emissora)
                    .addComponent(txtEmissora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibope)
                    .addComponent(txtAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addGap(26, 26, 26)
                .addComponent(btConsultar)
                .addGap(27, 27, 27)
                .addComponent(btLimpar)
                .addGap(31, 31, 31)
                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btLimpar)
                    .addComponent(btConsultar)
                    .addComponent(btExcluir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        
    }//GEN-LAST:event_vActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Novela n = new Novela();
        Emissora e = new Emissora();
        int clas;
        
        n.setTitulo(txtTitulo.getText());
        n.setDuracao(txtDuracao.getText());
        n.setHora(txtHorario.getText());
        n.setAutor(txtAutor.getText());
       
        e.setNome(txtEmissora.getText());
        e.setEndereco("Rua Jd. Botanico...");
        e.setAberta(true);
        n.setEmissora(e);
       
        if(v.getSelectedItem().equals("Sim")){
            n.setViolencia(true);
        }
        else{
            n.setViolencia(false);
        }
        
        if(s.getSelectedItem().equals("Sim")){
            n.setSexo(true);
        }
        else{
            n.setSexo(false);
        }
        
        if(d.getSelectedItem().equals("Sim")){
            n.setDrogas(true);
        }
        else{
            n.setDrogas(false);
        }
       
        n.setAudiencia(Double.parseDouble(txtAudiencia.getText()));
        n.obterClassificacao();
        
        lista.add(n);
        posicao ++;
        JOptionPane.showMessageDialog(null, " Novela cadastrada com sucesso!!!");
        Limpar();
        
    
    }//GEN-LAST:event_btInserirActionPerformed
    
    
    private void txtAudienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAudienciaActionPerformed

    }//GEN-LAST:event_txtAudienciaActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
       
        Novela elemento = lista.get(0);
        
        
        if (lista.size() > 0){
            posicao = 0;
            txtTitulo.setText(elemento.getTitulo());
            txtDuracao.setText(elemento.getDuracao());
            txtHorario.setText(elemento.getHora());
            txtAutor.setText(elemento.getAutor());
            txtEmissora.setText(elemento.getEmissora().getNome());
            txtAudiencia.setText(String.valueOf(elemento.getAudiencia()));
            
            if (elemento.isViolencia() == true){
               v.setSelectedIndex(1); 
            }
            else{ 
                v.setSelectedIndex(2);
            }

            if (elemento.isSexo() == true){
                   s.setSelectedIndex(1); 
                }
            else{ 
                    s.setSelectedIndex(2);
                    }
        
            if (elemento.isDrogas() == true){
                   d.setSelectedIndex(1); 
                }
            else{
                    d.setSelectedIndex(2);
                    }
             }
            
       if (lista.size() - 1 == posicao){
            btProximo.setEnabled(false);
            btUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
       
        Novela elemento = lista.get(0);
        
        
        if (lista.size() > 0){
            posicao = 0;
            txtTitulo.setText(elemento.getTitulo());
            txtDuracao.setText(elemento.getDuracao());
            txtHorario.setText(elemento.getHora());
            txtAutor.setText(elemento.getAutor());
            txtEmissora.setText(elemento.getEmissora().getNome());
            txtAudiencia.setText(String.valueOf(elemento.getAudiencia()));
            
            if (elemento.isViolencia() == true){
               v.setSelectedIndex(1); 
            }
            else{ 
                v.setSelectedIndex(2);
            }

            if (elemento.isSexo() == true){
                   s.setSelectedIndex(1); 
                }
            else{ 
                    s.setSelectedIndex(2);
                    }
        
            if (elemento.isDrogas() == true){
                   d.setSelectedIndex(1); 
                }
            else{
                    d.setSelectedIndex(2);
                    }
             }
            
       if (lista.size() == 1){
            btProximo.setEnabled(false);
            btAnterior.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há nenhuma novela cadastrada!!!");
        }
                                
       
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        
       
        Novela elemento = lista.get(0);
        
        
        if (lista.size() > 0){
            posicao = 0;
            txtTitulo.setText(elemento.getTitulo());
            txtDuracao.setText(elemento.getDuracao());
            txtHorario.setText(elemento.getHora());
            txtAutor.setText(elemento.getAutor());
            txtEmissora.setText(elemento.getEmissora().getNome());
            txtAudiencia.setText(String.valueOf(elemento.getAudiencia()));
            
            if (elemento.isViolencia() == true){
               v.setSelectedIndex(1); 
            }
            else{ 
                v.setSelectedIndex(2);
            }

            if (elemento.isSexo() == true){
                   s.setSelectedIndex(1); 
                }
            else{ 
                    s.setSelectedIndex(2);
                    }
        
            if (elemento.isDrogas() == true){
                   d.setSelectedIndex(1); 
                }
            else{
                    d.setSelectedIndex(2);
                    }
             }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);
        
       
        Novela elemento = lista.get(0);
        
        
        if (lista.size() > 0){
            posicao = 0;
            txtTitulo.setText(elemento.getTitulo());
            txtDuracao.setText(elemento.getDuracao());
            txtHorario.setText(elemento.getHora());
            txtAutor.setText(elemento.getAutor());
            txtEmissora.setText(elemento.getEmissora().getNome());
            txtAudiencia.setText(String.valueOf(elemento.getAudiencia()));
            
            if (elemento.isViolencia() == true){
               v.setSelectedIndex(1); 
            }
            else{ 
                v.setSelectedIndex(2);
            }

            if (elemento.isSexo() == true){
                   s.setSelectedIndex(1); 
                }
            else{ 
                    s.setSelectedIndex(2);
                    }
        
            if (elemento.isDrogas() == true){
                   d.setSelectedIndex(1); 
                }
            else{
                    d.setSelectedIndex(2);
                    }
             }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Novela elemento = new Novela();
        boolean enc = true;
        int posicao_consulta = 0;
        String at;
        at = JOptionPane.showInputDialog(" Informe a novela a ser consultada:");
        for (Novela novela : lista) {
           if(at.equals(elemento.getTitulo())){
                posicao = posicao_consulta;
                enc = true;
                txtDuracao.setText(elemento.getDuracao());
                txtHorario.setText(elemento.getHora());
                txtAutor.setText(elemento.getAutor());
                txtEmissora.setText(elemento.getEmissora().getNome());
                txtAudiencia.setText(String.valueOf(elemento.getAudiencia()));

                if (elemento.isViolencia() == true){
                   v.setSelectedIndex(1); 
                }
                else{ 
                    v.setSelectedIndex(2);
                }

                if (elemento.isSexo() == true){
                       s.setSelectedIndex(1); 
                    }
                else{ 
                        s.setSelectedIndex(2);
                        }

                if (elemento.isDrogas() == true){
                       d.setSelectedIndex(1); 
                    }
                else{
                        d.setSelectedIndex(2);
                        }
                 }
                break;
                
               }
            
            
            if (enc == false)
        {
            JOptionPane.showMessageDialog(null, "Novela ainda não cadastrada!");
        }
       posicao_consulta ++;
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
            java.util.logging.Logger.getLogger(NovelaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovelaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovelaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovelaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovelaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btUltimo;
    private javax.swing.JComboBox d;
    private javax.swing.JLabel duracao;
    private javax.swing.JLabel emissora;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel ibope;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox s;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtAudiencia;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtEmissora;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JComboBox v;
    // End of variables declaration//GEN-END:variables
}

