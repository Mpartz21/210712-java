import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Step 1: load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        // Step 2: Create connection Object
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "password");

        // Step 3: Create Statement Object
        Statement statement = conn.createStatement();

        // Step 4: Execute Query
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while (resultSet.next()) {
            System.out.println("Id: " + resultSet.getInt(1) + ", Name: "
                    + resultSet.getString(2) + ", Email: " + resultSet.getString(3));
        }

        // Step 5: Close the connection
        conn.close();
    }
}
