package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modele.Livre;


public class LivreDaoImpl implements GenericDao<Livre> {
    
    @Override
    public void inserer(Livre livre){
        String sql = "INSERT INTO livre (titre, auteur, annee, genre) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livre.getTitre());
            stmt.setString(2, livre.getAuteur());
            stmt.setInt(3, livre.getAnnee());
            stmt.setString(4, livre.getGenre());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void modifier(Livre livre){
        String sql = "UPDATE livre SET titre = ?, auteur = ?, annee = ?, genre = ? WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livre.getTitre());
            stmt.setString(2, livre.getAuteur());
            stmt.setInt(3, livre.getAnnee());
            stmt.setString(4, livre.getGenre());
            stmt.setInt(5, livre.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void supprimer(int id){
        String sql = "DELETE FROM livre WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
}
