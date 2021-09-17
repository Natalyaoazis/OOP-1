package ru.netology.radio;

public class SmartRadio {
    private int currentNumberRadio;
    private int currentVolume;
    private int minNumberRadio = 0;
    private int maxNumberRadio = 9;
    private int minVolume = 0;
    private int maxVolume = 10;


    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio < minNumberRadio) {
            this.currentNumberRadio = maxNumberRadio;
            return;
        }
        if (currentNumberRadio > maxNumberRadio) {
            this.currentNumberRadio = minNumberRadio;
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public void increaseNumberRadio() {
        currentNumberRadio = currentNumberRadio + 1;
    }


    public void reduceNumberRadio() {
        currentNumberRadio = currentNumberRadio - 1;
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }


    public void setCurrentVolume(int newVolume) {
        int minVolume = 0;
        int maxVolume = 10;
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if(currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
