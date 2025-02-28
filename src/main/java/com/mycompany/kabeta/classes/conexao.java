
package com.mycompany.kabeta.classes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kricabeta","root","anima123");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro!");
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu erro na hr de entrar: "+ ex.getMessage());
        }
        finally{
            if(conexao != null){
                conexao.close();
            }
        }
    }

    static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kricabeta", "root", "anima123");
    }
}
