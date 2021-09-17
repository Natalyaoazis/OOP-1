package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {


    @Test
    void shouldSetCurrentNumberRadio() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(4);

        int expected = 4;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentNumberMoreMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(15);

        int expected = 0;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentNumberLessMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(-5);

        int expected = 9;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseNumberRadio() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(5);
        smart.increaseNumberRadio();

        int expected = 6;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceNumberRadio() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(5);
        smart.reduceNumberRadio();

        int expected = 4;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSetCurrentVolume() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(3);

        int expected = 3;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeMoreMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(13);

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeLessMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(-52);

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(6);
        smart.increaseVolume();

        int expected = 7;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolumeMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(10);
        smart.increaseVolume();

        int expected = 10;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldReduceVolume() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(6);
        smart.reduceVolume();

        int expected = 5;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldReduceVolumeMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(0);
        smart.reduceVolume();

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }


}