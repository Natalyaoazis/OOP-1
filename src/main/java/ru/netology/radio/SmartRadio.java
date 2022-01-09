package ru.netology.radio;

public class SmartRadio {
    private int minNumberRadio = 0;
    private int countRadioStation = 10;
    private int maxNumberRadio = countRadioStation - 1;
    public int currentRadio = 5;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public SmartRadio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxNumberRadio = countRadioStation - 1;
    }

    public SmartRadio() {
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio > maxNumberRadio) {
            this.currentRadio = maxNumberRadio;
            return;
        }
        if (currentRadio < minNumberRadio) {
            this.currentRadio = minNumberRadio;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMaxNumberRadio() {
        return maxNumberRadio;
    }

    public int getMinNumberRadio() {
        return minNumberRadio;
    }

    public void setNextStation() {
        if (currentRadio < maxNumberRadio) {
            this.currentRadio = currentRadio += 1;
        } else {
            this.currentRadio = minNumberRadio;
        }
    }

    public void setPreviousStation() {
        if (currentRadio > minNumberRadio) {
            this.currentRadio = currentRadio -= 1;
        } else {
            currentRadio = maxNumberRadio;
        }
    }

    // Звук

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
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
}



