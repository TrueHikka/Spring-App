package ru.maxima.radio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class RadioStationsList {
    private List<Radio> radioStations;

    @Autowired
    public RadioStationsList(@Qualifier("radioMaximum") Radio radioMaximum,
                             @Qualifier("radioEnergy") Radio radioEnergy,
                             @Qualifier("darkUndergroundRadio") Radio darkUndergroundRadio, @Qualifier("hardCoreRadio") Radio hardCoreRadio) {
        this.radioStations = List.of(radioMaximum, radioEnergy, darkUndergroundRadio, hardCoreRadio);
    }

    public List<Radio> getRadioStations() {
        return radioStations;
    }

    public Radio getRandomRadio() {
        List<Radio> shuffledRadioStations = new ArrayList<>(radioStations);
        Collections.shuffle(shuffledRadioStations);
        return shuffledRadioStations.get(0);
    }

}
