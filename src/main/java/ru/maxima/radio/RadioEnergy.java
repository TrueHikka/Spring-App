package ru.maxima.radio;

import java.util.List;

public class RadioEnergy implements Radio {
    private List<String> songsOnTheRadioEnergy;
    private String nameOfTheRadioStation;

    public RadioEnergy(List<String> songsOnTheRadioEnergy) {
        this.songsOnTheRadioEnergy = songsOnTheRadioEnergy;
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheRadioEnergy;
    }

    @Override
    public String getStationName() {
        return "Radio Energy";
    }
}

