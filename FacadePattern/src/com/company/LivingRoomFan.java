package com.company;

public class LivingRoomFan {
    String description;

    public LivingRoomFan(String description) {
        this.description = description;
    }
public void on(){
    System.out.println("Turning on " + description);
}
public void off(){
           System.out.println("Turning off " + description);

}
    public void ChooseLevel(int n){
        System.out.println(description + " level is " + n);

    }
}
