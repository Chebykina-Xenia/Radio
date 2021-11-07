package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    //громкость звука
    private int currentSoundVolume = 5;
    //номер радиостанции
    private int numberCurrentStation = 3;
    //количество радиостанций
    private int countStation = 10;

    //конструктор с параметрами
    public Radio(int countStation) {
        this.countStation = countStation;
    }

    //ГРОМКОСТЬ ЗВУКА
    //увеличение громкости звука
    public int nextSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }
    //уменьшение громкости звука
    public int prevSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }
    //РАДИОСТАНЦИИ
    //устанавливаем новое значение приватного поля номер радиостанции
    public void setNumberCurrentStation(int numberCurrentStation) {
        if (numberCurrentStation <= getMaxNumberStation() && numberCurrentStation >= 0) {
            this.numberCurrentStation = numberCurrentStation;
        }
    }
   //возвращаем значение номер максимальной радиостанции
    public int getMaxNumberStation() {
        int maxNumberStation = countStation - 1;
        return maxNumberStation;
    }
    //увеличение радиостанции
    public int nextNumberStation() {
        if (numberCurrentStation < getMaxNumberStation()) {
            numberCurrentStation = numberCurrentStation + 1;
        }
        if (numberCurrentStation == getMaxNumberStation()) {
            numberCurrentStation = 0;
        }
        return numberCurrentStation;
    }
    //уменьшение радиостанции
    public int prevNumberStation() {
        if (numberCurrentStation > 0) {
            numberCurrentStation = numberCurrentStation - 1;
        }
        if (numberCurrentStation == 0) {
            numberCurrentStation = getMaxNumberStation();
        }
        return numberCurrentStation;
    }
}
