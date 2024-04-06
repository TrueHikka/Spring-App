package ru.maxima.radio;

import java.util.List;

public class RadioMaximum implements Radio {
    private List<String> songsOnTheRadioMaximum;

    public RadioMaximum(List<String> songsOnTheRadioMaximum) {
        this.songsOnTheRadioMaximum = songsOnTheRadioMaximum;
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheRadioMaximum;
    }

    @Override
    public String getStationName() {
        return "Radio Maximum";
    }
}
