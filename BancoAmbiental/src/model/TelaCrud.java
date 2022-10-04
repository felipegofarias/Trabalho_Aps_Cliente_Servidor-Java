/**
 * @author Felipe  
 */
package model;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import util.mascara;

public class TelaCrud extends javax.swing.JFrame{
    
    private static final long serialVersionUID = -5261903818373181455L;
        JPanel jPanel2 = new javax.swing.JPanel();
        JTabbedPane tpBanco = new javax.swing.JTabbedPane();
        JPanel pnGravar = new javax.swing.JPanel();
        JTextField tfLink = new javax.swing.JTextField();
        JTextField tfDescricao = new javax.swing.JTextField();
        JFormattedTextField tfData = new javax.swing.JFormattedTextField(); 
        JLabel lbLink = new javax.swing.JLabel();
        JLabel lbData = new javax.swing.JLabel();
        JLabel lbDescricao = new javax.swing.JLabel();
        JButton btGravar = new javax.swing.JButton();
        JPanel pnAlterar = new javax.swing.JPanel();
        JTextField tfAlLink = new javax.swing.JTextField();
        JFormattedTextField tfAlData = new javax.swing.JFormattedTextField();
        JTextField tfAlDescricao = new javax.swing.JTextField();
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        JLabel jLabel3 = new javax.swing.JLabel();
        JButton btAlterar = new javax.swing.JButton();
        JButton btAlConsultar = new javax.swing.JButton();
        JTextField tfAlConsulta = new javax.swing.JTextField();
        JPanel pnExcluir = new javax.swing.JPanel();
        JLabel jLabel4 = new javax.swing.JLabel();
        JTextField tfExLink = new javax.swing.JTextField();
        JFormattedTextField tfExData = new javax.swing.JFormattedTextField();
        JLabel jLabel5 = new javax.swing.JLabel();
        JTextField tfExDescricao = new javax.swing.JTextField();
        JLabel jLabel6 = new javax.swing.JLabel();
        JButton btExcluir = new javax.swing.JButton();
        JButton btExConsultar = new javax.swing.JButton();
        JButton btListar = new javax.swing.JButton();
        JTextField tfExConsulta = new javax.swing.JTextField();
        JPanel pnTitulo = new javax.swing.JPanel();
        JLabel lbTitulo = new javax.swing.JLabel();
            
        public TelaCrud(){
            
        
                 
        setTitle("Crud do Banco de dados - AMBIENTAL.net");
            
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


        lbLink.setText("Link");

        lbData.setText("Data");

        lbDescricao.setText("Descrição");

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGravarLayout = new javax.swing.GroupLayout(pnGravar);
        pnGravar.setLayout(pnGravarLayout);
        pnGravarLayout.setHorizontalGroup(
            pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGravarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGravarLayout.createSequentialGroup()
                        .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricao)
                            .addComponent(lbData)
                            .addComponent(lbLink))
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(pnGravarLayout.createSequentialGroup()
                        .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLink)
                            .addComponent(tfData, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(tfDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );
        pnGravarLayout.setVerticalGroup(
            pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGravarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGravar))
                .addGap(18, 18, 18)
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnGravarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        tpBanco.addTab("Gravar", pnGravar);

        jLabel1.setText("Link");

        jLabel2.setText("Data");

        jLabel3.setText("Descrição");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btAlConsultar.setText("Consultar");
        btAlConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAlterarLayout = new javax.swing.GroupLayout(pnAlterar);
        pnAlterar.setLayout(pnAlterarLayout);
        pnAlterarLayout.setHorizontalGroup(
            pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlterarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfAlLink)
                        .addComponent(tfAlData)
                        .addComponent(tfAlDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlConsultar)
                    .addComponent(tfAlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        pnAlterarLayout.setVerticalGroup(
            pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlterarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar))
                .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlterarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlterarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btAlConsultar)))
                .addGroup(pnAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlterarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlterarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tfAlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tpBanco.addTab("Alterar", pnAlterar);

        jLabel4.setText("Link");

        jLabel5.setText("Data");

        jLabel6.setText("Descrição");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btExConsultar.setText("Consultar");
        btExConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnExcluirLayout = new javax.swing.GroupLayout(pnExcluir);
        pnExcluir.setLayout(pnExcluirLayout);
        pnExcluirLayout.setHorizontalGroup(
            pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExcluirLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfExLink)
                        .addComponent(tfExData)
                        .addComponent(tfExDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExConsultar)
                    .addComponent(tfExConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        pnExcluirLayout.setVerticalGroup(
            pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExcluirLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfExLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir))
                .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnExcluirLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfExData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnExcluirLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btExConsultar)))
                .addGroup(pnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnExcluirLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfExDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnExcluirLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tfExConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tpBanco.addTab("Excluir", pnExcluir);

        pnTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitulo.setText("AMBIENTAL.NET");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpBanco))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setMask();
        pack();
        setLocationRelativeTo(null);
        
        }
        
        private void gravar(){
        String link = tfLink.getText();
        String data = tfData.getText();
        String descricao = tfDescricao.getText();
        System.out.println(new banco(link, data, descricao));
        limpar();
    }
        
        private void limpar(){
        tfLink.setText("");
        tfData.setText("");
        tfDescricao.setText("");
        tfLink.requestFocus();
    }
        private void limparEx(){
        tfExLink.setText("");
        tfExData.setText("");
        tfExDescricao.setText("");
        tfExConsulta.requestFocus();
    }
        
        private void limparAl(){
        tfAlLink.setText("");
        tfAlData.setText("");
        tfAlDescricao.setText("");
        tfAlConsulta.requestFocus();
    }
        
        private void consultaBanco(){
        banco banco = new banco();
        banco = DAO.bancoDAO.getInstance().findByCodigo(Integer.parseInt(tfAlConsulta.getText()));
        tfAlLink.setText(banco.getLink());
        tfAlData.setText(banco.getData());
        tfAlDescricao.setText(banco.getDescricao());
        
    }
        
        private void consultaExcluir(){
        banco banco = new banco();
        banco = DAO.bancoDAO.getInstance().findByCodigo(Integer.parseInt(tfExConsulta.getText()));
        tfExLink.setText(banco.getLink());
        tfExData.setText(banco.getData());
        tfExDescricao.setText(banco.getDescricao());
        
    }
        
    //Método altera db
    private void alterar(){
        int codigo = Integer.parseInt(tfAlConsulta.getText());
        String link = tfAlLink.getText();
        String data = tfAlData.getText();
        String descricao = tfAlDescricao.getText();
        limparAl();

        
        banco banco = new banco(link, data, descricao, codigo);
        DAO.bancoDAO.getInstance().update(banco);
    }
        
        private void excluir(){
        DAO.bancoDAO.getInstance().delete(Integer.parseInt(tfExConsulta.getText()));
        limparEx();
    }
        //Método mascara
        private void setMask(){
        tfData.setFormatterFactory(mascara.getDataMask());
        tfAlData.setFormatterFactory(mascara.getDataMask());
        tfExData.setFormatterFactory(mascara.getDataMask());

        
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
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrud().setVisible(true);
            }
        });
    }
                
                
        private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (tpBanco.getSelectedComponent() == pnGravar) gravar();
    }                                        

    private void btAlConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (tpBanco.getSelectedComponent() == pnAlterar) consultaBanco();
    }                                             

    private void btExConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (tpBanco.getSelectedComponent() == pnExcluir) consultaExcluir();
    }                                             

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                          
         if (tpBanco.getSelectedComponent() == pnAlterar) alterar();
    }                                         

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (tpBanco.getSelectedComponent() == pnExcluir) excluir();
    }
    
    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaConsulta tela = new TelaConsulta();
        if (tpBanco.getSelectedComponent() == pnGravar) tela.montaTabelaCliente();
    }

}
