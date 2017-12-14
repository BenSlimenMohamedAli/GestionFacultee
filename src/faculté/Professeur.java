package faculté;

public class Professeur extends Personne{
    private String Profession;

    public Professeur(String nom, String prenom, int CIN, String profession) {
        super(nom, prenom, CIN);
        Profession = profession;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                " Profession :'" + Profession + '\'' +
                " nom : '"+getNom()+
                "' prenom : '"+getPrenom()+
                "' CIN : "+getCIN()+
                "}";
    }
}
