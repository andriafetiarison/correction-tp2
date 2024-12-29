package modele;

public class Utilisateur {
    private int id;
    private String nom;
    private String mail;
    private int telephone;
    
    public Utilisateur() {
        super();
    }
    
    public Utilisateur(int id, String nom, String mail, int telephone){
        this.id = id;
        this.nom = nom;
        this.mail= mail;
        this.telephone = telephone;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public int getTelephone(){
        return this.telephone;
    }
    
    public void setTelephone(int telephone){
        this.telephone = telephone;
    }
}
