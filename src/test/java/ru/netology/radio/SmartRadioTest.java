package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {

    SmartRadio radio = new SmartRadio(99);

    @Test
    public void shouldSetRadioStation() {
        radio.setCountRadioStation(55);
        assertEquals(55, radio.getCountRadioStation());
    }
    @Test
    public void shouldSetNextRadioStation() {
        radio.setCurrentRadio(55);
        radio.nextStation();
        assertEquals(56, radio.getCurrentRadio());
    }

    @Test
    public void shouldSetNextRadioStationOverLimit() {
        radio.setCurrentRadio(115);
        radio.nextStationOver();
        assertEquals(0, radio.getCurrentRadio());
    }
    @Test
    public void shouldSetNextRadioStationLimit() {
        radio.setCurrentRadio(56);
        radio.nextStationOver();
        assertEquals(57, radio.getCurrentRadio());
    }
    @Test
    public void shouldSetNextRadioStationUnderLimit() {
        radio.setCurrentRadio(-115);
        radio.nextStation();
        assertEquals(99, radio.getCurrentRadio());
    }
    @Test
    public void shouldDecreaseRadioStation() {
        radio.setCurrentRadio(55);
        radio.decreaseStation();
        assertEquals(54, radio.getCurrentRadio());
    }
    @Test
    public void shouldDecreaseRadioStationUnderLimit() {
        radio.setCurrentRadio(-115);
        radio.decreaseStation();
        assertEquals(99, radio.getCurrentRadio());
    }
    @Test
    public void shouldDecreaseRadioStationOverLimit() {
        radio.setCurrentRadio(115);
        radio.decreaseStationOver();
        assertEquals(0, radio.getCurrentRadio());
    }
    @Test
    public void shouldDecreaseRadioStationLimit() {
        radio.setCurrentRadio(78);
        radio.decreaseStationOver();
        assertEquals(77, radio.getCurrentRadio());
    }



    @Test
    void shouldSetCurrentVolume() {
        radio.setCurrentVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeMoreMax() {
        radio.setCurrentVolume(115);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeLessMin() {
        radio.setCurrentVolume(-52);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {
        radio.setCurrentVolume(6);
        radio.reduceVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeMin() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    }
