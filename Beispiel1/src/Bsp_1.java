import AlgoTools.IO;
public class Bsp_1 {

	public static void main(String[] args) {

		titel("Dreieck nach Heron");
		
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
