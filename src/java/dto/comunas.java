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
public class comunas {
    
    private int comuna_id;
    private String comuna_nombre;
    private provincias provincia_idfk;

    public int getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(int comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public provincias getProvincia_idfk() {
        return provincia_idfk;
    }

    public void setProvincia_idfk(provincias provincia_idfk) {
        this.provincia_idfk = provincia_idfk;
    }
    
    
}
