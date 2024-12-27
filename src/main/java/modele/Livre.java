package modele;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private int annee;
    private String genre;
    
    Livre(String titre, String auteur, int annee, String genre){
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.genre = genre;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public void setTitre(String titre){
        this.titre = titre;
    }
    
    public String getAuteur(){
        return this.auteur;
    }
    
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    
    public int getAnnee(){
        return this.annee;
    }
    
    public void setAnnee(int annee){
        this.annee = annee;
    }
    
    public String getGenre(){
        return this.genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
}
