package com.bootcamp;

public class SmartDevice {
    String marca;
    String modelo;
    String fabricante;
    double ram;
    boolean resistenciaAgua;
    Integer garantia;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String fabricante, double ram, boolean resistenciaAgua, Integer garantia) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ram = ram;
        this.resistenciaAgua = resistenciaAgua;
        this.garantia = garantia;
    }
}
