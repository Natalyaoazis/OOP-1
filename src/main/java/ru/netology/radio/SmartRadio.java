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
        if (currentNumberRadio < maxNumberRadio) {
            this.currentNumberRadio = currentNumberRadio + 1;
        } else {
            this.currentNumberRadio = minNumberRadio;
        }
    }


    public void reduceNumberRadio() {
        if (currentNumberRadio > minNumberRadio) {
            this.currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = maxNumberRadio;
        }
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public int getMaxNumberRadio() {
        return maxNumberRadio;
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
