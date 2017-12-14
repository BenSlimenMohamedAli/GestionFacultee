package faculté;

import java.util.ArrayList;

public class Section {
    private String nom;
    private ArrayList<Etudiant> etudiants;

    public Section(String nom) {
        this.nom = nom;
        etudiants = new ArrayList<>();
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

    // Ajouter un etudiant
    public void ajoutEtudiant(Etudiant e){
        etudiants.add(e);
    }

    //Supprimer un etudiant

    public void suppEtudiant(Etudiant e){
        etudiants.remove(e);
    }

    // afficher la liste des etudiants
    public String listEtudiants(){
        String s = "";
        for (int i=0;i<etudiants.size();i++){
            s+= "\n\t\t"+etudiants.get(i).toString();
        }
        return s;
    }

    // La méthode tostring


    @Override
    public String toString() {
        return "Section{" +
                " nom='" + nom + '\'' +
                ", etudiants= " + listEtudiants() +"\n"+
                '}';
    }
}
