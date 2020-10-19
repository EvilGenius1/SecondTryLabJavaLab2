package com.company;

public class StreightPeramid extends Cvadrat{

    private int apophema;
    private double volume, ploshchaPeramid;
    Cvadrat peramidCvadrat = new Cvadrat();

    public void setApophema( int apophema){
        this.apophema = apophema;
    }
    public void setVolume(){
        this.volume = volume;
    }

    public int getApophema(){
        if(apophema > 0){
            return apophema;
        }
        else{
            apophema = 6;
            return apophema;
        }
    }

    public double getVolume(){
        peramidCvadrat.setSides((int) (Math.random() * 5 + 2 ));
        volume = (1.0/3.0) * getApophema() * peramidCvadrat.getSideOne();
        return volume;
    }

    public double getPloshchaPeramid(){
        peramidCvadrat.setSides((int) (Math.random() * 5 + 2 ));
        ploshchaPeramid = peramidCvadrat.getPloshcha() + (peramidCvadrat.getSideOne() * 3) * 4;
        return ploshchaPeramid;
    }

    public void showPiramidRes(){
        System.out.println( "Piramid volume = " + getVolume() + " = 1/3 * " + getApophema() + " * " + peramidCvadrat.getSideOne());
        System.out.println("Ploshcha peramid = " + getPloshchaPeramid());
    }

}
