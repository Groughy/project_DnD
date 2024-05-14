package database;

import java.sql.*;

public class DataBase {
    static final String DB_URL = "jdbc:mariadb://localhost/Project_DnD";
    static final String USER = "SébastienJ";
    static final String PASS = "M@gnimar2020";
    static final String QUERY = "SELECT * FROM Hero";
    public static void main (String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY)){
            while(rs.next()){
                System.out.print("ID: "+ rs.getInt("id"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.print(", Job: " + rs.getString("job"));
                System.out.print(", Life Points: " + rs.getInt("lifePoints"));
                System.out.print(", Attack Points: " + rs.getInt("attackPoints"));
                System.out.print(", Weapon; " + rs.getString("weapon"));
                System.out.println(", Shield: " + rs.getString("shield"));
            }
        }
    }
}
