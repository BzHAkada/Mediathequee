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
public class CVignette {

    protected int id_Vignette;
    protected String nom_Image_Vignette;

    public CVignette(int Id_Vignette, String Nom_Image_Vignette) {
        setId_Vignette(Id_Vignette);
        setNom_Image_Vignette(Nom_Image_Vignette);
    }
    
    public CVignette(int Id_Vignette) {
        setId_Vignette(Id_Vignette);
    }
    
     public CVignette(String Nom_Image_Vignette) {
        setNom_Image_Vignette(Nom_Image_Vignette);
    }

    public int getId_Vignette() {
        return id_Vignette;
    }

    public final void setId_Vignette(int Id_Vignette) {
        this.id_Vignette = Id_Vignette;
    }

    public String getNom_Image_Vignette() {
        return nom_Image_Vignette;
    }

    public final void setNom_Image_Vignette(String Nom_Image_Vignette) {
        this.nom_Image_Vignette = Nom_Image_Vignette;
    }

}
