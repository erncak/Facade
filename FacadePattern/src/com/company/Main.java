package com.company;

public class Main {

    public static void main(String[] args) {
        musicSystem amp = new musicSystem("Living Room Sound");

        LivingRoomTv livingRoomTv=new LivingRoomTv("Living Room Tv");
        LivingRoomFan livingRoomFan= new LivingRoomFan("Living room fan");
        TvStick tvStick = new TvStick("Tv Stick");
        Refrigritor refrigritor=new Refrigritor("Refrigrator");
        Microwave microwave = new Microwave("Microwave","Pre Heat",200,5);
        CoffeMachine coffeMachine = new CoffeMachine();


        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        KitchenLight klights=new KitchenLight("Livin Room Celiling Lights");


 HomeTheaterFacade homeTheaterFacade= new HomeTheaterFacade(amp,lights,tvStick,livingRoomFan,livingRoomTv);
 homeTheaterFacade.watchMovie("Spiderman");
 homeTheaterFacade.endMovie();
 HomeTheaterFacade homeTheaterFacade1=new HomeTheaterFacade(klights,refrigritor,microwave,coffeMachine);
 homeTheaterFacade1.Coock();
homeTheaterFacade1.UnBaking();
        // write your code here
    }
}
