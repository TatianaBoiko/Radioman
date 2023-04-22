package org.example;

public class Radio {
    private int currentRadioStationQnt;
    private int maxRadioStation = 10;
    private int minRadioStation=0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio () {

        public Radio(int radioStationQnt){
            this.currentRadioStationQnt = radioStationQnt -1;
            this.maxRadioStation=minRadioStation+currentRadioStationQnt;
        }
        public void setCurrentRadioStation (int currentRadioStationQnt) {
            return;
        }
        if (currentRadioStationQnt < minRadioStation) {
            return;
        }
        if (currentRadioStationQnt > maxRadioStation) {
            return;
        }
        this.currentRadioStationQnt = currentRadioStationQnt;
    }
    public int getCurrentRadioStationQnt () {
        return currentRadioStationQnt;
    }
    public void setNextRadioStation () {
        if (currentRadioStationQnt == maxRadioStation) {
            this.currentRadioStationQnt = minRadioStation;
            return;
        }
        this.currentRadioStationQnt=currentRadioStationQnt +1;

    }
    public void setPrevRadioStation() {
        if (currentRadioStationQnt==minRadioStation) {
            this.currentRadioStationQnt=maxRadioStation;
            return;
        }
        this.currentRadioStationQnt = currentRadioStationQnt -1;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume>maxVolume) {
            return;
        }
        if (currentVolume<minVolume) {
            return;
        }
        this.currentVolume=currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume==maxVolume) {
            return;
        }
        this.currentVolume=currentVolume+1;
    }
    public void decreaseVolume() {
        if (currentVolume==minVolume) {
            return;
        }
        this.currentVolume=currentVolume -1;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


}
