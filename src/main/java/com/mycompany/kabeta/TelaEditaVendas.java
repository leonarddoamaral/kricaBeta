
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Vendas;
import com.mycompany.kabeta.classes.DAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaEditaVendas extends javax.swing.JFrame {
    //declarando variaveis 
    int ide;
    double valor;
    String dia;
    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    public TelaEditaVendas() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteLabel = new javax.swing.JLabel();
        produtoLabel = new javax.swing.JLabel();
        clienteTxt = new javax.swing.JTextField();
        produtoTxt = new javax.swing.JTextField();
        voltaButtom = new javax.swing.JButton();
        dataButtom = new javax.swing.JButton();
        precoButtom = new javax.swing.JButton();
        apagaButtom = new javax.swing.JButton();
        atualizaButtom = new javax.swing.JButton();
        idButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        clienteLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        clienteLabel.setText("Cliente:");
        getContentPane().add(clienteLabel);
        clienteLabel.setBounds(900, 440, 190, 30);

        produtoLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        produtoLabel.setText("Produto:");
        getContentPane().add(produtoLabel);
        produtoLabel.setBounds(900, 296, 190, 30);

        clienteTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        clienteTxt.setBorder(null);
        getContentPane().add(clienteTxt);
        clienteTxt.setBounds(910, 490, 280, 80);

        produtoTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        produtoTxt.setBorder(null);
        getContentPane().add(produtoTxt);
        produtoTxt.setBounds(911, 342, 280, 80);

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
        voltaButtom.setBounds(1130, 50, 160, 70);

        dataButtom.setBorder(null);
        dataButtom.setBorderPainted(false);
        dataButtom.setContentAreaFilled(false);
        dataButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataButtomActionPerformed(evt);
            }
        });
        getContentPane().add(dataButtom);
        dataButtom.setBounds(340, 480, 410, 90);

        precoButtom.setBorder(null);
        precoButtom.setBorderPainted(false);
        precoButtom.setContentAreaFilled(false);
        precoButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        precoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoButtomActionPerformed(evt);
            }
        });
        getContentPane().add(precoButtom);
        precoButtom.setBounds(340, 350, 410, 90);

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
        apagaButtom.setBounds(830, 630, 260, 80);

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
        atualizaButtom.setBounds(470, 630, 260, 80);

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
        idButtom.setBounds(590, 180, 410, 90);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaEditaVendasImagem.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1330, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void precoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoButtomActionPerformed
        // declarando valor 
        valor = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Insira o preço","Valor",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_precoButtomActionPerformed

    private void dataButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataButtomActionPerformed
        // declarando valor do dia
        dia = (String)JOptionPane.showInputDialog(null,"Insira a data da compra","ano-mes-dia",JOptionPane.QUESTION_MESSAGE,quest,null,null);
    }//GEN-LAST:event_dataButtomActionPerformed

    private void idButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idButtomActionPerformed
        // informando id
        ide = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Insira o id da linha que deseja alterar","ID",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_idButtomActionPerformed

    private void atualizaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaButtomActionPerformed
        // cadastrando no db
        try{
            Vendas vendas = new Vendas();
            String produto = produtoTxt.getText();
            double preco = valor;
            String cliente = clienteTxt.getText();
            String data = dia;
            int id = ide;
            
            DAO dao = new DAO();
            
            vendas.setId(id);
            vendas.setProduto(produto);
            vendas.setPreco(preco);
            vendas.setCliente(cliente);
            vendas.setData(data);
            if(dao.editaVendas(vendas)){
                JOptionPane.showMessageDialog(null,"Alterado com sucesso","Sucesso!",1,boa);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao alterar as vendas","Erro",2,error);
                
            }   
        }catch(Exception e){
            System.out.println("erro ao alterar estoque: "+ e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizaButtomActionPerformed

    private void apagaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaButtomActionPerformed
        // TODO add your handling code here:
        String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja mesmo apagar o cadastro do ID "+ide+"?(Digite sim ou não)","ID",JOptionPane.QUESTION_MESSAGE,quest,null,null);
        if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){

            try {
               Vendas vendas = new Vendas();
               int id = ide; 
               vendas.setId(id); 
               DAO dao = new DAO();
               if (dao.apagaVendas(vendas)) {
                   JOptionPane.showMessageDialog(null, "Apagado com sucesso","Sucesso",1,boa);
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

    private void voltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtomActionPerformed
        // TODO add your handling code here:
        TelaVendas vendas = new TelaVendas();
        vendas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltaButtomActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagaButtom;
    private javax.swing.JButton atualizaButtom;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTextField clienteTxt;
    private javax.swing.JButton dataButtom;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton idButtom;
    private javax.swing.JButton precoButtom;
    private javax.swing.JLabel produtoLabel;
    private javax.swing.JTextField produtoTxt;
    private javax.swing.JButton voltaButtom;
    // End of variables declaration//GEN-END:variables
}
