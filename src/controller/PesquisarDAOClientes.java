package controller;

import DAO.DAOCliente;
import model.ModelClientes;
import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PesquisarDAOClientes {
    
    private DAOCliente daoCliente = new DAOCliente();
    
    public ModelClientes Pesquisar(int cod) throws SQLException
    {
     ModelClientes objpes = new ModelClientes();

        Conexao conexao = new Conexao();
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
        "SELECT * FROM clientes where codigo = ?");
        pstmt.setInt(1,cod);

        ResultSet rs = pstmt.executeQuery();
        objpes = null;
        if (rs.next()){
           objpes = new ModelClientes();
          
            objpes.setCodigo(rs.getInt("codigo"));
            objpes.setNome(rs.getString("nome").trim());
            //objpes.setIdade(rs.getInt("idade"));
        
         }
          pstmt.close();
        return objpes;
      
}

/*
    public ArrayList<ModelClientes> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }
*/   
    
    
}
