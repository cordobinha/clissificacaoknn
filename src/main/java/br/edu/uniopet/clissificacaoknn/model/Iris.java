package br.edu.uniopet.clissificacaoknn.model;

public class Iris {

    private double sepallength;
    private double sepalwidth;
    private double petallength;
    private double petalwidth;
    private String irisType;

    public Iris() {
    }

    public Iris(double sepallength, double sepalwidth, double petallength, double petalwidth, String irisType) {
        this.sepallength = sepallength;
        this.sepalwidth = sepalwidth;
        this.petallength = petallength;
        this.petalwidth = petalwidth;
        this.irisType = irisType;
    }

    public double getSepallength() {
        return sepallength;
    }

    public void setSepallength(double sepallength) {
        this.sepallength = sepallength;
    }

    public double getSepalwidth() {
        return sepalwidth;
    }

    public void setSepalwidth(double sepalwidth) {
        this.sepalwidth = sepalwidth;
    }

    public double getPetallength() {
        return petallength;
    }

    public void setPetallength(double petallength) {
        this.petallength = petallength;
    }

    public double getPetalwidth() {
        return petalwidth;
    }

    public void setPetalwidth(double petalwidth) {
        this.petalwidth = petalwidth;
    }

    public String getIrisType() {
        return irisType;
    }

    public void setIrisType(String irisType) {
        this.irisType = irisType;
    }
}
