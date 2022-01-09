package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {

    SmartRadio radio1 = new SmartRadio();


    @Test
    public void shouldSetCurrentRadioStation() {
        radio1.setCurrentRadio(5);
        int expected = 5;
        int actual = radio1.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        int expected = 9;
        int actual = radio1.getMaxNumberRadio();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        radio1.setCurrentRadio(radio1.getMinNumberRadio());
        assertEquals(0, radio1.getMinNumberRadio());
    }

    @Test
    public void shouldSetRadioStationOverLimit() {
        radio1.setCurrentRadio(49);
        assertEquals(9, radio1.getCurrentRadio());
    }

    @Test
    public void shouldSetNextRadioStationUnderLimit() {
        radio1.setCurrentRadio(-15);
        assertEquals(0, radio1.getCurrentRadio());
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio1.setPreviousStation();
        int expected = 4;
        int actual = radio1.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        radio1.setNextStation();
        int expected = 6;
        int actual = radio1.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationUnderLimit() {
        radio1.setCurrentRadio(-115);
        radio1.setPreviousStation();
        assertEquals(9, radio1.getCurrentRadio());
    }

    @Test
    public void shouldIncreaseRadioStationOverLimit() {
        radio1.setCurrentRadio(10);
        radio1.setNextStation();
        assertEquals(0, radio1.getCurrentRadio());
    }

    @Test
    public void shouldCountRadioStation() {
        int countRadioStation = 10;
        int expected = 10;
        int actual = countRadioStation;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountRadioStationByConst() {
        SmartRadio smartRadio = new SmartRadio(20);
        smartRadio.setCurrentRadio(5);
        int expected = 5;
        int actual = smartRadio.getCurrentRadio();
        assertEquals(expected, actual);
    }

    // ЗВУК

    @Test
    void shouldSetCurrentVolume() {
        radio1.setCurrentVolume(50);
        int expected = 50;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeMoreMax() {
        radio1.setCurrentVolume(115);
        int expected = 0;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeLessMin() {
        radio1.setCurrentVolume(-52);
        int expected = 0;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        radio1.setCurrentVolume(56);
        radio1.increaseVolume();
        int expected = 57;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMax() {
        radio1.setCurrentVolume(100);
        radio1.increaseVolume();
        int expected = 100;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {
        radio1.setCurrentVolume(50);
        radio1.reduceVolume();
        int expected = 49;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeLessMin() {
        radio1.setCurrentVolume(0);
        radio1.reduceVolume();
        int expected = 0;
        int actual = radio1.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
