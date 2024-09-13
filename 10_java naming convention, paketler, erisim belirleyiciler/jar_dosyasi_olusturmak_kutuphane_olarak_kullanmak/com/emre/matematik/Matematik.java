package com.emre.matematik;

public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println(a+" - "+b+" = "+(a-b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println(a+" x "+b+" = "+(a*b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println(a+" / "+b+" = "+((double)a/b));
    }
    
}
