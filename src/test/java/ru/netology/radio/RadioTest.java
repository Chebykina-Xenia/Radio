package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //ГРОМКОСТЬ ЗВУКА
    //увеличение громкости в пределах границ
    @Test
    void increaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.increaseSoundVolume();

        int expected = 5;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение громкости, если стоит максимум (10)
    @Test
    void increaseSoundVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseSoundVolume();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение громкости, если стоит минимум (0)
    @Test
    void increaseSoundVolumeMinTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости в пределах границ
    @Test
    void decreaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.decreaseSoundVolume();

        int expected = 3;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости если стоит максимальное значение (10)
    @Test
    void decreaseSoundVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.decreaseSoundVolume();

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение громкости если стоит минимальное значение (0)
    @Test
    void decreaseSoundVolumeMinTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //РАДИОСТАНЦИИ
    //увеличение радиостанции в пределах границ
    @Test
    void increaseNumberStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(5);
        radio.increaseNumberStation();

        int expected = 6;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если текущая 9
    @Test
    void increaseNumberStation9Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);
        radio.increaseNumberStation();

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если вводим значение больше границ (9)
    @Test
    void increaseNumberStationMore9Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(10);
        radio.increaseNumberStation();

        int expected = 1;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //увеличение радиостанции, если вводим значение меньше границ (-5)
    @Test
    void increaseNumberStationLes0Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(-5);
        radio.increaseNumberStation();

        int expected = 1;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим значение в границах
    @Test
    void decreaseNumberStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(5);
        radio.decreaseNumberStation();

        int expected = 4;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если минимальное значение (0)
    @Test
    void decreaseNumberStation0Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(0);
        radio.decreaseNumberStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим больше 9
    @Test
    void decreaseNumberStationMore9Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(10);
        radio.decreaseNumberStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //уменьшение радиостанции, если вводим меньше 0
    @Test
    void decreaseNumberStationLesse0Test() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(-5);
        radio.decreaseNumberStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }
}