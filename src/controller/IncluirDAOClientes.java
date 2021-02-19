package controller;

import model.ModelClientes;
import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirDAOClientes {
    
    public boolean Incluir(ModelClientes objpes) throws SQLException
    {
        Conexao conexao = new Conexao();

        PreparedStatement pstmt =
        conexao.getConexao().prepareStatement
        ("INSERT INTO clientes (nome, endereco, email, cidade, uf, cep, telefone)" +
                " VALUES (?,?,?,?,?,?,?)");
//       pstmt.setInt(1, objusuario.getCodigo());
       pstmt.setString(1,objpes.getNome());
       pstmt.setString(2,objpes.getEndereco());
       pstmt.setString(3,objpes.getEmail());
       pstmt.setString(4,objpes.getCidade());
       pstmt.setString(5,objpes.getUf());
       pstmt.setString(6,objpes.getCep());
       pstmt.setString(7,objpes.getTelefone());
      
        int registros = pstmt.executeUpdate();
        pstmt.close();// fecha a conexao
        if (registros == 1){
            return true; }
        else {
            return false; }

}
    
}
