package com.example;

import java.util.List;

public class Lion {
    Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else { //тут ругался при компиляции "[15,38] unmappable character (0x98) for encoding windows-1251" пришлось вот так вот сделать
            throw new Exception("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u0443\u0439\u0442\u0435 \u0434\u043E\u043F\u0443\u0441\u0442\u0438\u043C\u044B\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u044F \u043F\u043E\u043B\u0430 \u0436\u0438\u0432\u043E\u0442\u043D\u043E\u0433\u043E - \u0441\u0430\u043C\u0435\u0439 \u0438\u043B\u0438 \u0441\u0430\u043C\u043A\u0430");
        }
    }



    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
