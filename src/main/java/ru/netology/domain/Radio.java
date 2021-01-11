package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentRadioStation = 0;
    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 100;
    private int currentVolumeLevel = 10;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
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
