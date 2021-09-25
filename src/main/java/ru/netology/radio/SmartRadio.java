package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class SmartRadio {
    private int currentNumberRadioByDefault;
    private int currentVolume;
    private int minNumberRadio = 0;
    private int maxNumberRadioByDefault = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int countRadioStation = 100;
    private int maxNumberRadioStation = countRadioStation-1;
    private int currentNumberRadioByHand;

    public SmartRadio() {
    }

    public SmartRadio(int currentNumberRadioByDefault, int currentVolume, int minNumberRadio, int maxNumberRadioByDefault, int minVolume, int maxVolume, int countRadioStation, int currentNumberRadioByHand) {
        this.currentNumberRadioByDefault = currentNumberRadioByDefault;
        this.currentVolume = currentVolume;
        this.minNumberRadio = minNumberRadio;
        this.maxNumberRadioByDefault = maxNumberRadioByDefault;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.countRadioStation = countRadioStation;
        this.currentNumberRadioByHand = currentNumberRadioByHand;
    }

    public SmartRadio(int currentNumberRadioByDefault, int maxNumberRadioByDefault) {
        this.currentNumberRadioByDefault = currentNumberRadioByDefault;
        this.maxNumberRadioByDefault = maxNumberRadioByDefault;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getCurrentNumberRadioByHand() {
        return currentNumberRadioByHand;
    }

    public void setCountRadioStation(int countRadioStation) {
      this.countRadioStation = countRadioStation;
    }

    public void setCurrentNumberRadioByHand(int currentNumberRadioByHand) {
      this.currentNumberRadioByHand = currentNumberRadioByHand;
    }

    public void increaseNumberRadioByHand() {
        if (currentNumberRadioByHand>minNumberRadio) {
        this.currentNumberRadioByHand = currentNumberRadioByHand+1;
        }
    }


    public void increaseNumberRadioByHandOver() {
        if (currentNumberRadioByHand>countRadioStation) {
            this.currentNumberRadioByHand = minNumberRadio;
        }
        }

    public void reduceNumberRadioByHand() {
        if (currentNumberRadioByHand>minNumberRadio) {
            this.currentNumberRadioByHand = currentNumberRadioByHand -1;
        }
    }
    public void reduceNumberRadioByHandOver() {
        if (currentNumberRadioByHand<minNumberRadio) {
            this.currentNumberRadioByHand = maxNumberRadioStation;
        }
    }

    public void setCurrentNumberRadio(int currentNumberRadioByDefault) {
        if (currentNumberRadioByDefault < minNumberRadio) {
            this.currentNumberRadioByDefault = maxNumberRadioByDefault;
            return;
        }
        if (currentNumberRadioByDefault > maxNumberRadioByDefault) {
            this.currentNumberRadioByDefault = minNumberRadio;
            return;
        }
        this.currentNumberRadioByDefault = currentNumberRadioByDefault;
    }

    public void increaseNumberRadio() {
        if (currentNumberRadioByDefault<maxNumberRadioByDefault) {
            this.currentNumberRadioByDefault = currentNumberRadioByDefault + 1;
        }
        else {
            this.currentNumberRadioByDefault = minNumberRadio;
        }
    }


    public void reduceNumberRadio() {
        if (currentNumberRadioByDefault>minNumberRadio) {
            this.currentNumberRadioByDefault = currentNumberRadioByDefault - 1;
        } else {
            currentNumberRadioByDefault = maxNumberRadioByDefault;
        }
    }

    public int getCurrentNumberRadio() {
        return currentNumberRadioByDefault;
    }
    public int getMaxNumberRadio() {
        return maxNumberRadioByDefault;
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
        if(currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
