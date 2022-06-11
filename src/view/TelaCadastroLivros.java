/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import connection.ConnectionFactory;
import static java.lang.Boolean.TRUE;
import model.bean.Livros;
import model.dao.LivroDAO;

/**
 *
 * @author User
 */
public class TelaCadastroLivros extends javax.swing.JFrame {

    //Intânciando as variaveis necessarias para manipular o banco de dados
    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    //chamando a classe Livros
    Livros livro = new Livros();

    /**
     * Creates new form TelaCadastroLivros
     */
    public TelaCadastroLivros() {
        initComponents();

        //Ordenação da tabela
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        jtLivros.setRowSorter(new TableRowSorter(modelo));

        //Chamando a readJtable para assim que abrir a pagina ja fazer a leitura dos dados
        readJtable();

    }

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        modelo.setNumRows(0);
        LivroDAO livroDAO = new LivroDAO();

        for (Livros livro : livroDAO.read()) {
            modelo.addRow(new Object[]{
                livro.getId(), livro.getNome(),
                livro.getAutor(), livro.getAssunto(),
                livro.getStatus()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtAssunto = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de cadastro"));

        jLabel1.setText("Autor: *");

        jLabel2.setText("Nome: *");

        jLabel3.setText("Assunto:");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Status:");

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("* Campos obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(235, 278, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAssunto)
                            .addComponent(txtStatus)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 117, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCadastrar)))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAtualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Autor", "Assunto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLivrosMouseClicked(evt);
            }
        });
        jtLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLivrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtLivros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // Ação ao clicar no botão cadastrar

        /*
      // if(txtNome.equals("")||txtAutor.equals("")||txtAssunto.equals("")||txtStatus.equals("")){
           
            DefaultTableModel dtmProduto = (DefaultTableModel)jtLivros.getModel();
           Object[] dados = {txtNome.getText(),txtAutor.getText(),txtAssunto.getText(),txtStatus.getText()};
           dtmProduto.addRow(dados);
           
      // }else{
           
      //    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
           
      // }  */
        //Metodo Create para o banco de dados
        LivroDAO dao = new LivroDAO();

        //Validação dos campos
        if (txtNome.getText().isEmpty() || txtAutor.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios! ");

        } else {
            //Campos validados, logo será criado no banco de dados
            livro.setNome(txtNome.getText());
            livro.setAutor(txtAutor.getText());
            livro.setAssunto(txtAssunto.getText());
            livro.setStatus(TRUE);
            livro.setCpfUserEmp("");

            dao.create(livro);

            //Limpar os campos após o cadastro
            txtNome.setText("");
            txtAutor.setText("");
            txtAssunto.setText("");

            //Chamando a readJtable para mostra os dados do banco
            readJtable();

        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Ação ao clicar no botão EXCLUIR

        //System.out.println("Linha selecionada"+ jtLivros.getSelectedRow()); //para testar a função SelectedRow
        if (jtLivros.getSelectedRow() != -1) {
            //Metodo Create para o banco de dados
            LivroDAO dao = new LivroDAO();
            
            livro.setId((int) jtLivros.getValueAt(jtLivros.getSelectedRow(), 0));

            dao.delete(livro);
            
            txtNome.setText("");
            txtAssunto.setText("");
            txtAutor.setText("");
            txtStatus.setText("");

            //Chamando a readJtable para mostra os dados do banco
            readJtable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um livro para excluir");
        }


    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // Ação ao clicar no botão ATUALIZAR

        switch (JOptionPane.showConfirmDialog(null, "Deseja fazer a atualização", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)) {

            case 0:

                if (jtLivros.getSelectedRow() != -1) {

                    //Metodo Create para o banco de dados
                    LivroDAO dao = new LivroDAO();

                    //Campos validados, logo será criado no banco de dados
                    livro.setNome(txtNome.getText());
                    livro.setAutor(txtAutor.getText());
                    livro.setAssunto(txtAssunto.getText());
                    livro.setStatus(Boolean.parseBoolean(txtStatus.getText()));
                    livro.setId((int) jtLivros.getValueAt(jtLivros.getSelectedRow(), 0));

                    dao.update(livro);

                    //Limpar os campos após atualizar
                    txtNome.setText("");
                    txtAutor.setText("");
                    txtAssunto.setText("");

                    //Chamando a readJtable para mostra os dados do banco
                    readJtable();

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um livro para atualizar");
                }
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Nenhuma mudança foi feita!");
                break;

        }


    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtLivrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLivrosKeyReleased
        // Ação de navegar sobre a tabela com as setas do teclado(Opcional)

        if (jtLivros.getSelectedRow() != -1) {

            txtNome.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 1).toString());
            txtAutor.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 2).toString());
            txtAssunto.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 3).toString());
            txtStatus.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_jtLivrosKeyReleased

    private void jtLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivrosMouseClicked
        // Ação de click na tabela para setar os valores nos campos
        if (jtLivros.getSelectedRow() != -1) {

            txtNome.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 1).toString());
            txtAutor.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 2).toString());
            txtAssunto.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 3).toString());
            txtStatus.setText(jtLivros.getValueAt(jtLivros.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_jtLivrosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable jtLivros;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}
