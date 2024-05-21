package BBDD;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conexion {
    static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String dbName = "refugioanimal";
    static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
    static String user = "root";
    static String pass = "";
    static String driver = "com.mysql.cj.jdbc.Driver";

    static Connection conexion;
    static Statement consulta;
    static ResultSet resultado;

    public static void Conectar(){
        try {
           Class.forName(driver) ;
           conexion = DriverManager.getConnection(url, user , pass);
           System.out.println("Base de datos KIBA situada en :\n "+url);
           consulta = conexion.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    public static ResultSet EjecutarSentencia(String Sentencia){
        try {
            Conexion.Conectar();
            resultado = consulta.executeQuery(Sentencia);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    public static void EjecutarUpdate(String Sentencia) throws SQLException{
        try{
            Conexion.Conectar();
            consulta.executeUpdate(Sentencia);
            System.out.println("Done.");
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
            throw new SQLException("");
        } 
    }
 
    
    
    public static void CerrarConexion(){
        try{
            consulta.close();
            System.out.println("Base de datos desconectada.");
        }catch(Exception e){}
    }
}
