/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videolocadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Giulianno
 */
public class FormFilme extends javax.swing.JFrame {

    /**
     * Creates new form FormFilme
     */
    public FormFilme() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfTituloFilme = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfDiretorFilme = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btCadastra = new javax.swing.JButton();
        btConsulta = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vídeo Locadora");
        getContentPane().setLayout(new java.awt.GridLayout(6, 1));

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Vídeo Locadora");
        getContentPane().add(lbTitulo);

        jPanel1.setLayout(new java.awt.FlowLayout(0));

        jLabel1.setText("Título do Filme:");
        jPanel1.add(jLabel1);

        tfTituloFilme.setColumns(15);
        tfTituloFilme.setToolTipText("Digite o título do filme.");
        jPanel1.add(tfTituloFilme);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(0));

        jLabel2.setText("Diretor:");
        jPanel2.add(jLabel2);

        tfDiretorFilme.setColumns(15);
        jPanel2.add(tfDiretorFilme);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(0));

        jLabel3.setText("Gênero");
        jPanel3.add(jLabel3);

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Drama", "Romance", "Suspense", "Terror" }));
        jPanel3.add(cbGenero);

        getContentPane().add(jPanel3);

        btCadastra.setText("Cadastra");
        btCadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCadastraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCadastraMouseExited(evt);
            }
        });
        jPanel4.add(btCadastra);

        btConsulta.setText("Consulta");
        btConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btConsultaMouseExited(evt);
            }
        });
        jPanel4.add(btConsulta);

        btFechar.setText("Fechar");
        btFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFecharMouseExited(evt);
            }
        });
        jPanel4.add(btFechar);

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(0));

        jLabel4.setText("Status:");
        jPanel5.add(jLabel4);
        jPanel5.add(lbStatus);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastraMouseEntered
        // TODO add your handling code here:
        lbStatus.setText("Cadastra Filme!");
    }//GEN-LAST:event_btCadastraMouseEntered

    private void btCadastraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastraMouseExited
        // TODO add your handling code here:
        lbStatus.setText("");
    }//GEN-LAST:event_btCadastraMouseExited

    private void btConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConsultaMouseEntered
        // TODO add your handling code here:
        lbStatus.setText("Consulta Filme!");
    }//GEN-LAST:event_btConsultaMouseEntered

    private void btConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConsultaMouseExited
        // TODO add your handling code here:
        lbStatus.setText("");
    }//GEN-LAST:event_btConsultaMouseExited

    private void btFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseEntered
        // TODO add your handling code here:
        lbStatus.setText("Fechar!");
    }//GEN-LAST:event_btFecharMouseEntered

    private void btFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseExited
        // TODO add your handling code here:
        lbStatus.setText("");
    }//GEN-LAST:event_btFecharMouseExited

    private void btCadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastraMouseClicked
        // TODO add your handling code here:
        f = new Filme();
        f.setTitulo(tfTituloFilme.getText());
        f.setDiretor(tfDiretorFilme.getText());
        f.setGenero(cbGenero.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Filme Cadastrado!");
    }//GEN-LAST:event_btCadastraMouseClicked

    private void btConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConsultaMouseClicked
        // TODO add your handling code here:
        FormConsultaFilme consulta;
        
        if (f != null)
        {
            consulta = new FormConsultaFilme(f);
            consulta.atualizaCampos();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cadastre o filme primeiro!");
        }
    }//GEN-LAST:event_btConsultaMouseClicked

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
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastra;
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btFechar;
    private javax.swing.JComboBox cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfDiretorFilme;
    private javax.swing.JTextField tfTituloFilme;
    // End of variables declaration//GEN-END:variables
    Filme f = null;
}
