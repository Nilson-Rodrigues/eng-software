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
public class TelaPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
         //Ordenação da tabela
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        jtLivros.setRowSorter(new TableRowSorter(modelo));

        //Chamando a readJtable para assim que abrir a pagina ja fazer a leitura dos dados
        readJtable();

    }
    
        public void readJtable() {
        //metodo para fazer a leitura da tabela da pagina inicial junto com um contador
        
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        modelo.setNumRows(0);
        LivroDAO livroDAO = new LivroDAO();
        int cont = 0;
        
        for (Livros livro : livroDAO.read()) {
            if(livro.getStatus()!= TRUE){
            modelo.addRow(new Object[]{
                livro.getId(), livro.getNome(),
                livro.getAutor(), livro.getAssunto(),
                livro.getStatus()
            });
            cont++;
            }
        }

            String contador = String.valueOf(cont);
            txtQtd.setText(contador);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jlBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jlLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/icons8-login-80 .png"))); // NOI18N
        jlLogin.setText("jLabel2");
        jlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLoginMouseClicked(evt);
            }
        });
        getContentPane().add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/Icone de busca.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, -1));

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 450, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faça uma busca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Autor", "Assunto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLivros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 250));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Pesquise livros que estejam disponiveis)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Livros indisponiveis para emprestimo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade de livros emprestados:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, -1, 20));

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        getContentPane().add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 618, 40, -1));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/biblioteca.jpg"))); // NOI18N
        jlBackground.setText("jLabel1");
        getContentPane().add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 680));

        jMenuBar1.setBackground(new java.awt.Color(102, 0, 102));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user.png"))); // NOI18N
        jMenu1.setText("Usuarios");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user_add.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user_delete.png"))); // NOI18N
        jMenuItem2.setText("Excluir");
        jMenu1.add(jMenuItem2);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user_edit.png"))); // NOI18N
        jMenuItem6.setText("Alterar");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/book_open.png"))); // NOI18N
        jMenu2.setText("Livros");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/book_add.png"))); // NOI18N
        jMenuItem3.setText("Cadastrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/book_delete.png"))); // NOI18N
        jMenuItem4.setText("Excluir");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/book_edit.png"))); // NOI18N
        jMenuItem5.setText("Alterar");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Ação ao clicar no menu item Usuarios, Cadastrar:
        //new TelaLogin().setVisible(true);
        new TelaCadastroCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Ação ao clicar no menu item livros, Cadastrar:
        new TelaCadastroLivros().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseClicked
        // Ação ao clicar na imagem de login
        new TelaLogin(false).setVisible(true);
    }//GEN-LAST:event_jlLoginMouseClicked

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Ação ao clicar na lupa do campo de busca
        new TelaBuscar(txtBusca.getText()).setVisible(true);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JTable jtLivros;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
