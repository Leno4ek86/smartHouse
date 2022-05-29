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

        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }

        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
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

        if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }

        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }


}
