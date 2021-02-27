package conexoes;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
public class Conexao {
  


    private static Connection conexao;
    public Conexao()
    { try
        {

          
Class.forName("org.sqlite.JDBC");
String url = "jdbc:sqlite:C://projeto/wpdv/projeto_wpdv/db/sqlitejava.db";  
            
          conexao = DriverManager.getConnection(url);
          System.out.println("conexao ok");
          //JOptionPane.showMessageDialog(null,"conexao ok");
         
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    

    
    }
    // Metodos publicos:
    public Connection getConexao()
    {
        return conexao;
       
    }



}
