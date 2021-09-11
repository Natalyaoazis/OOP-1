package ru.netology.radio;

public class SmartRadio {
    private int currentNumberRadio;
    private int currentVolume;


    public void setCurrentNumberRadio(int newNumber) {
        int minNumberRadio = 0;
        int maxNumberRadio = 9;
        if (newNumber < minNumberRadio) {
            newNumber = maxNumberRadio;
        }
        if (newNumber > maxNumberRadio) {
            newNumber = minNumberRadio;
        }
        currentNumberRadio = newNumber;
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
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume + 1;
    }

    public void reduceVolume() {
        currentVolume = currentVolume - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
