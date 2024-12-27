package modele;

public class Utilisateur {
    private int id;
    private String nom;
    private String mail;
    private int telephone;
    
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
