package m1_17_Marta_Laveda_Box;

public class Main {
	
		public static void main(String[] args) {
			
			Baraja baraja = new Baraja();
	        Mazo mazo = baraja.getMazo();
	        System.out.println(mazo.toString());

	        mazo.ordenaComparable();
	        System.out.println(mazo.toString());

	        mazo.ordenaComparator();
	        System.out.println(mazo.toString());
	        
		}

}
