package faculté;

import java.util.ArrayList;

public class Faculté {
    private String nom;
    private ArrayList<Departement> departements;

    public Faculté(String nom) {
        this.nom = nom;
        departements = new ArrayList<>();
    }

    public void ajoutDepartement(Departement d){
        departements.add(d);
    }

    public void suppDepartement (String nom)throws NotFoundException{
        boolean deleted = false;
        for(int i=0;i<departements.size();i++){
            if((departements.get(i).getNom()).equals(nom)){
                deleted = true;
                departements.remove(departements.get(i));
                break;
            }
        }
        if(deleted == false) throw new NotFoundException();
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    private String nomsDEps(){
        String s = "";
        for (int i=0;i<departements.size();i++){
            s += "\n\t\t\t"+departements.get(i).getNom();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Faculté{" +
                "nom :"+nom+
                ", departements : " + nomsDEps() +"\n"+
                '}';
    }
}
