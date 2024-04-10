package ru.maxima.radio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DarkUndergroundRadio implements Radio{

    private List<String> songsOnTheDarkUndergroundRadio;

    public DarkUndergroundRadio() {
        this.songsOnTheDarkUndergroundRadio = new ArrayList<>(List.of
                (
                        "Mareux - Killer",
                        "Decades - Move Me",
                        "Demob Happy - Pictures of you"
                )
        );
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheDarkUndergroundRadio;
    }

    @Override
    public String getStationName() {
        return "Dark Underground Radio";
    }

    @Override
    public String toString() {
        return "Dark Underground Radio";
    }

}
