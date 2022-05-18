package bibliothèque;

/**
 * Cette classe permet de créer un Adhérent à la bibliothèque
 * @author p2103678
 */
public class Adherent {
    public static int nbAdherent = 123456;
    
    private int id;
    private String nom;
    private String prenom;
    private int annee_de_naissance;
    
    public Adherent(int age, String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee_de_naissance = age;
        
        Adherent.nbAdherent++;
        this.id=Adherent.nbAdherent;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeDeNaissance() {
        return annee_de_naissance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeDeNaissance(int anee_de_naissance) {
        this.annee_de_naissance = anee_de_naissance;
    }

    @Override
    public String toString() {
        return "Adherent{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + annee_de_naissance + '}';
    }
    
}
