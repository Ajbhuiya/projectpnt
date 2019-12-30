package Abstraction5;

import mahmudabstraction.Toyota;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.checkEmail();
        iphone.playMusic();
        iphone.turnOff();
        iphone.turnOn();
        iphone.useInternet();
        iphone.watchYoutube();
        iphone.downloadApp();

        Phone smPhone = new IPhone();
        smPhone.playMusic();
        smPhone.turnOff();
        smPhone.turnOn();
        ((IPhone) smPhone).downloadApp();//casting

        SmartPhone smhPhone = new IPhone();
    }
}
