package ru.maxima.radio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RadioEnergy implements Radio {
    private List<String> songsOnTheRadioEnergy;

    public RadioEnergy() {
        this.songsOnTheRadioEnergy = new ArrayList<>(List.of
                (
                        "David GUETTA & Kim PETRAS - When We Were Young",
                        "SIA - Gimme Love",
                        "Tate MCRAE - Greedy"
                )
        );
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheRadioEnergy;
    }

    @Override
    public String getStationName() {
        return "Radio Energy";
    }

    @Override
    public String toString() {
        return "Radio Energy";
    }
}

