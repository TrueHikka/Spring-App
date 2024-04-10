package ru.maxima.radio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkUndergroundRadio implements Radio{

    private List<String> songsOnTheDarkUndergroundRadio;

    public DarkUndergroundRadio(List<String> songsOnTheDarkUndergroundRadio) {
        this.songsOnTheDarkUndergroundRadio = songsOnTheDarkUndergroundRadio;
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheDarkUndergroundRadio;
    }

    @Override
    public String getStationName() {
        return "Dark Underground Radio";
    }
}
