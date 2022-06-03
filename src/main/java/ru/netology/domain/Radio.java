package ru.netology.domain;


public class Radio {
    private int currentVolume;
    private int currentStation;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void reductionVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

    public void maxVolume() {

        int newCurrentVolume = 0;
        this.currentVolume = newCurrentVolume;
    }

    public void minVolume() {

        int newCurrentVolume = 10;
        this.currentVolume = newCurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }

        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }

    }

    public void maxStation() {

        int newCurrentStation = 0;
        this.currentStation = newCurrentStation;
    }

    public void minStation() {

        int newCurrentStation = 9;
        this.currentStation = newCurrentStation;
    }


    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }

        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }


}