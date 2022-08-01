package com.company;

public class TvStick {
    String description;
    String app;
    String Title;

    public TvStick(String description) {
        this.description = description;
    }
    public void on(){
        System.out.println(description+ " is on" );
    }
    public void off(){
        System.out.println(description+ " is off");

    }
    public void closeApp(){
        System.out.println("Closing "+   app+ " on "+ description);
    }
    public void openApp(String App){
        System.out.println("Opening " +App+ " on " + description);
        app=App;
    }

    public void SearchMovie(String movie){
        System.out.println("Opening  "+ movie +" on "+ app );
         Title=movie;
    }
    public void play(){
        System.out.println("Playing "+ Title+ "  on " +app );
    }
}
