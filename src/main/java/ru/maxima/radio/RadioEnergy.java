package ru.maxima.radio;

public class RadioEnergy implements Radio {
    private String song;

    public RadioEnergy(String song) {
        this.song = song;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}

