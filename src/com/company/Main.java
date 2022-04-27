package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	/*Car деген класс тузунуз (Id, номер авто) +
Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет) ++
HashMap тузунуз ключ - машина, маани - машинанын данныйлары
HashMap ти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

        HashMap <Car , MachineData> hashMap = new HashMap<>();

        hashMap.put(new Car(00000001,1),
                    new MachineData("01.01.2022" , "BMW","100000$","BLACK" ));

        hashMap.put(new Car(00000002,2),
                    new MachineData("02.01.2022" , "BMW","100000$","WHITE" ));

        hashMap.put(new Car(00000003,3),
                    new MachineData("03.01.2022" , "BMW","100000$","RED" ));
        System.out.println(hashMap.entrySet());

    }
}
