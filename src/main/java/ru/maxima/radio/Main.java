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

//        Radio radio1 = context.getBean("idOfRadioMaximum", RadioMaximum.class);
//        RadioPlayer radioPlayer1 = new RadioPlayer(radio1);
//        radioPlayer1.playRadio(radio1);
//
//        Radio radio2 = context.getBean("idOfRadioEnergy", RadioEnergy.class);
//        RadioPlayer radioPlayer2 = new RadioPlayer(radio2);
//        radioPlayer2.playRadio(radio2);
    }
}
