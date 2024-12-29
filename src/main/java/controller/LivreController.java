package controller;

import dao.GenericDao;
import java.util.List;
import modele.Livre;

public class LivreController {
    private final GenericDao<Livre> livreDAO;

    public LivreController(GenericDao<Livre> livreDAO) {
        this.livreDAO = livreDAO;
    }

    public void ajouterLivre(Livre livre) {
        livreDAO.inserer(livre);
    }
    
    public void modifierLivre(Livre livre){
        livreDAO.modifier(livre);
    }
    
    public void supprimerLivre(int id){
        livreDAO.supprimer(id);
    }
    
    public List<Livre> afficherLivre(){
        return livreDAO.afficher();
    }
}
