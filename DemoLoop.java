package demo;

class DemoLoop 
{
	static void tellen()
	{
		int teller;
		for (teller = 1; teller <= 10; teller++)
		{
		System.out.println("Ik ren " + teller + " maal rond die tafel");
	}
		
		System.out.println(teller);
}

	public static void main(String[] args) 
	{
		tellen();
		
		System.out.println("===========");
		System.out.println("DemoLoop klaar.");

	}

}
