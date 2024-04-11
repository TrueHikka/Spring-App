package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);
        System.out.println(radioPlayer.playRadio());

        RadioStationsList radioStationsList = context.getBean("radioStationsList", RadioStationsList.class);
        System.out.println(radioStationsList.getRadioStations());

    }
}
