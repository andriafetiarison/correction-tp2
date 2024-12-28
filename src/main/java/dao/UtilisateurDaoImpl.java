package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modele.Utilisateur;

public class UtilisateurDaoImpl implements GenericDao<Utilisateur> {
    @Override
    public void inserer(Utilisateur utilisateur){
        String sql = "INSERT INTO utilisateur (nom, mail, telephone) VALUES (?, ?, ?)";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2, utilisateur.getMail());
            stmt.setInt(3, utilisateur.getTelephone());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void modifier(Utilisateur utilisateur){
        String sql = "UPDATE utilisateur SET nom = ?, mail = ?, telephone = ? WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2, utilisateur.getMail());
            stmt.setInt(3, utilisateur.getTelephone());
            stmt.setInt(5, utilisateur.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void supprimer(int id){
        String sql = "DELETE FROM utilisateur WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
}
