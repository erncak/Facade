package com.company;

public class Refrigritor {
String descriotion;


    public Refrigritor(String descriotion) {
        this.descriotion = descriotion;

    }
    public void on(String mode1){
        System.out.println(descriotion+ " on in a " + mode1);
    }
    public void off(String offCool){
        System.out.println("Setting " + descriotion+" Cooling to "+ offCool);
    }
}
