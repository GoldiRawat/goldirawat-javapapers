import java.sql.*;

public class SelectDemo {
    private final static String URL ="jdbc:mysql://localhost:3306/mydb";
    private final static String User_Name="root";
    private final static String Password="goldi";

    public static void main(String[] args)throws SQLException,ClassNotFoundException {

        // Step 1: Load & Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Create a connection
        Connection con = DriverManager.getConnection(URL, User_Name, Password);
        // Step 3: Create a statement
        Statement statement = con.createStatement();

        // Step 4: Execute a query
        String sqlQuery = "SELECT * FROM student where enrollment_no<120";
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        // Step 5: Process the results
        while (resultSet.next()) {
            // Retrieve data and process
            int column1  = resultSet.getInt("enrollment_no");
            String column2 = resultSet.getString("student_name");
            String column3 = resultSet.getString("phone_no");
            String  column4 = resultSet.getString("course");
            System.out.println("enrollment_no:" + column1 + ", student_name: " + column2+", phone_no: " + column3+", cource: " + column3);
        }

    }
}
