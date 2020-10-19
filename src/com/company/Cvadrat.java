package com.company;

public class Cvadrat implements Main.ShowCase {

    private int sideOne;
    private int perimtr;
    private double ploshcha;

    public void setSides(int sideOne){
        this.sideOne = sideOne;
    }

    public int getSideOne(){
        if(sideOne > 0){
        return sideOne;
        }
        else{
            sideOne = 4;
            return sideOne;
        }
    }

    /*public void setFinalRes() {
        this.perimtr = perimtr;
        this.ploshcha = ploshcha;
    }*/

    public int getPerimtr(){
        return perimtr = getSideOne() * 4;
    }

    public double getPloshcha(){
        return ploshcha = getSideOne() * getSideOne();
    }

    public void showRes(){
        System.out.println("Perimtr cvadrata: ");
        System.out.println(getPerimtr() + " = " + getSideOne() + " * 4 ");
    }
}
