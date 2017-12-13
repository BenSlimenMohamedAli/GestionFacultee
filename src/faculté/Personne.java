package faculté;

public class Personne {
    private String nom;
    private String prenom;
    private int CIN;

    public Personne(String nom, String prenom, int CIN) {
        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }
}
