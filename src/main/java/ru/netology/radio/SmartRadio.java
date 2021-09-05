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
        if (newNumber > minNumberRadio && newNumber < maxNumberRadio) {
            newNumber = newNumber + 1;
        }
        currentNumberRadio = newNumber;
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
        if (newVolume > minVolume && newVolume < maxVolume) {
            newVolume = newVolume + 1;
        }
        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



}
