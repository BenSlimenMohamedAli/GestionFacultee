package faculté;

public class Matiére {
    private String nom;
    private float coef;

    public Matiére(String nom, float coef) {
        this.nom = nom;
        this.coef = coef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }
}
