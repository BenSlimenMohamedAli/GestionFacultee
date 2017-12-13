package faculté;

import java.util.ArrayList;

public class Section {
    private String nom;
    private ArrayList<Etudiant> etudiants;

    public Section(String nom, ArrayList<Etudiant> etudiants) {
        this.nom = nom;
        this.etudiants = etudiants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }


}
