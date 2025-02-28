
package com.mycompany.kabeta.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.kabeta.classes.Estoque;
import java.sql.SQLException;

public class DAO {
///Login
public boolean existeUsu (Usuario usuario) throws Exception{
    String sql = "SELECT * FROM tb_usuarios WHERE nome = ? AND senha= ?";
    try (Connection conn = conexao.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        try (ResultSet rs = ps.executeQuery()){
            return rs.next();
        }
    }
}


public boolean selecionaUsu (Usuario usuario) throws Exception{
    String sql = "SELECT * FROM tb_usuarios WHERE nome = ? ";
    try (Connection conn = conexao.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        try (ResultSet rs = ps.executeQuery()){
            return rs.next();
        }
    }
}

    public boolean addUsu (Usuario usuario) throws Exception{
        String sql = "INSERT INTO tb_usuarios (nome,senha) VALUES (?,?);";
        try (Connection conn = conexao.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected>0;
    
        } catch (SQLException e) {
            throw new Exception("Erro ao adicionar usuario: " + e.getMessage(), e);
        }
        }
        public boolean apagaUsu(Usuario usuario) throws Exception{
        String sql = "delete from tb_usuarios where nome = ?;";
        try(Connection conn = conexao.obterConexao();  
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setString(1,usuario.getNome());
            int apagaAffected = ps.executeUpdate();
            return apagaAffected > 0;
        } catch(SQLException e ){
            throw new Exception ("Erro ao apagar"+ e.getMessage(), e);
            
        }
        
    }
        
    public boolean editaUsuario(Usuario usuario) throws Exception{
        String sql = "update tb_usuarios set nome = ?,senha = ? where nome =?;";
        try(Connection conn = conexao.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){;
                ps.setString(1,usuario.getNome());
                ps.setString(2,usuario.getSenha());
                ps.setString(3,usuario.getNomeVelho());
                int editaAffected = ps.executeUpdate();
                return editaAffected>0;
        }catch(SQLException e){
            throw new Exception("Erro ao editar estoque: "+ e.getMessage(), e);
        }
    }   

///estoque
    
    public List<Estoque> obterEstoque() throws Exception {
    String sql = "SELECT * FROM tb_estoque";
    List<Estoque> listaEstoque = new ArrayList<>(); 

    try (Connection conn = conexao.obterConexao();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Estoque estoque = new Estoque();
            estoque.setId(rs.getInt("id")); 
            estoque.setNome(rs.getString("nome"));
            estoque.setTipo(rs.getString("tipo"));
            estoque.setNumero(rs.getInt("numero"));
            estoque.setQuantidade(rs.getInt("Quantidade"));
            listaEstoque.add(estoque); 
        }
    }

    return listaEstoque; 
}
    public boolean addEstoque (Estoque estoque) throws Exception{
        String sql = "INSERT INTO tb_estoque (nome,tipo,numero,quantidade) VALUES (?,?,?,?);";
        try (Connection conn = conexao.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setString(1, estoque.getNome());
            ps.setString(2, estoque.getTipo());
            ps.setInt(3, estoque.getNumero());
            ps.setInt(4, estoque.getQuantidade());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected>0;
    
        } catch (SQLException e) {
            throw new Exception("Erro ao adicionar estoque: " + e.getMessage(), e);
        }
        }
    public boolean editaEstoque(Estoque estoque) throws Exception{
        String sql = "update tb_estoque set nome = ?, tipo = ?, numero = ?, quantidade = ? where id=?;";
        try(Connection conn = conexao.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){;
                ps.setString(1,estoque.getNome());
                ps.setString(2,estoque.getTipo());
                ps.setInt(3,estoque.getNumero());
                ps.setInt(4,estoque.getQuantidade());
                ps.setInt(5,estoque.getId());
                int editaAffected = ps.executeUpdate();
                return editaAffected>0;
        }catch(SQLException e){
            throw new Exception("Erro ao editar estoque: "+ e.getMessage(), e);
        }
    }
    public boolean apagaEstoque(Estoque estoque) throws Exception{
        String sql = "delete from tb_estoque where id in(?);";
        try(Connection conn = conexao.obterConexao();  
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setInt(1,estoque.getId());
            int apagaAffected = ps.executeUpdate();
            return apagaAffected > 0;
        } catch(SQLException e ){
            throw new Exception ("Erro ao apagar"+ e.getMessage(), e);
            
        }
        
    }
 
///vendas 
    
    public List<Vendas> obterVendas() throws Exception {
    String sql = "SELECT * FROM tb_vendas";
    List<Vendas> listaVendas = new ArrayList<>();

    try (Connection conn = conexao.obterConexao();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Vendas vendas = new Vendas();
            vendas.setId(rs.getInt("id")); 
            vendas.setProduto(rs.getString("produto"));
            vendas.setPreco(rs.getDouble("preco"));
            vendas.setCliente(rs.getString("cliente"));
            vendas.setData(rs.getString("data"));
            listaVendas.add(vendas); 
        }
    }

    return listaVendas; 
}

  public List<Vendas> escolheMesVenda(int mes) throws Exception {
    String sql = "SELECT * FROM tb_vendas WHERE MONTH(data) = ?;";
    List<Vendas> listaVendasMes = new ArrayList<>();

    try (Connection conn = conexao.obterConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, mes);
        
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Vendas venda = new Vendas();
                venda.setId(rs.getInt("id"));
                venda.setProduto(rs.getString("produto"));
                venda.setPreco(rs.getDouble("preco"));
                venda.setCliente(rs.getString("cliente"));
                venda.setData(rs.getString("data"));

                listaVendasMes.add(venda);
            }
        }
    } catch (SQLException e) {
        throw new Exception("Erro ao buscar vendas do mês: " + e.getMessage(), e);
    }

    return listaVendasMes;
}
  public boolean addVendas (Vendas vendas) throws Exception{
        String sql = "INSERT INTO tb_vendas (produto,preco,cliente,data) VALUES (?,?,?,?);";
        try (Connection conn = conexao.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setString(1, vendas.getProduto());
            ps.setDouble(2, vendas.getPreco());
            ps.setString(3, vendas.getCliente());
            ps.setString(4, vendas.getData());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected>0;
    
        } catch (SQLException e) {
            throw new Exception("Erro ao adicionar vendas: " + e.getMessage(), e);
        }
        }
  
      public boolean editaVendas(Vendas vendas) throws Exception{
        String sql = "update tb_vendas set produto = ?, preco = ?, cliente = ?, data = ? where id=?;";
        try(Connection conn = conexao.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){;
                ps.setString(1, vendas.getProduto());
                ps.setDouble(2, vendas.getPreco());
                ps.setString(3, vendas.getCliente());
                ps.setString(4, vendas.getData());
                ps.setInt(5,vendas.getId());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected>0;
        }catch(SQLException e){
            throw new Exception("Erro ao editar estoque: "+ e.getMessage(), e);
        }
    }
       public boolean apagaVendas(Vendas vendas) throws Exception{
        String sql = "delete from tb_vendas where id in(?);";
        try(Connection conn = conexao.obterConexao();  
        PreparedStatement ps = conn.prepareStatement(sql)){;
            ps.setInt(1,vendas.getId());
            int apagaAffected = ps.executeUpdate();
            return apagaAffected > 0;
        } catch(SQLException e ){
            throw new Exception ("Erro ao apagar"+ e.getMessage(), e);
            
        }
        
    }
}
   
 


