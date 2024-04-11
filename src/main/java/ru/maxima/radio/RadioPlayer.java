package ru.maxima.radio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class RadioPlayer {
    private RadioStationsList radioStationsList;
    private Radio currentRadio;

    @Autowired
    public RadioPlayer(RadioStationsList radioStationsList) {
        this.radioStationsList = radioStationsList;
        this.currentRadio = radioStationsList.getRandomRadio();
    }

    public String playRadio() {
        List<String> songs = currentRadio.getCurrentSong();
        System.out.println(songs);
        List<String> shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
        String song = shuffledSongs.get(0);
        String stationName = currentRadio.getStationName();
        return stationName + ": " + song;
    }

}
