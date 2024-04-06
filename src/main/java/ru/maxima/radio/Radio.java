package ru.maxima.radio;

import java.util.List;

public interface Radio {
    List<String> getCurrentSong();
    String getStationName();
}
