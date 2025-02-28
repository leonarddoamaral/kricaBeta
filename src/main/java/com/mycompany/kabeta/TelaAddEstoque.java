package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.DAO;
import com.mycompany.kabeta.classes.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaAddEstoque extends javax.swing.JFrame {
    //iniciando variaveis
    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    int numeros =0;
    int quantidades=0;
    public TelaAddEstoque() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltaButtom = new javax.swing.JToggleButton();
        nomeTxt = new javax.swing.JTextField();
        tipoTxt = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insereNum = new javax.swing.JToggleButton();
        inserirQtd = new javax.swing.JToggleButton();
        adiciona = new javax.swing.JToggleButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        voltaButtom.setSelected(true);
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

        nomeTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        nomeTxt.setBorder(null);
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTxt);
        nomeTxt.setBounds(350, 190, 280, 80);

        tipoTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        tipoTxt.setBorder(null);
        getContentPane().add(tipoTxt);
        tipoTxt.setBounds(910, 190, 290, 80);

        jLabel.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        jLabel.setText("Nome:");
        getContentPane().add(jLabel);
        jLabel.setBounds(350, 110, 130, 60);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(930, 130, 120, 40);

        insereNum.setContentAreaFilled(false);
        insereNum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insereNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereNumActionPerformed(evt);
            }
        });
        getContentPane().add(insereNum);
        insereNum.setBounds(580, 320, 420, 90);

        inserirQtd.setContentAreaFilled(false);
        inserirQtd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inserirQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirQtdActionPerformed(evt);
            }
        });
        getContentPane().add(inserirQtd);
        inserirQtd.setBounds(570, 440, 430, 100);

        adiciona.setContentAreaFilled(false);
        adiciona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaActionPerformed(evt);
            }
        });
        getContentPane().add(adiciona);
        adiciona.setBounds(660, 580, 270, 80);

        fundo.setBackground(new java.awt.Color(0, 0, 0));
        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaAddEstoqueImagem.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, -50, 1370, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insereNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereNumActionPerformed
        //pegando valor dos numerosw
        numeros = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Digite o número:","Números",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_insereNumActionPerformed

    private void inserirQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirQtdActionPerformed
        //pegamndo numero de quantidades
         quantidades = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Digite a quantidade:","Quantidade",JOptionPane.QUESTION_MESSAGE,quest,null,null));

    }//GEN-LAST:event_inserirQtdActionPerformed

    private void adicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaActionPerformed
    //cadastrando informações no banco de dados
        try {
    Estoque estoque = new Estoque(); 
    String nome = nomeTxt.getText();
    String tipo = tipoTxt.getText();
    int num=numeros;
    int qtd=quantidades; 
    
    estoque.setId(0);
    estoque.setNome(nome);
    estoque.setTipo(tipo);
    estoque.setNumero(num);
    estoque.setQuantidade(qtd);
    DAO dao = new DAO();
    if (dao.addEstoque(estoque)){
        JOptionPane.showMessageDialog(null,"Adicionado com sucesso!!","Sucesso!",1,boa);
        String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja fechar a tela de cadastro?(Digite sim ou não)","Pergunta",JOptionPane.QUESTION_MESSAGE,quest,null,null);
        if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){
            this.dispose();
            TelaEstoque voltar = new TelaEstoque();
            voltar.setVisible(true);
            
        }
    } else {
        JOptionPane.showMessageDialog(null,"Falha ao adicionar estoque.","Erro",2,error);
    }
} catch (NumberFormatException e) {
    System.out.println("Erro ao converter número ou quantidade. Certifique-se de inserir valores válidos.");
    e.printStackTrace();
} catch (Exception e) {
    System.out.println("Erro ao adicionar ao estoque: " + e.getMessage());
    e.printStackTrace();
}
    }//GEN-LAST:event_adicionaActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
 
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void voltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtomActionPerformed
        TelaEstoque voltar = new TelaEstoque();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltaButtomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton adiciona;
    private javax.swing.JLabel fundo;
    private javax.swing.JToggleButton insereNum;
    private javax.swing.JToggleButton inserirQtd;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JToggleButton voltaButtom;
    // End of variables declaration//GEN-END:variables

  

}
