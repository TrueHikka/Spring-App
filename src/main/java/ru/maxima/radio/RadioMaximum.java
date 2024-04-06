package ru.maxima.radio;

public class RadioMaximum implements Radio {
    private String song;

    public RadioMaximum(String song) {
        this.song = song;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}
