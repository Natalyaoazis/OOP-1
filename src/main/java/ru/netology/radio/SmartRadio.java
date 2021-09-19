package ru.netology.radio;

public class SmartRadio {
    private int currentNumberRadio;
    private int currentVolume;
    private int minNumberRadio = 0;
    private final int countOfRadioStationByDefault = 10;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int countRadioStation;
    private boolean on;


    public SmartRadio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public SmartRadio(int currentNumberRadio, int currentVolume, int minNumberRadio, int minVolume, int maxVolume, int countRadioStation, boolean on) {
        this.currentNumberRadio = currentNumberRadio;
        this.currentVolume = currentVolume;
        this.minNumberRadio = minNumberRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.countRadioStation = countRadioStation;
        this.on = on;
    }

    public SmartRadio() {

    }

    public void setCountRadioStation(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < minNumberRadio) {
            this.currentNumberRadio = countRadioStation;
            return;
        }
        if (currentNumberRadio > countRadioStation) {
            this.currentNumberRadio = minNumberRadio;
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public void increaseNumberRadio() {
        if (currentNumberRadio < countRadioStation) {
            this.currentNumberRadio = currentNumberRadio + 1;
        } else {
            this.currentNumberRadio = minNumberRadio;
        }
    }


    public void reduceNumberRadio() {
        if (currentNumberRadio > minNumberRadio) {
            this.currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = countRadioStation;
        }
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public int getMaxNumberRadio() {
        return countRadioStation;
    }

    public int getMinNumberRadio() {
        return minNumberRadio;
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
