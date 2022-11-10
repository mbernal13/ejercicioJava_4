package com.bootcamp;

public class SmartPhone extends SmartDevice{
    String tecnologia;
    String camaraFrontal;
    String sistemaOperativo;
    double velocidadProcesador;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String fabricante, double ram, boolean resistenciaAgua, Integer garantia, String tecnologia, String camaraFrontal, String sistemaOperativo, double velocidadProcesador) {
        super(marca, modelo, fabricante, ram, resistenciaAgua, garantia);
        this.tecnologia = tecnologia;
        this.camaraFrontal = camaraFrontal;
        this.sistemaOperativo = sistemaOperativo;
        this.velocidadProcesador = velocidadProcesador;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tecnologia='" + tecnologia + '\'' +
                ", camaraFrontal='" + camaraFrontal + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", velocidadProcesador=" + velocidadProcesador +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ram=" + ram +
                ", resistenciaAgua=" + resistenciaAgua +
                ", garantia=" + garantia +
                '}';
    }
}
