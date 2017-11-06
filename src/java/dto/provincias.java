/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Bladi
 */
public class provincias {
    
    private int provincia_id;
    private String provincia_nombre;
    private regiones region_idfk;

    public int getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(int provincia_id) {
        this.provincia_id = provincia_id;
    }

    public String getProvincia_nombre() {
        return provincia_nombre;
    }

    public void setProvincia_nombre(String provincia_nombre) {
        this.provincia_nombre = provincia_nombre;
    }

    public regiones getRegion_idfk() {
        return region_idfk;
    }

    public void setRegion_idfk(regiones region_idfk) {
        this.region_idfk = region_idfk;
    }
    
    
    
}
