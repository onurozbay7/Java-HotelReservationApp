
package projeobj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ONUR
 */
public class Veritabani { // VERİTABANI BAĞLANTISI SAĞLANDI.
    
    public static final String kullanici_adi = "root";
    public static final String parola = "";
    
    public static final String db = "musteri";
    public static final String host = "localhost";
    public static final int port = 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
}
