package edu.upc.eetac.dsa.models;

public class Vacuna {

    String idVacuna;
    int numVacunasAplicadas;

    public Vacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public void addVacuna(){
        this.numVacunasAplicadas++;
    }

    public String getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getNumVacunasAplicadas() {
        return numVacunasAplicadas;
    }

    public void setNumVacunasAplicadas(int numVacunasAplicadas) {
        this.numVacunasAplicadas = numVacunasAplicadas;
    }
}
