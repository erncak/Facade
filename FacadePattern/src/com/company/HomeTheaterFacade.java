package com.company;

public class HomeTheaterFacade {
    musicSystem amp;
    TheaterLights lights;
    TvStick tvStick;
    LivingRoomFan livingRoomFan;
    LivingRoomTv livingRoomTv;
    KitchenLight kitchenLight;
    Refrigritor refrigritor;
    Microwave microwave;
    CoffeMachine coffeMachine;

    public HomeTheaterFacade(KitchenLight kitchenLight, Refrigritor refrigritor, Microwave microwave, CoffeMachine coffeMachine) {
        this.kitchenLight = kitchenLight;
        this.refrigritor = refrigritor;
        this.microwave = microwave;
        this.coffeMachine = coffeMachine;
    }

    public HomeTheaterFacade(musicSystem amp, TheaterLights lights, TvStick tvStick, LivingRoomFan livingRoomFan, LivingRoomTv livingRoomTv) {
        this.amp = amp;
        this.lights = lights;
        this.tvStick = tvStick;
        this.livingRoomFan = livingRoomFan;
        this.livingRoomTv = livingRoomTv;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        livingRoomFan.on();
livingRoomFan.ChooseLevel(2);
lights.on();

        lights.dim(10);
        livingRoomTv.on();
        livingRoomTv.Source();
        tvStick.on();
        tvStick.openApp("Netflix");
        tvStick.SearchMovie(movie);
        tvStick.play();

        amp.on();

        amp.setSurroundSound();
        amp.setVolume(5);


    }

    public void endMovie(){
        System.out.println("Stopping Movie..");
        tvStick.closeApp();
        tvStick.off();
        amp.off();
        livingRoomTv.off();
        lights.dim(100);
        livingRoomFan.off();
    }


public void Coock(){
    System.out.println("PreParing food...");
    kitchenLight.on();
    refrigritor.on("Party");
    microwave.on();
    microwave.Setting();
    microwave.Grill("Electric Grill");
    microwave.ElectricGrill();
    coffeMachine.on();
    microwave.Baking("Napaliten Pizza");
    microwave.Baking("Chicago");
    microwave.Baking("Margaharita");
    microwave.Baking("Marmarina");


}
public void UnBaking(){
    System.out.println("Closing Kitchen");
    refrigritor.off("Normal");
    microwave.offGrill();
    coffeMachine.off();
    microwave.off();

}

}
