package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Vendas;
import com.mycompany.kabeta.classes.DAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastraVendas extends javax.swing.JFrame {
    //inicando variaveis
    double valor;
    String dia;
    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");
    ImageIcon quest = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoPerg.png");
    
    public TelaCadastraVendas() {
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clienteTxt = new javax.swing.JTextField();
        produtoTxt = new javax.swing.JTextField();
        ataulizaButtom = new javax.swing.JButton();
        precoButtom = new javax.swing.JButton();
        voltaButtom = new javax.swing.JButton();
        dataButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        clienteLabel.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        clienteLabel.setText("Cliente:");
        getContentPane().add(clienteLabel);
        clienteLabel.setBounds(920, 150, 160, 30);

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel1.setText("Produto:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 160, 250, 20);

        clienteTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        clienteTxt.setBorder(null);
        clienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTxtActionPerformed(evt);
            }
        });
        getContentPane().add(clienteTxt);
        clienteTxt.setBounds(900, 210, 290, 80);

        produtoTxt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        produtoTxt.setBorder(null);
        produtoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(produtoTxt);
        produtoTxt.setBounds(340, 210, 290, 80);

        ataulizaButtom.setBorder(null);
        ataulizaButtom.setBorderPainted(false);
        ataulizaButtom.setContentAreaFilled(false);
        ataulizaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ataulizaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataulizaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(ataulizaButtom);
        ataulizaButtom.setBounds(670, 600, 250, 70);

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
        precoButtom.setBounds(580, 340, 410, 90);

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
        voltaButtom.setBounds(1130, 50, 160, 80);

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
        dataButtom.setBounds(580, 470, 420, 90);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaCadastraVendaImagem.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1360, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtomActionPerformed
       //declarando tela anterior
        TelaVendas vendas = new TelaVendas();
        vendas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltaButtomActionPerformed

    private void produtoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoTxtActionPerformed
        
    }//GEN-LAST:event_produtoTxtActionPerformed

    private void clienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTxtActionPerformed
       
    }//GEN-LAST:event_clienteTxtActionPerformed

    private void precoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoButtomActionPerformed
       //dando valor para o valor
        valor = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Insira o preço","Preço",JOptionPane.QUESTION_MESSAGE,quest,null,null));
    }//GEN-LAST:event_precoButtomActionPerformed

    private void dataButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataButtomActionPerformed
        //dando valor a data
        dia = (String)JOptionPane.showInputDialog(null,"Insira a data da compra","ano-mes-dia",JOptionPane.QUESTION_MESSAGE,quest,null,null);
    }//GEN-LAST:event_dataButtomActionPerformed

    private void ataulizaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataulizaButtomActionPerformed
        //cadastrando no db
            try {
        Vendas vendas = new Vendas(); 
        String produto = produtoTxt.getText();
        Double preco = valor; 
        String cliente = clienteTxt.getText();
        String data = dia;

        vendas.setId(0);
        vendas.setProduto(produto);
        vendas.setPreco(preco);
        vendas.setCliente(cliente);
        vendas.setData(data);
        DAO dao = new DAO();
        if (dao.addVendas(vendas)){
            JOptionPane.showMessageDialog(null,"Adicionado com sucesso!!","Suceeso",1,boa);
            String pergunta = (String)JOptionPane.showInputDialog(null,"Deseja fechar a tela de cadastro?(Digite sim ou não)","Apenas sim ou não",JOptionPane.PLAIN_MESSAGE,quest,null,"");
            if(pergunta.equals("sim")||pergunta.equals("Sim")||pergunta.equals("SIM")){
                this.dispose();
                TelaVendas venda = new TelaVendas();
                venda.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Falha ao adicionar as vendas.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Erro ao converter número ou quantidade. Certifique-se de inserir valores válidos.");
        e.printStackTrace();
    } catch (Exception e) {
        System.out.println("Erro ao adicionar ao estoque: " + e.getMessage());
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_ataulizaButtomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastraVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataulizaButtom;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTextField clienteTxt;
    private javax.swing.JButton dataButtom;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton precoButtom;
    private javax.swing.JTextField produtoTxt;
    private javax.swing.JButton voltaButtom;
    // End of variables declaration//GEN-END:variables
}
