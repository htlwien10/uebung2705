import AlgoTools.IO;
public class Bsp_1 {

	public static void main(String[] args) {

		double seite1, seite2, seite3;
		
		titel("Dreieck nach Heron");
		
		seite1=IO.readDouble("1. Seitenl�nge: ");
		seite2=IO.readDouble("2. Seitenl�nge: ");
		seite3=IO.readDouble("3. Seitenl�nge: ");
		
		IO.print("\nDie Fl�che betr�gt: ");
		
		verabschiedung();

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
