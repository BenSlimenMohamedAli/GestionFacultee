package faculté;

import java.util.ArrayList;

public class Departement {
    private String nom;
    private ChefDepartement chefDepartement;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Section> sections;

    public Departement(String nom, ChefDepartement chefDepartement) {
        this.nom = nom;
        this.chefDepartement = chefDepartement;
        etudiants = new ArrayList<>();
        sections = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ChefDepartement getChefDepartement() {
        return chefDepartement;
    }

    public void setChefDepartement(ChefDepartement chefDepartement) {
        this.chefDepartement = chefDepartement;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
}
