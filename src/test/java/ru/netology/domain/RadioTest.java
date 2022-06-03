package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    void increaseVolumeMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();
        radio.maxVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void increaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void reductionVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.reductionVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void reductionVolumeMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.reductionVolume();
        radio.minVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void maxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.maxVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void minVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.minVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void negativeVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.minVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void maxiVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.maxVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void nextStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(7);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void nextStationMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();
        radio.maxStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void prevStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }
    @Test
    void prevStationMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();
        radio.minStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void maxStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.maxStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void minStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.minStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void maxiStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(11);

        radio.maxStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void negativeStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        radio.minStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }


}



