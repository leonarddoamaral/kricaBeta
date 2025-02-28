
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Usuario;
import com.mycompany.kabeta.classes.DAO;
import javax.swing.*;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SenhaLabel = new javax.swing.JLabel();
        UsusLabel = new javax.swing.JLabel();
        EntrarButtom = new javax.swing.JButton();
        usuTextField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        mostraSenhaCheckBox = new javax.swing.JRadioButton();
        FundoTLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        SenhaLabel.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        SenhaLabel.setText("Senha:");
        getContentPane().add(SenhaLabel);
        SenhaLabel.setBounds(980, 420, 130, 30);

        UsusLabel.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        UsusLabel.setText("Usuário:");
        getContentPane().add(UsusLabel);
        UsusLabel.setBounds(970, 196, 150, 50);

        EntrarButtom.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        EntrarButtom.setForeground(new java.awt.Color(255, 255, 255));
        EntrarButtom.setBorder(null);
        EntrarButtom.setContentAreaFilled(false);
        EntrarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarButtom.setLabel("Entrar");
        EntrarButtom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EntrarButtomMouseMoved(evt);
            }
        });
        EntrarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntrarButtomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EntrarButtomMouseReleased(evt);
            }
        });
        EntrarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtomActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarButtom);
        EntrarButtom.setBounds(1010, 620, 180, 90);

        usuTextField.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        usuTextField.setBorder(null);
        usuTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuTextField);
        usuTextField.setBounds(980, 270, 270, 80);

        senhaField.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        senhaField.setBorder(null);
        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaField);
        senhaField.setBounds(980, 470, 250, 80);

        mostraSenhaCheckBox.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        mostraSenhaCheckBox.setText("Mostrar Senha");
        mostraSenhaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSenhaCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(mostraSenhaCheckBox);
        mostraSenhaCheckBox.setBounds(980, 560, 220, 30);

        FundoTLogin.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        FundoTLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaLoginImagem.png")); // NOI18N
        getContentPane().add(FundoTLogin);
        FundoTLogin.setBounds(0, 0, 1366, 760);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtomActionPerformed
    //declarando variaveis
    TelaInicial inicial = new TelaInicial();//tela
    ImageIcon entrou = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");//imagens
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");//imagem
    String login = usuTextField.getText();
    String senha = new String (senhaField.getPassword());
    //confere se o usuario existe
    try{
        Usuario usuario = new Usuario ();
        DAO dao = new DAO();
        usuario.setNome(login);
        usuario.setSenha(senha);
        if (dao.existeUsu(usuario)){
            JOptionPane.showMessageDialog (null, "Bem vindo(a), " +usuario.getNome() + "!","Login Correto",1,entrou);
            inicial.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário inválido","Algo deu errado",2,error);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog (null, "Problemas técnicos. Tentenovamente mais tarde","Erro",2,error);
        e.printStackTrace();
    }

    }//GEN-LAST:event_EntrarButtomActionPerformed

    private void EntrarButtomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtomMouseReleased
       
    }//GEN-LAST:event_EntrarButtomMouseReleased

    private void EntrarButtomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtomMousePressed

    }//GEN-LAST:event_EntrarButtomMousePressed

    private void EntrarButtomMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarButtomMouseMoved
        

    }//GEN-LAST:event_EntrarButtomMouseMoved

    private void mostraSenhaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSenhaCheckBoxActionPerformed
        // mostrar senha ou *
        
        if (mostraSenhaCheckBox.isSelected()) {
            senhaField.setEchoChar((char) 0); 
        }
        else {
            senhaField.setEchoChar('*');
        }
    }//GEN-LAST:event_mostraSenhaCheckBoxActionPerformed

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed
        
        senhaField.setEchoChar('*');
    }//GEN-LAST:event_senhaFieldActionPerformed

    private void usuTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuTextFieldActionPerformed
       
    }//GEN-LAST:event_usuTextFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButtom;
    private javax.swing.JLabel FundoTLogin;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JLabel UsusLabel;
    private javax.swing.JRadioButton mostraSenhaCheckBox;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JTextField usuTextField;
    // End of variables declaration//GEN-END:variables
}
