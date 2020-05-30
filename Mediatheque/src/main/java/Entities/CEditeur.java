/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author BTS sio
 */
public class CEditeur {

    protected int idEditeur;
    protected String Nom_Editeur;

    public CEditeur(int Id_Editeur, String Nom_Editeur) {
        setId_Editeur(Id_Editeur);
        setNom_Editeur(Nom_Editeur);
    }
    
    public CEditeur(int id_Editeur) {
        setId_Editeur(id_Editeur);
    }
    

    public CEditeur(String Nom_Editeur) {
        setNom_Editeur(Nom_Editeur);
    }

    public int getId_Editeur() {
        return idEditeur;
    }

    public final void setId_Editeur(int Id_Editeur) {
        this.idEditeur = Id_Editeur;
    }

    public String getNom_Editeur() {
        return Nom_Editeur;
    }

    public final void setNom_Editeur(String Nom_Editeur) {
        this.Nom_Editeur = Nom_Editeur;
    }

}
