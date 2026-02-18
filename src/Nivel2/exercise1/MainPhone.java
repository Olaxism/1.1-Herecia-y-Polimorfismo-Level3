package Nivel2.exercise1;

import Nivel2.exercise1.classes.SmartPhone;

public class MainPhone {public static void main(String[] args) {
    // TODO Auto-generated method stub

    SmartPhone s1 = new SmartPhone ("Samsung", "Galaxy A14", "629-47-37-27");
    SmartPhone s2 = new SmartPhone ("Motorola", "Moto G84", "672-57-67-77");
    SmartPhone t1 = new SmartPhone("SonyEricsson", "W910i", "673-21-32-43");


    s1.call(s2.getNumber());
    s1.alarm();
    s1.takePic();
    t1.alarm();
}
}