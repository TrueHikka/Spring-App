package ru.maxima.radio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RadioPlayer {

    private Radio radio;

    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }

    /**
     * Метод возвращает строку с названием радиостанции и текущим треком.
     * Этот метод должен вызывать метод playRadio() для каждой радиостанции.
     * То есть есть 3 класса RadioMaximum, RadioEnergy, DarkUndergroundRadio.
     * Так как класс уже определен заранее (когда обращаемся к конкретному bean в Main), то здесь просто можно выводить рандомную песню, которая существует на данной радиостанции.
     */
    public String playRadio(Radio radio) {
        List<String> songs = radio.getCurrentSong();
        System.out.println(songs);
        List<String> shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
        String song = shuffledSongs.get(0);
        String stationName = radio.getStationName();
        return stationName + ": " + song;
    }

    /**
     * Данный метод просто возвращает рандомную радиостанцию.
     * Потом передается в метод playRadio(), а песня выбирается случайным образом, исходя из передаваемого класса.
     * Т.к. метод getRandomRadio() содержится в классе MixedRadio, то для того, чтобы его можно было вызвать, приводим radio к классу MixedRadio.
     * То есть в случае, если в Main просто не хотим задавать bean с заранее известным классом радиостанции.
     */
    public String playMixedRadio(Radio radio) {
        if (radio instanceof MixedRadio) {
            MixedRadio mixedRadio = (MixedRadio) radio;
            Radio randomRadio = mixedRadio.getRandomRadio();
            System.out.println(randomRadio.toString());
            return playRadio(randomRadio);
        } else {
            throw new IllegalArgumentException("Объект radio не является MixedRadio.");
        }
    }
}
