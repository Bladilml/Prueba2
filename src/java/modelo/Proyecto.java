/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author blood
 */
public class Proyecto {
    private String nombre, descripcion, estado;
    private int presupuestoInicial, presupuestoGastado;
    private Date fechaInicio;
    private Comuna comuna;

    public Proyecto(String nombre, String descripcion, String estado, int presupuestoInicial, int presupuestoGastado, Date fechaInicio, Comuna comuna) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.presupuestoInicial = presupuestoInicial;
        this.presupuestoGastado = presupuestoGastado;
        this.fechaInicio = fechaInicio;
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPresupuestoInicial() {
        return presupuestoInicial;
    }

    public void setPresupuestoInicial(int presupuestoInicial) {
        this.presupuestoInicial = presupuestoInicial;
    }

    public int getPresupuestoGastado() {
        return presupuestoGastado;
    }

    public void setPresupuestoGastado(int presupuestoGastado) {
        this.presupuestoGastado = presupuestoGastado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
    
    
}
