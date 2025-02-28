
package com.mycompany.kabeta;

import com.mycompany.kabeta.classes.Estoque;
import com.mycompany.kabeta.classes.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class TelaEstoque extends javax.swing.JFrame {

    public TelaEstoque() {
        initComponents();
        carregarTabela();
       

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltaButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        atualizar = new javax.swing.JToggleButton();
        editarButtom = new javax.swing.JButton();
        cadastroButtom = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KricaBeta");
        setIconImage(new ImageIcon("C:/Users/Léo/Desktop/KABeta/Imagens/logoKA.png").getImage());
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        VoltaButtom.setBorder(null);
        VoltaButtom.setContentAreaFilled(false);
        VoltaButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaButtomActionPerformed(evt);
            }
        });
        getContentPane().add(VoltaButtom);
        VoltaButtom.setBounds(1105, 33, 170, 70);

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEstoque);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(650, 130, 630, 510);

        atualizar.setBorder(null);
        atualizar.setBorderPainted(false);
        atualizar.setContentAreaFilled(false);
        atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(840, 670, 250, 70);

        editarButtom.setContentAreaFilled(false);
        editarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtomActionPerformed(evt);
            }
        });
        getContentPane().add(editarButtom);
        editarButtom.setBounds(180, 270, 420, 80);

        cadastroButtom.setContentAreaFilled(false);
        cadastroButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtomActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroButtom);
        cadastroButtom.setBounds(180, 420, 420, 80);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Léo\\Desktop\\KABeta\\Imagens\\TelaEstoqueImagem.png")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1340, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaButtomActionPerformed
        // declarando telaAnterior
        TelaInicial inicio = new TelaInicial();
        inicio.setVisible(true);
        this.dispose();                
                      
    }//GEN-LAST:event_VoltaButtomActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        carregarTabela(); 
    }//GEN-LAST:event_atualizarActionPerformed

    private void editarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtomActionPerformed
       //tela de editar estoque
        TelaEditarCadastro edita = new TelaEditarCadastro();
       edita.setVisible(true);
        
    }//GEN-LAST:event_editarButtomActionPerformed

    private void cadastroButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtomActionPerformed
        // tela de adicionar ao estoque
         TelaAddEstoque add = new TelaAddEstoque();
        add.setVisible(true);
    }//GEN-LAST:event_cadastroButtomActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltaButtom;
    private javax.swing.JToggleButton atualizar;
    private javax.swing.JButton cadastroButtom;
    private javax.swing.JButton editarButtom;
    private javax.swing.JLabel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoque;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela() {
           try {
            DAO dao = new DAO(); // Cria uma instância do DAO
            List<Estoque> listaEstoque = dao.obterEstoque(); // Obtém os dados do estoque

            // Configurar o modelo da tabela
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nome");
            modelo.addColumn("Tipo");
            modelo.addColumn("Número");
            modelo.addColumn("Quantidade");

            // Adicionar os dados ao modelo
            for (Estoque estoque : listaEstoque) {
                modelo.addRow(new Object[]{
                    estoque.getId(),
                    estoque.getNome(),
                    estoque.getTipo(),
                    estoque.getNumero(),
                    estoque.getQuantidade()
                });
            }

            // Associar o modelo ao JTable
            jTableEstoque.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    
    }

}

