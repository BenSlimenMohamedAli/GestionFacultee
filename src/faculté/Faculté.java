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

    public void suppDepartement(Departement d){
        departements.remove(d);
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
