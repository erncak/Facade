package com.company;

public class LivingRoomTv {
    String description;

    public LivingRoomTv(String description) {
        this.description = description;
    }
    public void on(){
        System.out.println("Turning on: " + description);
    }
    public void off(){
        System.out.println("Turning off: " + description);
    }
    public void Source(){
        System.out.println("Setting on Sources");

    }

}
