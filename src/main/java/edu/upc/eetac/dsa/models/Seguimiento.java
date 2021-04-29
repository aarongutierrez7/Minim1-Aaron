package edu.upc.eetac.dsa.models;

import java.util.*;

public class Seguimiento {

    Date fechaSeguimiento;
    Integer numSeguimientos;

    public void addSeguimiento(){
        this.numSeguimientos++;
    }
    public Date getFechaSeguimiento() {
        return fechaSeguimiento;
    }

    public void setFechaSeguimiento(Date fechaSeguimiento) {
        this.fechaSeguimiento = fechaSeguimiento;
    }

    public Integer getNumSeguimientos() {
        return numSeguimientos;
    }

    public void setNumSeguimientos(Integer numSeguimientos) {
        this.numSeguimientos = numSeguimientos;
    }
}
