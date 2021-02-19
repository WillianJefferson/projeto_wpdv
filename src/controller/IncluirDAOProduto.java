package controller;

import model.ModelProdutos;
import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirDAOProduto {
    
    public boolean Incluir(ModelProdutos objpes) throws SQLException
    {
        Conexao conexao = new Conexao();

        PreparedStatement pstmt =
        conexao.getConexao().prepareStatement
        ("INSERT INTO produtos (produto, preco, descricao)" +
                " VALUES (?,?,?)");
//       pstmt.setInt(1, objusuario.getCodigo());
       pstmt.setString(1,objpes.getProduto());
       pstmt.setInt(2,objpes.getPreco());
       pstmt.setString(3,objpes.getDescricao());
      
        int registros = pstmt.executeUpdate();
        pstmt.close();// fecha a conexao
        if (registros == 1){
            return true; }
        else {
            return false; }

}
    
}
