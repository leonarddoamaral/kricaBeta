
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Usuario;
import com.mycompany.kabeta.classes.DAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaEditarUsu extends javax.swing.JFrame {

    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");;
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    public TelaEditarUsu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaTxt = new javax.swing.JPasswordField();
        nomeTxt = new javax.swing.JTextField();
        editaUsuTxt = new javax.swing.JTextField();
        editaSenhaTxt = new javax.swing.JTextField();
        novaSenhatxt = new javax.swing.JTextField();
        novoUsutxt = new javax.swing.JTextField();
        mostraSenha = new javax.swing.JRadioButton();
        okButtom = new javax.swing.JButton();
        apagaButtom = new javax.swing.JButton();
        atualizaButtom = new javax.swing.JButton();
        adicionaButtom = new javax.swing.JButton();
        VoltaButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        senhaTxt.setText("senha");
        senhaTxt.setBorder(null);
        getContentPane().add(senhaTxt);
        senhaTxt.setBounds(890, 190, 290, 30);

        nomeTxt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        nomeTxt.setText("Usuario");
        nomeTxt.setToolTipText("");
        nomeTxt.setBorder(null);
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt);
        nomeTxt.setBounds(890, 120, 290, 30);

        editaUsuTxt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        editaUsuTxt.setBorder(null);
        editaUsuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaUsuTxtActionPerformed(evt);
            }
        });
        getContentPane().add(editaUsuTxt);
        editaUsuTxt.setBounds(910, 370, 310, 70);

        editaSenhaTxt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        editaSenhaTxt.setBorder(null);
        editaSenhaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaSenhaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(editaSenhaTxt);
        editaSenhaTxt.setBounds(910, 540, 300, 70);

        novaSenhatxt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        novaSenhatxt.setBorder(null);
        novaSenhatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhatxtActionPerformed(evt);
            }
        });
        getContentPane().add(novaSenhatxt);
        novaSenhatxt.setBounds(370, 370, 310, 70);

        novoUsutxt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        novoUsutxt.setBorder(null);
        novoUsutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsutxtActionPerformed(evt);
            }
        });
        getContentPane().add(novoUsutxt);
        novoUsutxt.setBounds(360, 200, 320, 70);

        mostraSenha.setText("Mostrar");
        mostraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(mostraSenha);
        mostraSenha.setBounds(1220, 210, 64, 21);

        okButtom.setBorder(null);
        okButtom.setBorderPainted(false);
        okButtom.setContentAreaFilled(false);
        okButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtomActionPerformed(evt);
            }
        });
        getContentPane().add(okButtom);
        okButtom.setBounds(1230, 140, 120, 60);

        apagaButtom.setBorder(null);
        apagaButtom.setContentAreaFilled(false);
        apagaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(apagaButtom);
        apagaButtom.setBounds(860, 650, 200, 60);

        atualizaButtom.setBorder(null);
        atualizaButtom.setContentAreaFilled(false);
        atualizaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(atualizaButtom);
        atualizaButtom.setBounds(1090, 650, 200, 60);

        adicionaButtom.setBorder(null);
        adicionaButtom.setContentAreaFilled(false);
        adicionaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(adicionaButtom);
        adicionaButtom.setBounds(330, 490, 400, 60);

        VoltaButtom.setBorder(null);
        VoltaButtom.setContentAreaFilled(false);
        VoltaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(VoltaButtom);
        VoltaButtom.setBounds(300, 640, 160, 80);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaEditarUsuarioImagem.png")); // NOI18N
        fundo.setToolTipText("");
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1370, 760);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaButtomActionPerformed
        // declarando tela anterior
        TelaConfig config = new TelaConfig();
        config.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltaButtomActionPerformed

    private void adicionaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaButtomActionPerformed
        // adicionando usuario ao db
        try{
           
            String nome = novoUsutxt.getText();
            String senha = novaSenhatxt.getText();
            DAO dao = new DAO();
            Usuario usuario = new Usuario();
                       
            usuario.setNome(nome);
            usuario.setSenha(senha);
            if(dao.addUsu(usuario)){
                JOptionPane.showMessageDialog(null,"Adicionado com sucesso","Sucesso",1,boa);
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao adicionar","Erro",2,error);
            }
            
        } catch (Exception e) {
               System.out.println("Erro ao adicionar usuario: " + e.getMessage());
               e.printStackTrace();
        }
        
    }//GEN-LAST:event_adicionaButtomActionPerformed

    private void atualizaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaButtomActionPerformed
        //atualizando info do db
        try{
            Usuario usuario = new Usuario();
            String nome = editaUsuTxt.getText();
            String senha = editaSenhaTxt.getText();
            String velhoNome = nomeTxt.getText();
            DAO dao = new DAO();
            
            usuario.setNome(nome);
            usuario.setSenha(senha);
            usuario.setNomeVelho(velhoNome);
           
            if(dao.editaUsuario(usuario)){
                JOptionPane.showMessageDialog(null,"Alterado com sucesso","Sucesso",1,boa);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao alterar usuario","Sucesso",2,error);
                
            }   
        }catch(Exception e){
            System.out.println("erro ao alterar usuario: "+ e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizaButtomActionPerformed

    private void novoUsutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsutxtActionPerformed
       
    }//GEN-LAST:event_novoUsutxtActionPerformed

    private void novaSenhatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhatxtActionPerformed
        
    }//GEN-LAST:event_novaSenhatxtActionPerformed

    private void editaUsuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaUsuTxtActionPerformed
        
    }//GEN-LAST:event_editaUsuTxtActionPerformed

    private void editaSenhaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaSenhaTxtActionPerformed
        
    }//GEN-LAST:event_editaSenhaTxtActionPerformed

    private void apagaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaButtomActionPerformed
        //quest de apagar usuario
        String pergunta = (String)JOptionPane.showInputDialog( null,"Digite o nome do perfil que deseja apagar","Apaga",JOptionPane.QUESTION_MESSAGE,quest,null,null);
            try {
               Usuario usuario = new Usuario();
               
               usuario.setNome(pergunta); 
               DAO dao = new DAO();
               if (dao.apagaUsu(usuario)) {
                   JOptionPane.showMessageDialog(null, "Apagado com sucesso","Sucesso!",1,boa);
               } 
               else {
                   JOptionPane.showMessageDialog(null, "Falha ao apagar do estoque","Erro",2,error);
               }
           } catch (Exception e) {
               System.out.println("Erro ao apagar usuario: " + e.getMessage());
               e.printStackTrace();
           } finally {
               
           }
        
    }//GEN-LAST:event_apagaButtomActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void okButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtomActionPerformed
        // encontrando usuario
        try{
            String nome = nomeTxt.getText();
            String senha = senhaTxt.getText();
            
            DAO dao = new DAO();  
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setSenha(senha);
            if(dao.existeUsu(usuario)){
            editaUsuTxt.setText(usuario.getNome());
            editaSenhaTxt.setText(usuario.getSenha());
            JOptionPane.showMessageDialog(null, "Usuario encontrado!","Sucesso",1,boa);
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario não encontrado","Erro",2,error);
            }
        }catch(Exception e){
            System.out.println("erro ao procurar usuario: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Usuario não encontrado","Erro",2,error);
            e.printStackTrace();
        }
    }//GEN-LAST:event_okButtomActionPerformed

    private void mostraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSenhaActionPerformed
        //mostarSenha
        if (mostraSenha.isSelected()) {
            senhaTxt.setEchoChar((char) 0); 
        }
        else {
            senhaTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_mostraSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltaButtom;
    private javax.swing.JButton adicionaButtom;
    private javax.swing.JButton apagaButtom;
    private javax.swing.JButton atualizaButtom;
    private javax.swing.JTextField editaSenhaTxt;
    private javax.swing.JTextField editaUsuTxt;
    private javax.swing.JLabel fundo;
    private javax.swing.JRadioButton mostraSenha;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField novaSenhatxt;
    private javax.swing.JTextField novoUsutxt;
    private javax.swing.JButton okButtom;
    private javax.swing.JPasswordField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
