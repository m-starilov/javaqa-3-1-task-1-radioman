package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentRadioStation() {
        radio.setCurrentRadioStation(1);

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation5() {
        radio.setCurrentRadioStation(5);

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation100() {
        radio.setCurrentRadioStation(100);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMinus10() {
        radio.setCurrentRadioStation(-10);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStation() {
        Radio radio = new Radio(10,0);
        radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationFrom5() {
        Radio radio = new Radio(10,5);
        radio.nextRadioStation();

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationFromMax() {
        Radio radio = new Radio(10,10);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStation() {
        Radio radio = new Radio(10,9);
        radio.prevRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStationFrom0() {
        Radio radio = new Radio(10,0);
        radio.prevRadioStation();

        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolumeLevelFrom0() {
        Radio radio = new Radio(0);
        radio.increaseVolumeLevel();

        assertEquals(1, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseVolumeLevelFrom1() {
        Radio radio = new Radio(1);
        radio.increaseVolumeLevel();

        assertEquals(2, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldNotIncreaseVolumeLevelFromMax() {
        Radio radio = new Radio(100);
        radio.increaseVolumeLevel();

        assertEquals(100, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseVolumeLevelFromMax() {
        Radio radio = new Radio(100);
        radio.decreaseVolumeLevel();

        assertEquals(99, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseVolumeLevelFrom5() {
        Radio radio = new Radio(5);
        radio.decreaseVolumeLevel();

        assertEquals(4, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldNotDecreaseVolumeLevelFrom0() {
        Radio radio = new Radio(0);
        radio.decreaseVolumeLevel();

        assertEquals(0, radio.getCurrentVolumeLevel());
    }

}