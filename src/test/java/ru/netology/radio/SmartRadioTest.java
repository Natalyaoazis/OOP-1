package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartRadioTest {
    @Test
    public void shouldUseConstructor() {
        SmartRadio smart = new SmartRadio(9, 5,0, 9,0, 10,100,56);
        SmartRadio smart1 = new SmartRadio(1,9);
    }

    @Test
    void shouldSetCountOfRadioStations() {
        SmartRadio smart = new SmartRadio();
        smart.setCountRadioStation(99);
        assertEquals(99, smart.getCountRadioStation());
    }


    @Test
    void shouldSetCountOfRadioStationMore() {
        SmartRadio smart = new SmartRadio();
        smart.setCountRadioStation(99);
        assertEquals(99, smart.getCountRadioStation());
    }

    @Test
    void shouldSetCurrentOfRadioStation() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(55);
        assertEquals(55, smart.getCurrentNumberRadioByHand());
    }

    @Test
    void shouldIncreaseNumberRadioByHandOver() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(115);
        smart.increaseNumberRadioByHandOver();

        int expected = 0;
        int actual = smart.getCurrentNumberRadioByHand();

        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseNumberRadioByHandMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(0);
        smart.increaseNumberRadioByHandOver();

        int expected = 0;
        int actual = smart.getCurrentNumberRadioByHand();

        assertEquals(expected, actual);
    }


    @Test
    void shouldReduceNumberRadioByHand() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(56);
        smart.reduceNumberRadioByHand();

        int expected = 55;
        int actual = smart.getCurrentNumberRadioByHand();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceNumberRadioByHandOver() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(-15);
        smart.reduceNumberRadioByHandOver();

        int expected = 99;
        int actual = smart.getCurrentNumberRadioByHand();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentNumberRadio() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(4);

        int expected = 4;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentNumberMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(smart.getMaxNumberRadio());
        assertEquals(9, smart.getCurrentNumberRadio());
    }

    @Test
    void shouldSetCurrentNumberMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(smart.getMinNumberRadio());
        assertEquals(0, smart.getCurrentNumberRadio());
    }
    @Test
    void shouldIncreaseNumberRadioMoreMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(11);
        assertEquals(0, smart.getCurrentNumberRadio());
    }
    @Test
    void shouldIncreaseNumberRadioLessMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(-15);
        assertEquals(9, smart.getCurrentNumberRadio());
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
    void shouldIncreaseNumberRadiMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(9);
        smart.increaseNumberRadio();

        int expected = 0;
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
    void shouldReduceNumberRadioMax() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(9);
        smart.reduceNumberRadio();

        int expected = 8;
        int actual = smart.getCurrentNumberRadio();

        assertEquals(expected, actual);
    }
    @Test
    void shouldReduceNumberRadioMin() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadio(0);
        smart.reduceNumberRadio();

        int expected = 9;
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
        smart.setCurrentVolume(115);

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
        smart.setCurrentVolume(100);
        smart.increaseVolume();

        int expected = 100;
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

    @Test
    void shouldIncreaseNumberRadioByHand() {
        SmartRadio smart = new SmartRadio();
        smart.setCurrentNumberRadioByHand(56);
        smart.increaseNumberRadioByHand();

        int expected = 57;
        int actual = smart.getCurrentNumberRadioByHand();

        assertEquals(expected, actual);


        }
    }