
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.DAO;
import com.mycompany.kabeta.classes.Estoque;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaEditarCadastro extends javax.swing.JFrame {
    //declarando variaveis
    int ide=0;
    int quanti =0;
    int nume = 0;
    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    public TelaEditarCadastro() {
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroButtom = new javax.swing.JToggleButton();
        quantidadeButtom = new javax.swing.JToggleButton();
        voltaButtom = new javax.swing.JToggleButton();
        apagaButtom = new javax.swing.JButton();
        atualizaButtom = new javax.swing.JButton();
        idButtom = new javax.swing.JToggleButton();
        nomeTxt = new javax.swing.JTextField();
        tipoTxt = new javax.swing.JTextField();
        javax.swing.JLabel nomeLabel = new javax.swing.JLabel();
        javax.swing.JLabel nomeLabel1 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        numeroButtom.setBorder(null);
        numeroButtom.setBorderPainted(false);
        numeroButtom.setContentAreaFilled(false);
        numeroButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        numeroButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroButtomActionPerformed(evt);
            }
        });
        getContentPane().add(numeroButtom);
        numeroButtom.setBounds(330, 330, 430, 100);

        quantidadeButtom.setBorder(null);
        quantidadeButtom.setContentAreaFilled(false);
        quantidadeButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quantidadeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeButtomActionPerformed(evt);
            }
        });
        getContentPane().add(quantidadeButtom);
        quantidadeButtom.setBounds(330, 460, 430, 100);

        voltaButtom.setBorder(null);
        voltaButtom.setBorderPainted(false);
        voltaButtom.setContentAreaFilled(false);
        voltaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(voltaButtom);
        voltaButtom.setBounds(1130, 30, 160, 80);

        apagaButtom.setBorder(null);
        apagaButtom.setBorderPainted(false);
        apagaButtom.setContentAreaFilled(false);
        apagaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(apagaButtom);
        apagaButtom.setBounds(830, 610, 260, 80);

        atualizaButtom.setBorder(null);
        atualizaButtom.setBorderPainted(false);
        atualizaButtom.setContentAreaFilled(false);
        atualizaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(atualizaButtom);
        atualizaButtom.setBounds(470, 613, 260, 80);

        idButtom.setBorder(null);
        idButtom.setBorderPainted(false);
        idButtom.setContentAreaFilled(false);
        idButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idButtomActionPerformed(evt);
            }
        });
        getContentPane().add(idButtom);
        idButtom.setBounds(580, 160, 430, 100);

        nomeTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        nomeTxt.setBorder(null);
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt);
        nomeTxt.setBounds(920, 330, 270, 80);

        tipoTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        tipoTxt.setBorder(null);
        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(tipoTxt);
        tipoTxt.setBounds(910, 470, 270, 80);

        nomeLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        nomeLabel.setText("Tipo:");
        getContentPane().add(nomeLabel);
        nomeLabel.setBounds(910, 420, 160, 40);

        nomeLabel1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        nomeLabel1.setText("Nome:");
        getContentPane().add(nomeLabel1);
        nomeLabel1.setBounds(910, 276, 160, 40);

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaEditarEstoqueImagem.png")); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 1380, 740);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tipoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxtActionPerformed
        
    }//GEN-LAST:event_tipoTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void idButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idButtomActionPerformed
        // declarando id
        ide = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Insira o id da linha que deseja alterar","ID",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_idButtomActionPerformed

    private void apagaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaButtomActionPerformed
        //apagando do db 
        String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja mesmo apagar o cadastro do ID "+ide+"?(Digite sim ou não)","APAGAR ID",JOptionPane.QUESTION_MESSAGE,quest,null,null);
        if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){

            try {
               Estoque estoque = new Estoque();
               int id = ide; 
               estoque.setId(id); 
               DAO dao = new DAO();
               if (dao.apagaEstoque(estoque)) {
                   JOptionPane.showMessageDialog(null, "Apagado com sucesso","Sucesso!",1,boa);
               } 
               else {
                   JOptionPane.showMessageDialog(null, "Falha ao apagar do estoque","Erro",2,error);
               }
           } catch (Exception e) {
               System.out.println("Erro ao apagar do estoque: " + e.getMessage());
               e.printStackTrace();
           } finally {
               
           }
        }
    }//GEN-LAST:event_apagaButtomActionPerformed

    private void atualizaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaButtomActionPerformed
       //atualizando valores
        try{
            Estoque estoque = new Estoque();
            String nome = nomeTxt.getText();
            String tipo = tipoTxt.getText();
            int qtd =quanti;
            int num = nume;       
            int id = ide;
            
            DAO dao = new DAO();
            
            estoque.setId(id);
            estoque.setNome(nome);
            estoque.setTipo(tipo);
            estoque.setNumero(num);
            estoque.setQuantidade(qtd);
            if(dao.editaEstoque(estoque)){
                JOptionPane.showMessageDialog(null,"Alterado com sucesso","Sucesso",1,boa);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao alterar o estoque","Sucesso",2,error);
                
            }   
        }catch(Exception e){
            System.out.println("erro ao alterar estoque: "+ e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizaButtomActionPerformed

    private void voltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtomActionPerformed
        //declarando tela anterior
        TelaEstoque volta = new TelaEstoque();
        volta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltaButtomActionPerformed

    private void quantidadeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeButtomActionPerformed
        //declarando quantidade
        quanti = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Digite a quantidade:","Quantidade",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_quantidadeButtomActionPerformed

    private void numeroButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroButtomActionPerformed
        //declarando numero
        nume = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Digite o número:","Números",JOptionPane.QUESTION_MESSAGE,quest,null,null));
        
    }//GEN-LAST:event_numeroButtomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton apagaButtom;
    private javax.swing.JButton atualizaButtom;
    private javax.swing.JToggleButton idButtom;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JToggleButton numeroButtom;
    private javax.swing.JToggleButton quantidadeButtom;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JToggleButton voltaButtom;
    // End of variables declaration//GEN-END:variables
}
