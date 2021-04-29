package edu.upc.eetac.dsa.models;

import java.util.*;

public class Usuario {

    String idUsuario;
    String vacuna;
    Integer ordenFecha = 0;
    List<Seguimiento> listaSeguimiento = new ArrayList<>();

    public Usuario(String nombre, String vacuna) {

        this.idUsuario = nombre;
        this.vacuna = vacuna;
    }

    public Usuario(){ }

    public void addFecha(){
        this.ordenFecha++;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public List<Seguimiento> getListaSeguimiento() {
        return listaSeguimiento;
    }

    public void setListaSeguimiento(List<Seguimiento> listaSeguimiento) {
        this.listaSeguimiento = listaSeguimiento;
    }

    public Integer getOrdenFecha() {
        return ordenFecha;
    }

    public void setOrdenFecha(Integer ordenFecha) {
        this.ordenFecha = ordenFecha;
    }
}
