package ru.netology.radio;

public class SmartRadio {
    private int minNumberRadio = 0;
    private int maxNumberRadio = 9;
    private int countRadioStation;
    public int currentRadio;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public SmartRadio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public void setCountRadioStation(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public void setCurrentRadio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }


    public void nextStation() {
        if (currentRadio <= minNumberRadio) {
            this.currentRadio = countRadioStation;
        } else
            this.currentRadio = currentRadio + 1;
    }

    public void nextStationOver() {
        if (currentRadio >= countRadioStation) {
            this.currentRadio = minNumberRadio;
        }
        else
            this.currentRadio = currentRadio + 1;
    }

    public void decreaseStation() {
        if (currentRadio <= minNumberRadio) {
            currentRadio = countRadioStation;
        } else
            this.currentRadio = currentRadio - 1;
    }

    public void decreaseStationOver() {
        if (currentRadio >= countRadioStation) {
            currentRadio = minNumberRadio;
        } else
            this.currentRadio = currentRadio - 1;
    }


    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}



