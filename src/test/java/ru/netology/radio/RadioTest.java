package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();
    //конструктор, где указываем количество радиостанций
    private Radio radioCount = new Radio(25);

    //ГРОМКОСТЬ ЗВУКА
    //увеличение громкости в пределах границ
    @Test
    void nextSoundVolumeTest() {
        radio.nextSoundVolume();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение громкости, если стоит максимум (100)
    @Test
    void nextSoundVolumeMaxTest() {
        radio.setCurrentSoundVolume(100);
        radio.nextSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение громкости, если стоит минимум (0)
    @Test
    void increaseSoundVolumeMinTest() {
        radio.setCurrentSoundVolume(0);
        radio.nextSoundVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости в пределах границ
    @Test
    void prevSoundVolumeTest() {
        radio.prevSoundVolume();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости если стоит максимальное значение (100)
    @Test
    void prevSoundVolumeMaxTest() {
        radio.setCurrentSoundVolume(100);
        radio.prevSoundVolume();
        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости если стоит минимальное значение (0)
    @Test
    void decreaseSoundVolumeMinTest() {
        radio.setCurrentSoundVolume(0);
        radio.prevSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //РАДИОСТАНЦИИ
    //увеличение радиостанции в пределах границ
    @Test
    void nextNumberStationTest() {
        radio.nextNumberStation();
        int expected = 4;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если текущая максимальна (испльзуем инициальзированное поле)
    @Test
    void nextNumberStationIfMax() {
        radio.setNumberCurrentStation(radio.getMaxNumberStation());
        radio.nextNumberStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если текущая максимальна (испльзуем конструктор)
    @Test
    void nextNumberStationIfMaxConstr() {
        radioCount.setNumberCurrentStation(radioCount.getMaxNumberStation());
        radioCount.nextNumberStation();
        int expected = 0;
        int actual = radioCount.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если вводим значение больше границ
    @Test
    void nextNumberStationMoreCountTest() {
        radio.setNumberCurrentStation(22);
        radio.nextNumberStation();
        int expected = 4;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если вводим значение меньше границ
    @Test
    void nextNumberStationLesse0Test() {
        radio.setNumberCurrentStation(-5);
        radio.nextNumberStation();
        int expected = 4;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если вводим значение = countStation
    @Test
    void nextNumberStationCountTest() {
        radio.setNumberCurrentStation(radio.getCountStation());
        radio.nextNumberStation();
        int expected = 4;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим значение в границах
    @Test
    void prevNumberStationTest() {
        radio.prevNumberStation();
        int expected = 2;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если минимальное значение (0)
    @Test
    void prevNumberStation0Test() {
        radio.setNumberCurrentStation(0);
        radio.prevNumberStation();
        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим больше countStation
    @Test
    void prevNumberStationMoreTest() {
        radio.setNumberCurrentStation(22);
        radio.prevNumberStation();
        int expected = 2;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим меньше 0
    @Test
    void decreaseNumberStationLesse0Test() {
        radio.setNumberCurrentStation(-5);
        radio.prevNumberStation();
        int expected = 2;
        int actual = radio.getNumberCurrentStation();
        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }
}

