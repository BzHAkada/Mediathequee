package Entities;


public class CAdministrateur {

//attribut CAdmin    
 
protected int id_Admin;
protected String identifiant_Admin;
protected String mdp_Admin;
protected String nom_Admin;
protected String prenom_Admin;


//getter et setter attribut

    public int getId_Admin() {
        return id_Admin;
    }

    public final void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    public String getIdentifiant_Admin() {
        return identifiant_Admin;
    }

    public final void setIdentifiant_Admin(String identifiant_Admin) {
        this.identifiant_Admin = identifiant_Admin;
    }

    public String getMdp_Admin() {
        return mdp_Admin;
    }

    public final void setMdp_Admin(String mdp_Admin) {
        this.mdp_Admin = mdp_Admin;
    }

    public String getNom_Admin() {
        return nom_Admin;
    }

    public final void setNom_Admin(String nom_Admin) {
        this.nom_Admin = nom_Admin;
    }

    public String getPrenom_Admin() {
        return prenom_Admin;
    }

    public final void setPrenom_Admin(String prenom_Admin) {
        this.prenom_Admin = prenom_Admin;
    }

    
    //constructeur
    
    public CAdministrateur(int id_Admin, String identifiant_Admin, String mdp_Admin, String nom_Admin, String prenom_Admin){
       setId_Admin(id_Admin); 
       setIdentifiant_Admin(identifiant_Admin);
       setMdp_Admin(mdp_Admin);
       setNom_Admin(nom_Admin);
       setPrenom_Admin(prenom_Admin);
    }
    
    public CAdministrateur(String identifiant_Admin){
       setIdentifiant_Admin(identifiant_Admin);
    }
}
