package ru.maxima.radio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixedRadio implements Radio{
    private List<Radio> radios;

    public MixedRadio(List<Radio> radios) {
        this.radios = radios;
    }

    public Radio getRandomRadio() {
        List<Radio> shuffledRadios = new ArrayList<>(radios);
        Collections.shuffle(shuffledRadios);
        return shuffledRadios.get(0);
    }

    @Override
    public List<String> getCurrentSong() {
        return null;
    }

    @Override
    public String getStationName() {
        return "";
    }
}
