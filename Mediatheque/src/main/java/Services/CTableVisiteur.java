/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BDD.CBDD;
import BDD.CParametresStockageBDD;
import Entities.CVisiteur;
import java.time.LocalDate;



/**
 *
 * 
 * @author BtsSio9
 */
public class CTableVisiteur {
    
    //Ajout des objets
    protected CBDD bdd;
    

    //Getter et Setter CTableVisiteur
    
    public CBDD getBdd() {
        return bdd;
    }

    public final void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

    public CTableVisiteur (CBDD bdd) {
        this.setBdd(bdd);
    }
    
    
    /**
     * méthode permettant l'insertion d'une nouvelle authentification dans la
     * table en prenant pour parametre un objet
     *
     * 
     * @param nouveauVisiteur
     * @return retourne un int, '-1' si il y a une erreur
     */
    public int insererVisiteur(CVisiteur nouveauVisiteur) {
        //Requête "Insérer un Visiteur" à exécuter 
        String req = "INSERT INTO `visiteur`(`Nom_Visiteur`, `Prenom_Visiteur`, `Date_Naissance`, `Adresse_Mail_Visiteur`, `Mot_De_Passe_Visiteur`, `Adresse`, `Code_Postal`, `Ville`) " 
            + "VALUES ('"
            + nouveauVisiteur.getNomVisiteur() + "','"
            + nouveauVisiteur.getPrenomVisiteur() + "','"
            + nouveauVisiteur.getDateNaissanceVisiteur() + "','"
            + nouveauVisiteur.getEmailVisiteur() + "','"
            + nouveauVisiteur.getMdpVisiteur() + "','"
            + nouveauVisiteur.getAdresseVisiteur() + "','"
            + nouveauVisiteur.getCodePostalVisiteur() + "','"
            + nouveauVisiteur.getVilleVisiteur () + "');";
        System.out.println(req);                   //Affichage dans la console de la requête
        int res = -1;
        if (bdd.connecter() == true) {             //Exécution de la requête d'insertion
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Res = " + res);
            bdd.deconnecter();
        } else {                                   // Message d'erreur si impossibilité d'accès à la BDD
             System.out.println("Connexion KO - Impossible d'accèder à la BDD");
        }
        return res;
    }
        
    
    public int supprimerVisiteur(int id){
    //Requête "Supprimer un Visiteur" à exécuter
    String req = "DELETE FROM `visiteur` WHERE `Id_Visiteur` = '"+id+"';";
    System.out.println(req);                 //Affichage dans la console de la requête
    int res= -1;
    if (bdd.connecter() == true) {          //Exécution de la requête d'insertion
        res = bdd.executerRequeteUpdate (req);
        System.out.println("Supprimer Visiteur = " + res);
        bdd.deconnecter();        
    }else {                                 // Message d'erreur si impossibilité d'accès
        System.out.println("Connexion KO - Impossible d'accèder à la BDD");
    }
    return res;
    }
    
    
    public int modifierVisiteur(int id){
        //Requête "Modifier un Visiteur" à exécuter
        String req = "UPDATE FROM `visiteur` WHERE `Id_Visiteur` = '"+id+"';";
        System.out.println(req);              //Affichage dans la console de la requête
        int res= -1;
        if (bdd.connecter() == true){         //Exécution de la requête d'insertion
            res = bdd.executerRequeteUpdate (req);
            System.out.println("Modifier Visiteur = " + res);
            bdd.deconnecter();
        }else {
            System.out.println("Connexion KO - Impossible d'accèder à la BDD");
        }
        return res;
    }
    
    
    //Test de l'insertion et de la suppression de données dans la BDD Médiatheque
    public static void main(String[] args) {
        CTableVisiteur table = new CTableVisiteur(new CBDD (new CParametresStockageBDD("parametresBdd.properties")));
        CVisiteur test = new CVisiteur(1, "Ana", "Piedrahita",LocalDate.parse("1981-09-23"), "ahhhh@gmail.fr", 
        "viveLesChats.01", "3 rue mainville", 35900, "Meuric");
        
        //table.insererVisiteur(test);
        //table.supprimerVisiteur(1);
        table.modifierVisiteur(2);
        
        
    }
    
}