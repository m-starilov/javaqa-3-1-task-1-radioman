package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation5(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation100(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(100);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMinus10(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-10);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationFrom5(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationFrom9(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStationFrom0(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolumeLevelFrom0(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.increaseVolumeLevel();

        assertEquals(1, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseVolumeLevelFrom1(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(1);
        radio.increaseVolumeLevel();

        assertEquals(2, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldNotIncreaseVolumeLevelFrom10(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(10);
        radio.increaseVolumeLevel();

        assertEquals(10, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseVolumeLevelFrom10(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(10);
        radio.decreaseVolumeLevel();

        assertEquals(9, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseVolumeLevelFrom5(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);
        radio.decreaseVolumeLevel();

        assertEquals(4, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldNotDecreaseVolumeLevelFrom0(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolumeLevel();

        assertEquals(0, radio.getCurrentVolumeLevel());
    }

}