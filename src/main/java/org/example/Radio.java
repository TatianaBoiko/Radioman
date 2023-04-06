package org.example;

public class Radio {
    private int LastRadioStationNumber = 9;
    private int FirstRadioStationNumber = 0;
    private int currentRadioStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < FirstRadioStationNumber) {
            return;
        }
        if (currentRadioStation > LastRadioStationNumber) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == LastRadioStationNumber) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == FirstRadioStationNumber) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
