package controller;

import model.ModelClientes;
import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class PesquisarDAO {
    public ModelClientes Pesquisar(int id) throws SQLException
    {
     ModelClientes objpes=new ModelClientes();

        //Conexao conexao = new ControllerBanco().get();
     
        Conexao conexao = new Conexao();
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
        "SELECT * FROM clientes where id = ?");
        pstmt.setInt(1,id);

        ResultSet rs = pstmt.executeQuery();
        objpes = null;
        if (rs.next()){
           objpes = new ModelClientes();
          
            objpes.setId(rs.getInt("id"));
            objpes.setNome(rs.getString("nome").trim());
            objpes.setEndereco(rs.getString("endereco"));
            objpes.setEmail(rs.getString("email"));
            objpes.setCidade(rs.getString("cidade"));
            objpes.setUf(rs.getString("uf"));
            objpes.setCep(rs.getString("cep"));
            objpes.setTelefone(rs.getString("telefone"));
            //objpes.setIdade(rs.getInt("idade"));
        
         }
          pstmt.close();
        return objpes;
    }

     /**
    * recupera uma lista de Cliente
        * return ArrayList
     * @return 
    */
    public ArrayList<ModelClientes> getListaClienteDAO(){
        ArrayList<ModelClientes> listamodelCliente = new ArrayList();
 
        try {
            Conexao conexao = new Conexao();
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
        "SELECT * from clientes;");
        //pstmt.setInt(1,id);

        ResultSet rs = pstmt.executeQuery();
           
           while(rs.next()){
               
                ModelClientes modelCliente = new ModelClientes();
                
                modelCliente.setId(rs.getInt(1));
                modelCliente.setNome(rs.getString(2));
                modelCliente.setCidade(rs.getString(3));
                modelCliente.setUf(rs.getString(4));
         
                listamodelCliente.add(modelCliente);
               
            }
            }catch(Exception e){
                e.printStackTrace();
            }
      
        return listamodelCliente;
    }
    
 
public boolean atualizarClienteDAO(ModelClientes pModelCliente) throws SQLException
    {

        //Conexao conexao = new ControllerBanco().get();
     try {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
        "UPDATE clientes SET "
                    + "id = '" + pModelCliente.getId() + "',"
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "email = '" + pModelCliente.getEmail() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "uf = '" + pModelCliente.getUf() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "'"
                + " WHERE "
                    + "id = '" + pModelCliente.getId() + "'"
                + ";"
            );
            //objpes.setIdade(rs.getInt("idade"));
        
        //ResultSet rs = pstmt.executeQuery();
        return true;
        
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }    
    
    
    
}
