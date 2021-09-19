package ru.netology.radio;

public class SmartRadio {
    private int currentNumberRadioByDefault;
    private int currentVolume;
    private int minNumberRadio = 0;
    private int maxNumberRadioByDefault = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int countRadioStation;
    private int currentNumberRadioByHand;

    public SmartRadio() {
    }

    public SmartRadio(int minNumberRadio, int countRadioStation, int currentNumberRadioByHand) {
        this.minNumberRadio = minNumberRadio;
        this.countRadioStation = countRadioStation;
        this.currentNumberRadioByHand = currentNumberRadioByHand;
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
        this.currentNumberRadioByHand = currentNumberRadioByHand +1;
        }
    }


    public void increaseNumberRadioByHandOver() {
        if (currentNumberRadioByHand>countRadioStation) {
            this.currentNumberRadioByHand = minNumberRadio;
        }
        else {
            currentNumberRadioByHand = currentNumberRadioByHand+1;
        }
    }

    public void reduceNumberRadioByHand() {
        if (currentNumberRadioByHand>minNumberRadio) {
            this.currentNumberRadioByHand = currentNumberRadioByHand -1;
        }
    }
    public void reduceNumberRadioByHandOver() {
        if (currentNumberRadioByHand<minNumberRadio) {
            this.currentNumberRadioByHand = countRadioStation;
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
