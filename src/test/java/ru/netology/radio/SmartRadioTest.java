package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {


    @Test
    void shouldSetCurrentNumberRadio() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(4);

        int expected = 5;
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
    void shouldSetCurrentVolume() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentVolume(3);

        int expected = 4;
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



}