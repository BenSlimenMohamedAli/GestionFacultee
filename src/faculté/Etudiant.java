package faculté;

public class Etudiant extends Personne{
    public Etudiant(String nom, String prenom, int CIN) {
        super(nom, prenom, CIN);
    }

    @Override
    public String toString() {
        return "Etudiant{ "+
                getNom()+
                " "+getPrenom()+
                " CIN : "+getCIN()+
                " }";
    }
}
