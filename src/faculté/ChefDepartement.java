package faculté;

public class ChefDepartement extends Professeur{
    public ChefDepartement(String nom, String prenom, int CIN, String profession) {
        super(nom, prenom, CIN, profession);
    }

    @Override
    public String toString() {
        return "Chef Departement{" +
                "Profession='" + getProfession() + '\'' +
                " nom : '"+getNom()+
                "' prenom : '"+getPrenom()+
                "' CIN : "+getCIN()+
                "}";
    }
}
