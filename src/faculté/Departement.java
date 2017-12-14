package faculté;

import java.util.ArrayList;

public class Departement{
    private String nom;
    private ChefDepartement chefDepartement;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Professeur> professeurs;
    private ArrayList<Section> sections;

    public Departement(String nom, ChefDepartement chefDepartement) {
        this.nom = nom;
        this.chefDepartement = chefDepartement;
        etudiants = new ArrayList<>();
        sections = new ArrayList<>();
        professeurs = new ArrayList<>();
        professeurs.add((Professeur) chefDepartement);
    }

    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        this.professeurs = professeurs;
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

    @Override
    public String toString() {
        return "Departement{" +
                " nom='" + nom + '\'' +
                ", \n"+" Sections : "+
                listSections()+"\n"+
                "Professeurs : "+
                listProfesseurs()+"\n"+
                "Etudiants : "+
                listEtudiants()+
                '}';
    }
    // Ajouter un etudiant
    public void ajoutEtudiant(Etudiant e){
        etudiants.add(e);
    }

    //Supprimer un etudiant

    public void suppEtudiant (int cin)throws NotFoundException{
        boolean deleted = false;
        for(int i=0;i<etudiants.size();i++){
            if(etudiants.get(i).getCIN() == cin){
                deleted = true;
                etudiants.remove(etudiants.get(i));
                break;
            }
        }
        if(deleted == false) throw new NotFoundException();
    }

    // Afficher la liste des etudiants
    public String listEtudiants(){
        String s = "";
        for (int i=0;i<etudiants.size();i++){
            s+= etudiants.get(i).toString()+"\n\t\t\t";
        }
        return s;
    }

    // Ajouter un professeur
    public void ajoutProfesseur(Professeur p){
        professeurs.add(p);
    }
    // Supprimer un professeur
    public void suppProfesseur (int cin)throws NotFoundException{
        boolean deleted = false;
        for(int i=0;i<professeurs.size();i++){
            if(professeurs.get(i).getCIN() == cin){
                deleted = true;
                professeurs.remove(professeurs.get(i));
                break;
            }
        }
        if(deleted == false) throw new NotFoundException();
    }
    // afficher la liste des professeurs
    public String listProfesseurs(){
        String s = "";
        for (int i=0;i<professeurs.size();i++){
            s+= professeurs.get(i).toString()+"\n\t\t\t";
        }
        return s;
    }

    // Ajouter une section
    public void ajoutSection(Section s){
        sections.add(s);
    }

    //Supprimer une section
    public void suppSection (String nom)throws NotFoundException{
        boolean deleted = false;
        for(int i=0;i<sections.size();i++){
            if((sections.get(i).getNom()).equals(nom)){
                deleted = true;
                sections.remove(sections.get(i));
                break;
            }
        }
        if(deleted == false) throw new NotFoundException();
    }

    //Afficher la liste des sections
    public String listSections(){
        String s = "";
        for (int i=0;i<sections.size();i++){
            s+= sections.get(i).getNom()+"\n\t\t\t";
        }
        return s;
    }


}
