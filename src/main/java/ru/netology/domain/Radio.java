package ru.netology.domain;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentRadioStation = 0;
    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 100;
    private int currentVolumeLevel = 10;

    public Radio() {

    }

    public Radio(int maxRadioStation, int currentRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
    }

    public Radio(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation += 1;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation -= 1;
    }

    public void increaseVolumeLevel() {
        if (currentVolumeLevel == maxVolumeLevel) {
            return;
        }
        this.currentVolumeLevel += 1;
    }

    public void decreaseVolumeLevel() {
        if (currentVolumeLevel == minVolumeLevel) {
            return;
        }
        this.currentVolumeLevel -= 1;
    }
}
