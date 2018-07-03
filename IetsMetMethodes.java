package demo;

class IetsMetMethodes
{
	static void stelJeVoorZeg (String naam)
	{
		System.out.println("Hoi, ik ben " + naam);
	}
	
	public static void main(String[] args) 
	{
		String naam;
		naam  = "Gagen";
		stelJeVoorZeg(naam);
		
		String v = "voetballen";
		String g = "gamen";
	
		byte leeftijd;
		leeftijd = 27;
		double gewicht;
		gewicht = 72.50;
		
		System.out.println("Mijn hobby's zijn: " + v + " en " + g);
		System.out.println("Ik ben " + leeftijd + " jaar");
		System.out.println("Ik weeg " + gewicht + " kg");		

	}

}
