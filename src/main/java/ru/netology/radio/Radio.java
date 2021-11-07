package ru.netology.radio;

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

    //конструктор без параметров
    public Radio (){

    }

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
        if (numberCurrentStation <= getMaxNumberStation() && numberCurrentStation>= 0){
        this.numberCurrentStation = numberCurrentStation;}
    }
    //устанавливаем новое значение приватного поля количество радиостанций
    public void setCountStation(int countStation) {
        this.countStation = countStation;
    }
    //возвращаем значение номера текущей радиостанции
    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }
    //возвращаем значение количества радиостанций
    public int getCountStation() {
        return countStation;
    }
    //возвращаем значение номер максимальной радиостанции
    public int getMaxNumberStation(){
        int maxNumberStation = countStation - 1;
        return  maxNumberStation; }

    //увеличение радиостанции
    public int nextNumberStation() {
        if (numberCurrentStation < getMaxNumberStation()) {
            numberCurrentStation = numberCurrentStation + 1;
        }
        if (numberCurrentStation == getMaxNumberStation()){
            numberCurrentStation = 0;
        }
        return numberCurrentStation;
    }

    //увеличение радиостанции если она = maxNumberStation
   // public int nextNumberStationCountSt() {
   //     if (numberCurrentStation == getMaxNumberStation()) {
   //         numberCurrentStation = 0;
   //     }
    //    return numberCurrentStation;
   // }

    //уменьшение радиостанции
    public int prevNumberStation() {
        if (numberCurrentStation > 0) {
            numberCurrentStation = numberCurrentStation - 1;
        }
        if (numberCurrentStation == 0){
            numberCurrentStation = getMaxNumberStation();
        }
        return numberCurrentStation;
    }

    //уменьшение радиостанции если она = 0
    //public int prevNumberStation0() {
      //  if (numberCurrentStation == 0) {
       //     numberCurrentStation = getMaxNumberStation();
        //}
        //return numberCurrentStation;
  //  }

}
