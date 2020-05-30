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
public class CLangue {

    protected int id_Langue;
    protected String nom_Langue;

    public CLangue(int Id_Langue, String Nom_Langue) {
        setId_Langue(Id_Langue);
        setNom_Langue(Nom_Langue);
    }
    
    public CLangue(int Id_Langue) {
        setId_Langue(Id_Langue);
    }
    
    public CLangue(String Nom_Langue) {
        setNom_Langue(Nom_Langue);
    }

    public int getId_Langue() {
        return id_Langue;
    }

    public final void setId_Langue(int Id_Langue) {
        this.id_Langue = Id_Langue;
    }

    public String getNom_Langue() {
        return nom_Langue;
    }

    public final void setNom_Langue(String Nom_Langue) {
        this.nom_Langue = Nom_Langue;
    }

}
