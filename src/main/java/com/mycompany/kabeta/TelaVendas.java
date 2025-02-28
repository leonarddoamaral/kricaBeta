
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Vendas;
import com.mycompany.kabeta.classes.DAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVendas extends javax.swing.JFrame {
    //delcarando variaveis
    int pergunta;
    ImageIcon boa = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoNormal.png");
    ImageIcon error = new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoErro.png");
    
    public TelaVendas() {
        initComponents();
        carregarTabela();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cadastraButtom = new javax.swing.JButton();
        cbMeses = new javax.swing.JComboBox<>();
        atualizaButtom = new javax.swing.JButton();
        voltaBuutom = new javax.swing.JButton();
        editaButtom = new javax.swing.JButton();
        VerMesButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setPreferredSize(new java.awt.Dimension(1366, 790));
        getContentPane().setLayout(null);

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableVendas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 130, 640, 520);

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 220, 80, 40);

        cadastraButtom.setBorder(null);
        cadastraButtom.setBorderPainted(false);
        cadastraButtom.setContentAreaFilled(false);
        cadastraButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastraButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraButtomActionPerformed(evt);
            }
        });
        getContentPane().add(cadastraButtom);
        cadastraButtom.setBounds(170, 350, 410, 80);

        cbMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbMeses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesesActionPerformed(evt);
            }
        });
        getContentPane().add(cbMeses);
        cbMeses.setBounds(180, 220, 330, 30);

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
        atualizaButtom.setBounds(840, 670, 260, 80);

        voltaBuutom.setBorder(null);
        voltaBuutom.setContentAreaFilled(false);
        voltaBuutom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltaBuutom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaBuutomActionPerformed(evt);
            }
        });
        getContentPane().add(voltaBuutom);
        voltaBuutom.setBounds(1110, 30, 170, 80);

        editaButtom.setBorder(null);
        editaButtom.setBorderPainted(false);
        editaButtom.setContentAreaFilled(false);
        editaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(editaButtom);
        editaButtom.setBounds(170, 450, 420, 80);

        VerMesButtom.setBorder(null);
        VerMesButtom.setBorderPainted(false);
        VerMesButtom.setContentAreaFilled(false);
        VerMesButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerMesButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMesButtomActionPerformed(evt);
            }
        });
        getContentPane().add(VerMesButtom);
        VerMesButtom.setBounds(250, 280, 280, 50);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaVendasImagem.png")); // NOI18N
        fundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1380, 776);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltaBuutomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaBuutomActionPerformed
        // declarando tela de inicio
       TelaInicial inicio = new TelaInicial();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_voltaBuutomActionPerformed

    private void atualizaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaButtomActionPerformed
        carregarTabela();
    }//GEN-LAST:event_atualizaButtomActionPerformed

    private void VerMesButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMesButtomActionPerformed
        //apresenta vendas apartir do mes escolido
         try {
        DAO dao = new DAO(); 
        List<Vendas> listaVendasMes = dao.escolheMesVenda(pergunta); // Chamando corretamente com o parâmetro

        DefaultTableModel modelo = new DefaultTableModel(
            new String[]{"ID", "Produto", "Preço", "Cliente", "Data"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };

        for (Vendas venda : listaVendasMes) {
            modelo.addRow(new Object[]{
                venda.getId(),
                venda.getProduto(),
                venda.getPreco(),
                venda.getCliente(),
                venda.getData()
            });
        }


        jTableVendas.setModel(modelo);

        if (listaVendasMes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma venda encontrada para o mês informado.","Erro!",2,error);
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage(),"Erro",2,error);
    }

    }//GEN-LAST:event_VerMesButtomActionPerformed

    private void cbMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesesActionPerformed
      
    }//GEN-LAST:event_cbMesesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // da valor em numeros a mes em Caracteres
        String box = (cbMeses.getSelectedItem().toString());
        if(box.equals("Janeiro")){
            pergunta =1;
        }
        else if(box.equals("Fevereiro")){
            pergunta=2;
        }
        else if(box.equals("Março")){
            pergunta =3;
        }
        else if(box.equals("Abril")){
            pergunta =4;
        }
        else if(box.equals("Maio")){
            pergunta =5;
        }
        else if(box.equals("Junho")){
            pergunta =6;
        }
        else if(box.equals("Julho")){
            pergunta =7;
        }
        else if(box.equals("Agosto")){
            pergunta= 8;
        }
        else if(box.equals("Setembo")){
            pergunta =9;
        }
        else if(box.equals("Outubro")){
            pergunta =10;
        }
        else if(box.equals("Novembro")){
            pergunta =11;
        }
        else if(box.equals("Dezembro")){
            pergunta=12;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastraButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraButtomActionPerformed
        //declara tela de Cadastro
        TelaCadastraVendas cadastra = new TelaCadastraVendas();
        cadastra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastraButtomActionPerformed

    private void editaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaButtomActionPerformed
        // declara tela de editar vendas
        TelaEditaVendas edita = new TelaEditaVendas();
        edita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editaButtomActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerMesButtom;
    private javax.swing.JButton atualizaButtom;
    private javax.swing.JButton cadastraButtom;
    private javax.swing.JComboBox<String> cbMeses;
    private javax.swing.JButton editaButtom;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JButton voltaBuutom;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela() {
        try {
            Vendas vendas = new Vendas();
            DAO dao = new DAO(); 
            List<Vendas> listaVendas = dao.obterVendas(); 
            vendas.setMes(pergunta);
           
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Produto");
            modelo.addColumn("Preco");
            modelo.addColumn("Cliente");
            modelo.addColumn("Data");

            
            for (Vendas venda : listaVendas) {
                modelo.addRow(new Object[]{
                venda.getId(),
                venda.getProduto(),
                venda.getPreco(),
                venda.getCliente(),
                venda.getData()
                
                });
        }
            
            jTableVendas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage(),"Erro",2,error);
        }
    
    }
}

  
