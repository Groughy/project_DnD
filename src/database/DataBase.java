package database;

import characters.Job;

import java.sql.*;

public class DataBase {
    static final String DB_URL = "jdbc:mariadb://localhost/Project_DnD";
    static final String USER = "SébastienJ";
    static final String PASS = "M@gnimar2020";
    static final String QUERY = "SELECT * FROM Hero";

    public DataBase() throws SQLException {
        DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public void getHero() throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.print(", Job: " + rs.getString("job"));
                System.out.print(", Life Points: " + rs.getInt("lifePoints"));
                System.out.print(", Attack Points: " + rs.getInt("attackPoints"));
                System.out.print(", Weapon; " + rs.getString("weapon"));
                System.out.println(", Shield: " + rs.getString("shield"));
            }
        }
    }

    public void createNewHero(Job character, String name) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "INSERT INTO Hero (name, job, lifePoints, attackPoints, defensePoints, weapon, shield) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, character.getNameCharacter());
            pstmt.setInt(3, character.getLifePoints());
            pstmt.setInt(4, character.getAttackPoints());
            pstmt.setInt(5, character.getDefensePoints());
            pstmt.setString(6, character.getWeapon().getName());
            pstmt.setString(7, character.getShield().getName());
            pstmt.executeUpdate();
        }
    }

    public void updateLifePoints(Job character) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "UPDATE Hero SET lifePoints = ? WHERE id = (SELECT MAX(id) FROM Hero)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, character.getLifePoints());
            pstmt.executeUpdate();
        }
    }

    public void updateAttackPoints(Job character) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "UPDATE Hero SET attackPoints = ?, weapon = ? WHERE id = (SELECT MAX(id) FROM Hero)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, character.getAttackPoints());
            pstmt.setString(2, character.getWeapon().getName());
            pstmt.executeUpdate();
        }
    }

    public void updateDefensePoints(Job character) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "UPDATE Hero SET defensePoints = ?, shield = ? WHERE id = (SELECT MAX(id) FROM Hero)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, character.getDefensePoints());
            pstmt.setString(2, character.getShield().getName());
            pstmt.executeUpdate();
        }
    }
}
