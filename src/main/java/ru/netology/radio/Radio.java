package ru.netology.radio;

public class Radio {
    //громкость звука
    private int currentSoundVolume;
    //номер радиостанции
    private int numberCurrentStation;

    //ГРОМКОСТЬ ЗВУКА
    //возвращаем значение приватного поля громкость звука
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    //устанавливаем новое значение приватного поля громкость звука
    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        currentSoundVolume = newCurrentSoundVolume;
    }

    //увеличение громкости звука
    public int increaseSoundVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }

    //уменьшение громкости звука
    public int decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }

    //РАДИОСТАНЦИИ
    //возвращаем значение приватного поля радиостанция
    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    //устанавливаем новое значение приватного поля радиостанция
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation <= 9 && newNumberCurrentStation >= 0) {
            numberCurrentStation = newNumberCurrentStation;
        } else
            numberCurrentStation = getNumberCurrentStation();
    }

    //увеличение радиостанции
    public int increaseNumberStation() {
        if (numberCurrentStation < 9) {
            numberCurrentStation = numberCurrentStation + 1;
        } else
            numberCurrentStation = increaseNumberStation9();
        return numberCurrentStation;
    }

    //увеличение радиостанции если она = 9
    public int increaseNumberStation9() {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
        }
        return numberCurrentStation;
    }

    //уменьшение радиостанции
    public int decreaseNumberStation() {
        if (numberCurrentStation > 0) {
            numberCurrentStation = numberCurrentStation - 1;
        } else
            numberCurrentStation = decreaseNumberStation0();
        return numberCurrentStation;
    }

    //уменьшение радиостанции если она = 0
    public int decreaseNumberStation0() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
        }
        return numberCurrentStation;
    }

}
