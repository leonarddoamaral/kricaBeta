package com.mycompany.kabeta;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaConfig extends javax.swing.JFrame {
    //declarando imagem do botao
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    public TelaConfig() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltaButtom = new javax.swing.JButton();
        editarPerfilbuttom = new javax.swing.JButton();
        SairContaButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        VoltaButtom.setToolTipText("");
        VoltaButtom.setBorder(null);
        VoltaButtom.setContentAreaFilled(false);
        VoltaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(VoltaButtom);
        VoltaButtom.setBounds(1130, 80, 160, 70);

        editarPerfilbuttom.setToolTipText("");
        editarPerfilbuttom.setBorder(null);
        editarPerfilbuttom.setContentAreaFilled(false);
        editarPerfilbuttom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarPerfilbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilbuttomActionPerformed(evt);
            }
        });
        getContentPane().add(editarPerfilbuttom);
        editarPerfilbuttom.setBounds(430, 250, 510, 100);

        SairContaButtom.setToolTipText("");
        SairContaButtom.setBorder(null);
        SairContaButtom.setContentAreaFilled(false);
        SairContaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairContaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairContaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(SairContaButtom);
        SairContaButtom.setBounds(430, 420, 500, 100);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaConfigImagem.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, -10, 1380, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairContaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairContaButtomActionPerformed
        // botao de sair da conta
         String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja voltar para a tela de login?(Digite sim ou não)","Voltar",JOptionPane.QUESTION_MESSAGE,quest,null,null);
        if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_SairContaButtomActionPerformed

    private void editarPerfilbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPerfilbuttomActionPerformed
        // declarando tela de editar usuario
        TelaEditarUsu editar = new TelaEditarUsu();
        editar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_editarPerfilbuttomActionPerformed

    private void VoltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaButtomActionPerformed
        // declarando tela anterior
        TelaInicial inicio = new TelaInicial();
        inicio.setVisible(true);
        this.dispose();                
    }//GEN-LAST:event_VoltaButtomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SairContaButtom;
    private javax.swing.JButton VoltaButtom;
    private javax.swing.JButton editarPerfilbuttom;
    private javax.swing.JLabel fundo;
    // End of variables declaration//GEN-END:variables

}
