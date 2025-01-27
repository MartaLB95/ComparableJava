package m1_17_Marta_Laveda_Box;

import java.util.Comparator;

import m1_15_Marta_Laveda_Box.ValorCarta;

public class OrdenandoConComparator implements Comparator<Carta> {

	@Override
	
	public int compare(Carta c1, Carta c2) {
		// Comparador de cartas usado en el algoritmo de ordenaci�n
				 int comparacionNumero;
			
			//Comparación primero por palo
				comparacionNumero=Integer.compare(ValorCarta.valorCartas.get(c2.getNumero()), ValorCarta.valorCartas.get(c1.getNumero()));
				if(comparacionNumero!=0) {
				return comparacionNumero;
				 }else {
			//Comparamos después por número de forma decremental
				 return (c1).getPalo().compareTo (c2.getPalo());
			 }		 
	}

}
