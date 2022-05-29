package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void maxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void increaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void reductionVolume () {

        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.reductionVolume ();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void maxStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void nextStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }
    @Test
    void prevStation () {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prevStation ();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }
}
