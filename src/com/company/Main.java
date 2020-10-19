package com.company;

public class Main {

    public static void main(String[] args) {

		double[] arrayN = new double [(int) (Math.random() * 4 + 2 )];
		double minValue = 100.0;

		double[] arrayM = new double [(int) (Math.random() * 4 + 2 )];
		int apophemaFinal = (int) (Math.random() * 4 + 2 );

	Cvadrat cvadrat = new Cvadrat();

	for(int i = 0; i < arrayN.length; i++){
		cvadrat.setSides((int) (Math.random() * 5 + 2 ));
		arrayN[i] = cvadrat.getPloshcha();
		if(arrayN[i] < minValue){
			minValue = arrayN[i];
		}
		System.out.println("Plosha Cvadrata: " + arrayN[i]);
	}
	System.out.println("Min ploshcha:" + minValue);
	cvadrat.showRes();

	StreightPeramid piramid = new StreightPeramid();


	for(int i = 0; i < arrayM.length; i++){

		piramid.setApophema((int) (Math.random() * 5 + 2 ));
		piramid.setSides((int) (Math.random() * 5 + 2 ));

		if(piramid.getApophema() > apophemaFinal)
		{
			System.out.println("Apophema: " + piramid.getApophema() + " > " + apophemaFinal);
		}

		System.out.println("Volume = " + piramid.getVolume());
		System.out.println("Ploshcha = " + piramid.getPloshchaPeramid());

	 }
    }

    interface ShowCase{
        void showRes();
    }

}
