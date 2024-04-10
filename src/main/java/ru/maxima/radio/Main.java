package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

//        Radio radio1 = context.getBean("idOfRadioMaximum", RadioMaximum.class);
//        RadioPlayer radioPlayer1 = new RadioPlayer(radio1);
//        System.out.println(radioPlayer1.playRadio(radio1));
//
//        Radio radio2 = context.getBean("idOfRadioEnergy", RadioEnergy.class);
//        RadioPlayer radioPlayer2 = new RadioPlayer(radio2);
//        System.out.println(radioPlayer2.playRadio(radio2));
//
//        Radio radio3 = context.getBean("idOfDarkUndergroundRadio", DarkUndergroundRadio.class);
//        RadioPlayer radioPlayer3 = new RadioPlayer(radio3);
//        System.out.println(radioPlayer3.playRadio(radio3));

        Radio mixedRadio = context.getBean("idOfMixedRadio", MixedRadio.class);
        RadioPlayer radioPlayer = new RadioPlayer(mixedRadio);
        System.out.println(radioPlayer.playMixedRadio(mixedRadio));

    }
}
