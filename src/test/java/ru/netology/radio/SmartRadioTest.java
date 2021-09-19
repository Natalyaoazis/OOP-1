package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {
    SmartRadio smart = new SmartRadio();

        @Test
    void shouldSetCurrentNumberRadio() {
       smart.setCurrentNumberRadio(4);

        int expected = 4;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentNumberMax() {
        smart.setCurrentNumberRadio(smart.getMaxNumberRadio());
        assertEquals(9, smart.getCurrentNumberRadio());
    }

    @Test
    void shouldSetCurrentNumberMin() {
        smart.setCurrentNumberRadio(smart.getMinNumberRadio());
        assertEquals(0, smart.getCurrentNumberRadio());
    }


    @Test
    void shouldIncreaseNumberRadioMoreMax() {
        smart.setCurrentNumberRadio(11);
        assertEquals(0, smart.getCurrentNumberRadio());
    }

    @Test
    void shouldIncreaseNumberRadioLessMin() {
        smart.setCurrentNumberRadio(-15);
        assertEquals(9, smart.getCurrentNumberRadio());
    }
    @Test
    void shouldIncreaseNumberRadio() {
        smart.setCurrentNumberRadio(5);
        smart.increaseNumberRadio();

        int expected = 6;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseNumberRadiMax() {
        smart.setCurrentNumberRadio(9);
        smart.increaseNumberRadio();

        int expected = 0;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }



    @Test
    void shouldReduceNumberRadio() {
        smart.setCurrentNumberRadio(5);
        smart.reduceNumberRadio();

        int expected = 4;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceNumberRadioMax() {
        smart.setCurrentNumberRadio(9);
        smart.reduceNumberRadio();

        int expected = 8;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceNumberRadioMin() {
        smart.setCurrentNumberRadio(0);
        smart.reduceNumberRadio();

        int expected = 9;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSetCurrentVolume() {
        smart.setCurrentVolume(3);

        int expected = 3;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeMoreMax() {
        smart.setCurrentVolume(13);

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeLessMin() {
        smart.setCurrentVolume(-52);

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        smart.setCurrentVolume(6);
        smart.increaseVolume();

        int expected = 7;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolumeMax() {
        smart.setCurrentVolume(10);
        smart.increaseVolume();

        int expected = 10;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldReduceVolume() {
        smart.setCurrentVolume(6);
        smart.reduceVolume();

        int expected = 5;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldReduceVolumeMin() {
        smart.setCurrentVolume(0);
        smart.reduceVolume();

        int expected = 0;
        int actual = smart.getCurrentVolume();

        assertEquals(expected, actual);
    }

}