package ru.maxima.radio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HardCoreRadio implements Radio{

    private List<String> songsOnTheHardCoreRadio;

    public HardCoreRadio() {
        this.songsOnTheHardCoreRadio = new ArrayList<>(List.of
                (
                        "Architects — Early Grave",
                        "Preach — Coin Flip Omen",
                        "Assume Nothing — Forgive Me"
                )
        );
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheHardCoreRadio;
    }

    @Override
    public String getStationName() {
        return "Hard-Core Radio";
    }

    @Override
    public String toString() {
        return "Hard-Core Radio";
    }

}
