package com.bootcamp;

public class SmartWatch extends SmartDevice{

    String materialCorrea;
    String colorCorrea;
    String materialCaja;
    String colorCaja;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String fabricante, double ram, boolean resistenciaAgua, Integer garantia, String materialCorrea, String colorCorrea, String materialCaja, String colorCaja) {
        super(marca, modelo, fabricante, ram, resistenciaAgua, garantia);
        this.materialCorrea = materialCorrea;
        this.colorCorrea = colorCorrea;
        this.materialCaja = materialCaja;
        this.colorCaja = colorCaja;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "materialCorrea='" + materialCorrea + '\'' +
                ", colorCorrea='" + colorCorrea + '\'' +
                ", materialCaja='" + materialCaja + '\'' +
                ", colorCaja='" + colorCaja + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ram=" + ram +
                ", resistenciaAgua=" + resistenciaAgua +
                ", garantia=" + garantia +
                '}';
    }
}
