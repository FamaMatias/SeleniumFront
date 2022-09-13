package com.speedup.qa.models;

public class Job {

    private String Titulo;
    private String NombreDeEmpresa;
    private String Ubicacion;
    private String Industria;
    private String Description;

    public String getTitulo() {
        return Titulo;
    }

    public String getNombreDeEmpresa() {
        return NombreDeEmpresa;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getIndustria() {
        return Industria;
    }

    public String getDescription() {
        return Description;
    }

    public Job(String Titulo, String NombreDeEmpresa, String Ubicacion, String Industria, String Description) {

        this.Titulo = Titulo;
        this.NombreDeEmpresa = NombreDeEmpresa;
        this.Ubicacion = Ubicacion;
        this.Industria = Industria;
        this.Description = Description;
    }

}
