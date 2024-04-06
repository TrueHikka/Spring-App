package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Radio radio = context.getBean("idOfRadioMaximum", RadioMaximum.class);
        RadioPlayer radioPlayer = new RadioPlayer(radio);
        radioPlayer.playRadio();

        radio = context.getBean("idOfRadioEnergy", RadioEnergy.class);
        radioPlayer = new RadioPlayer(radio);
        radioPlayer.playRadio();

    }
}
