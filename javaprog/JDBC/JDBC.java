package javaprog.JDBC;
import java.io.InputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void solve() {
        try (InputStream input = JDBC.class.getClassLoader().getResourceAsStream("JDBC.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find JDBC.properties");
                return;
            }

            // Load a properties file from class path
            prop.load(input);

            // Get database connection properties
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            try (Connection connection = DriverManager.getConnection(url, user, password)) {

                // Display success message
                System.out.println("Connected to the database!");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
