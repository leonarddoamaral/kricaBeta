
package com.mycompany.kabeta;
import javax.swing.*;

public class TelaInicial extends javax.swing.JFrame {
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    public TelaInicial() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltaButtom = new javax.swing.JButton();
        vendasButtom1 = new javax.swing.JButton();
        estoqueButtom1 = new javax.swing.JButton();
        configureButtom = new javax.swing.JButton();
        telaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        voltaButtom.setBorder(null);
        voltaButtom.setContentAreaFilled(false);
        voltaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(voltaButtom);
        voltaButtom.setBounds(1125, 73, 160, 80);

        vendasButtom1.setBorder(null);
        vendasButtom1.setBorderPainted(false);
        vendasButtom1.setContentAreaFilled(false);
        vendasButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vendasButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasButtom1ActionPerformed(evt);
            }
        });
        getContentPane().add(vendasButtom1);
        vendasButtom1.setBounds(430, 150, 500, 100);

        estoqueButtom1.setBorder(null);
        estoqueButtom1.setBorderPainted(false);
        estoqueButtom1.setContentAreaFilled(false);
        estoqueButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estoqueButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueButtom1ActionPerformed(evt);
            }
        });
        getContentPane().add(estoqueButtom1);
        estoqueButtom1.setBounds(440, 300, 500, 100);

        configureButtom.setBorder(null);
        configureButtom.setBorderPainted(false);
        configureButtom.setContentAreaFilled(false);
        configureButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configureButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureButtomActionPerformed(evt);
            }
        });
        getContentPane().add(configureButtom);
        configureButtom.setBounds(430, 460, 500, 100);

        telaFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaIncioImagem.png")); // NOI18N
        getContentPane().add(telaFundo);
        telaFundo.setBounds(0, 0, 1370, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void configureButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureButtomActionPerformed
        //declarando tela de configuração
       TelaConfig config = new TelaConfig();
       config.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_configureButtomActionPerformed

    private void estoqueButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueButtom1ActionPerformed
        // declarando tela de estoque
        TelaEstoque estoque = new TelaEstoque();
        estoque.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_estoqueButtom1ActionPerformed

    private void vendasButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasButtom1ActionPerformed
        // decalrando tela de vendas
        TelaVendas venda = new TelaVendas();
        venda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vendasButtom1ActionPerformed

    private void voltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtomActionPerformed
        // saindo do perfil
        String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja voltar para a tela de login?(Digite sim ou não)","Voltar",JOptionPane.QUESTION_MESSAGE,quest,null,null);
        if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_voltaButtomActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configureButtom;
    private javax.swing.JButton estoqueButtom1;
    private javax.swing.JLabel telaFundo;
    private javax.swing.JButton vendasButtom1;
    private javax.swing.JButton voltaButtom;
    // End of variables declaration//GEN-END:variables
}
