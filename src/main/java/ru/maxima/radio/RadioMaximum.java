package ru.maxima.radio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RadioMaximum implements Radio {
    private List<String> songsOnTheRadioMaximum;

    public RadioMaximum() {
        this.songsOnTheRadioMaximum = new ArrayList<>(List.of
                (
                        "Green Day - Dilemma",
                        "Cage The Elephant - Neon Pill",
                        "Royal Blood - Pull Me Through"
                )
        );
    }

    @Override
    public List<String> getCurrentSong() {
        return songsOnTheRadioMaximum;
    }

    @Override
    public String getStationName() {
        return "Radio Maximum";
    }

    @Override
    public String toString() {
        return "Radio Maximum";
    }
}
