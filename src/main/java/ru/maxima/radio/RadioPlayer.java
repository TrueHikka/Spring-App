package ru.maxima.radio;

public class RadioPlayer {

    private Radio radio;

    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }

    public void playRadio() {
        System.out.println(radio.getCurrentSong());
    }

//    public void playRadio(Radio radio) {
//        System.out.println(radio.getCurrentSong());
//    }
}
