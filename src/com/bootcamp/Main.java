package com.bootcamp;

public class Main {
    public static void main(String[] args){
        SmartWatch objSmartWatch = new SmartWatch("Samsung", "Galaxy Watch5", "Samsung Fabricante", 1.5, true, 1, "resina", "negro", "metal", "plateado");
        SmartPhone objSmartPhone = new SmartPhone("Motorola", "G22", "Motorola fabricante", 4, true, 2, "4G", "50MP", "Android",2.3 );

        System.out.println("**********SmartWatch**********");
        System.out.println(objSmartWatch.toString());
        System.out.println("**********SmartPhone**********");
        System.out.println(objSmartPhone.toString());

    }
}
