import AlgoTools.IO;
public class Bsp_1 {

	public static void main(String[] args) {

		double seite1, seite2, seite3;
		
		titel("Dreieck nach Heron");
		
		seite1=IO.readDouble("1. Seitenlänge: ");
		seite2=IO.readDouble("2. Seitenlänge: ");
		seite3=IO.readDouble("3. Seitenlänge: ");
		
		IO.print("\nDie Fläche beträgt: ");
		IO.println(flaeche(seite1,seite2,seite3),5,2);
		
		verabschiedung();

	}
	
	
	static double flaeche(double a,double b,double c) {
		
		double f, s;
		s=(a+b+c)/2;
		f=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return f;
		
	}
	
	
	static void titel(String text) {
		
		IO.print("\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		
		IO.print("\n\t\t*  "+ text + "  *\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		
		IO.println("\n");
	}

	
	static void verabschiedung() {
		
		IO.println("\n\n\t Have A Nice Day!");
	}	

}
