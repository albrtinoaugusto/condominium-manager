package Applicaton;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Albertino Augusto */

public class DBClass 
{
    
    ResultSet rs;
    Connection conn; 
    public static int countWrite = 1;
    public static int countUpdate = 1;
    
    // Método responsavel por conectar o GC a Base de Dados //
    public void connectDB() 
    {
        try
        {            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gc_database", "root","root");                     
        }       
        catch(ClassNotFoundException | SQLException e)
        {
            MainGUI.warning.setText("Informação:");
            MainGUI.information.setText("Erro de Base de Dados, reveja a função responsável por fazer a conexão");    
        }
    }
    
    
    //  //
    public void writeData(String code, int number, String name, String sex, String status, int members, int cars, String houseType, int roms)
    {
        String sql = "INSERT INTO Houses VALUES('"+code+"', '"+number+"', '"+name+"', '"+sex+"', '"+status+"', '"+members+"', '"+cars+"', '"+houseType+"', '"+roms+"')";
        try
        {
            connectDB();
            Statement sta = conn.createStatement();
            sta.executeUpdate("START TRANSACTION");
            sta.executeUpdate(sql);
            MainGUI.information.setText("Dados gravados com sucesso! ");
            
            countWrite = 0;
            sta.executeUpdate("COMMIT");
        }
        catch(SQLException e)
        {
            try 
            {
                connectDB();
                Statement sta = conn.createStatement();
                sta.executeUpdate("ROLLBACK");
            } 
            catch (SQLException ex)
            {
                MainGUI.warning.setText("Informação:");
                MainGUI.information.setText("Erro ao Gravar os dados na base de dados");  
            }
            System.out.println(""+ e);
        }
    }
    
    
    //  //
    public void updaTeData(String code, int number, String name, String sex, String status, int members, int cars, String houseType, int roms)
    {
        String sql = "UPDATE Houses SET numCasa ='"+number+"', nomeDono='"+name+"', sexo='"+sex+"', estadoCivil='"+status+"', totalMembros='"+members+"', totalCars='"+cars+"', tipoResidencia='"+houseType+"', numQuartos='"+roms+"' WHERE codeCasa = '"+code+"'";
        try
        {
            connectDB();
            Statement sta = conn.createStatement();
            sta.executeUpdate("START TRANSACTION");
            sta.executeUpdate(sql);
            MainGUI.information.setText("Dados actualizados com sucesso! ");
            
            countUpdate = 0;
            sta.executeUpdate("COMMIT");
        }
        catch(SQLException e)
        {
            try 
            {
                connectDB();
                Statement sta = conn.createStatement();
                sta.executeUpdate("ROLLBACK");
            } 
            catch (SQLException ex)
            {
                MainGUI.warning.setText("Informação:");
                MainGUI.information.setText("Erro ao actualizar os dados na base de dados");  
            }
            System.out.println(""+ e);
        }
    }

    
}
