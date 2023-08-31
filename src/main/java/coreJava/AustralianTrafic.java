package coreJava;

import demoPack.CentralTraffic;

public class AustralianTrafic implements CentralTraffic, ContinentalTraffic {
    public static void main(String[] args) {

        CentralTraffic a = new AustralianTrafic();
        a.redStop();
        a.flashYellow();
        a.greenGo();

        AustralianTrafic at = new AustralianTrafic();
        at.walkonsymbol();

        ContinentalTraffic ct = new AustralianTrafic();
        ct.train();
    }

    @Override
    public void greenGo() {
        System.out.println("greenGo implmentation");
    }

    public void walkonsymbol() {
        System.out.println("walking");
        System.out.println("stil walking");
        System.out.println("walking still");
        System.out.println("walk walk");
        //new updates
        System.out.println("walking some more, why the hell not!");

    }

    @Override
    public void redStop() {
        System.out.println("redstop implmentation");
    }

    @Override
    public void flashYellow() {
        System.out.println("flashYellow implmentation");
    }

    @Override
    public void train() {
        System.out.println("train is coming");
    }
}
