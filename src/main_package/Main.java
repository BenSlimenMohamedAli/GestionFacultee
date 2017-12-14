package main_package;

import faculté.*;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("*** Systéme de gestion de Faculté ***\nDonner le nom de votre faculté : ");
        String nomFaculté = in.nextLine();
        Faculté f = new Faculté(nomFaculté);

        int choix =1;
        do{
            //Les choix
            System.out.println("1) Ajouter un departement\n" +
                    "2) Supprimer un departement\n" +
                    "3) afficher la liste des departements \n" +
                    "4) Manipuler un département\n");
            int rep1 = in.nextInt();
            // Les choix
            switch(rep1){
                case 1 :
                    System.out.println("Donner le nom du département : ");
                    in.nextLine();String nomDep = in.nextLine();
                    System.out.println("Donner le nom du chef de département : ");
                    String nomChef = in.nextLine();
                    System.out.println("Donner le prenom du chef de departement :");
                    String prenomChef = in.nextLine();
                    System.out.println("Donner le CIN du chef de departement : ");
                    int cin = in.nextInt();
                    in.nextLine();System.out.println("Donner la profession du chef de département");
                    String profChef = in.nextLine();
                    f.ajoutDepartement(new Departement(nomDep,new ChefDepartement(nomChef,prenomChef,cin,profChef)));
                    break;
                case 2:
                    in.nextLine();System.out.println("Donner le nom du département à supprimer : ");
                    nomDep = in.nextLine();
                    try {
                        f.suppDepartement(nomDep);
                        System.out.println("Le département est supprimé");
                    } catch (NotFoundException e) {
                        System.out.println("Le département n'existe pas");
                    }
                    break;
                case 3:
                    System.out.println(f.toString());
                        break;
                case 4 :
                    try{
                        Departement dep = null;
                        in.nextLine();System.out.println("Donner le nom du département : ");
                        nomDep = in.nextLine();
                        for(int i = 0;i<f.getDepartements().size();i++){
                            if((f.getDepartements().get(i).getNom()).equals(nomDep)){
                                dep = f.getDepartements().get(i);
                            }
                        }
                        if(dep == null) throw new NotFoundException();

                        // La manipulation du département
                        int rep2 = 1;
                        do{
                            System.out.println("1) Ajouter une section\n" +
                                    "2) Supprimer une section\n" +
                                    "3) Ajouter un professeur \n" +
                                    "4) Supprimer un professeur\n" +
                                    "5) Manipuler une section\n");
                            // TODO

                            do {
                                System.out.println("Voulez vous continuez a manipuler se département :\n1) Si oui \n2) Si non");
                                rep2 = in.nextInt();
                            }while(rep2 != 1 && rep2 != 2);

                        }while(rep2 == 1);

                    }catch(NotFoundException e){
                        System.out.println("Le département n'existe pas");
                    }

                    break;
                default:
                    System.out.println("Choix invalid !!! ");
                    break;
            }
            do{
                System.out.println("Voulez vous continuez\n1) Si oui\n2) Si non");
                choix = in.nextInt();
            }while(choix != 1 && choix != 2);

        }while(choix == 1);



    }
}
