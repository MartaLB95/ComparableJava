package m1_17_Marta_Laveda_Box;
	
	import java.util.HashMap;
	import java.util.Map;


	public class ValorCarta {

		public static final Map<String, Integer> valorCartas=new HashMap<>();
		
		 static {
		        valorCartas.put("AS", 0);
		        valorCartas.put("DOS", 1);
		        valorCartas.put("TRES", 2);
		        valorCartas.put("CUATRO", 3);
		        valorCartas.put("CINCO", 4);
		        valorCartas.put("SEIS", 5);
		        valorCartas.put("SIETE", 6);
		        valorCartas.put("SOTA", 7);
		        valorCartas.put("CABALLO", 8);
		        valorCartas.put("REY", 9);
		    }
		
	}

