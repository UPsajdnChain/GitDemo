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
