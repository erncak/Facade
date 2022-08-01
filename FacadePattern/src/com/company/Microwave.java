package com.company;

public class Microwave {
    String description;
    String Heat;
    int Tempature;
    int time;
    String Grill;

    public Microwave(String description, String heat, int tempature, int time) {
        this.description = description;
        Heat = heat;
        Tempature = tempature;
        this.time = time;
    }
    public void on(){
        System.out.println("Turning "+ description + " on" );

    }
    public void off(){
        System.out.println("Turning "+ description + " off" );
    }
    public void Setting(){
        System.out.println("Setting" + description + " on" + Heat+ " Tempature: " + Tempature + " Zaman " + time);
    }
public void Grill(String grill){
    System.out.println("Turning" + description + " Grill on");
    Grill=grill;
}
public void ElectricGrill(){
    System.out.println("Turning on "+ Grill);

}
public void offGrill(){
    System.out.println("Turning off "+ Grill);
}
public void Baking(String baking){
    System.out.println("Baking: "+ baking+ " in " + description + " for tempature "+ Tempature+ " time " + time);
}
}
