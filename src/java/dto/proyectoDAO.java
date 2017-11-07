/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author blood
 */
public interface proyectoDAO {
    public boolean crearProyecto(proyecto nvoProyecto);
    public proyecto read(int id);
    public boolean update(proyecto proyecto);
}
