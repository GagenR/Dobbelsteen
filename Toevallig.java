package demo;

import java.util.Random;

class Toevallig 
{

	public static void main(String[] args) 
	{
		int totaalcount = 0;
		Random toeval = new Random();
		for (int i = 1; i <=10 ; i++)
		{
		int getal = toeval.nextInt(6) + 1;
		System.out.println(getal);	
		if (getal == 1)
			totaalcount++;
		}
		
		System.out.println("Hoevaak is er 1 gegooid?: " + totaalcount);
		System.out.println("============");
		System.out.println("Toevallig klaar");
		
		}
}
