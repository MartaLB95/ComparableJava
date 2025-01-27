package m1_17_Marta_Laveda_Box ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import m1_15_Marta_Laveda_Box.ValorCarta;

public class Mazo{
	
	 	List cartas;
	   

	    public void ordenaComparable() {
	        // Ordenamos las cartas
	    	Collections.sort(cartas);
	    	for (Object cartas:cartas) {
	    		System.out.println(cartas);
	    	}
	    }
	    
	    public void ordenaComparator(){
	    	Collections.sort(cartas, new OrdenandoConComparator());
	    	for (Object cartas:cartas) {
	    		System.out.println(cartas);
	    	}
	    }

	    /**
	     * Crea un mazo de cartas vacío
	     */
	    public Mazo() {
	        cartas = new ArrayList();
	    }

	    /**
	     * Devuelve la carta de una posició dada
	     *
	     * @param posicion La posición de la carta
	     * @return La carta de dicha posición
	     * @exception IllegalArgumentException si la posición no es válida en la
	     * lista
	     */
	    public Carta getCarta(int posicion) {
	        return (Carta)cartas.get(posicion);
	    }

	    /**
	     * A�ade una carta en el mazo en la posici�n dada. Las cartas que est�n
	     * despu�s de la posici�n dada avanzan una posici�n
	     *
	     * @param posicion Posici�n a a�adir
	     * @param carta Carta a a�adir
	     * @exception IllegalArgumentException si la posici�n no es v�lida en la
	     * lista
	     */
	    public void insertarCarta(int posicion, Carta carta) {
	        List<Carta> aux = new ArrayList<>();

	        // Extraemos las cartas desde la posici�n dada a un array auxiliar
	        for (int i = cartas.size() - 1; i >= posicion; i--) {
	            aux.add((Carta)cartas.remove(i));
	        }

	        // Insertamos la carta pasada por par�metro
	        cartas.add(carta);

	        // Volvemos a insertar las cartas extra�das
	        for (int i = aux.size() - 1; i >= 0; i--) {
	            cartas.add(aux.get(i));
	        }
	    }

	    /**
	     * Extrae la carta de la posici�n dada, las dem�s cartas se corren una
	     * posici�n
	     *
	     * @param posicion Posici�n de extracci�n
	     * @return Carta que estaba en dicha posici�n
	     * @exception IllegalArgumentException si la posici�n no es v�lida en la
	     * lista
	     */
	    public Carta extraerCarta(int posicion) {
	        return (Carta)cartas.remove(posicion);
	    }

	    /**
	     * Devuelve la carta de la cima del mazo
	     *
	     * @return La carta en la cima del mazo
	     */
	    public Carta extraerCarta() {
	        return (Carta)cartas.remove(cartas.size() - 1);
	    }

	    /**
	     * A�ade una carta al final del mazo
	     *
	     * @param carta Carta a a�adir
	     */
	    public void anadirCarta(Carta carta) {
	        cartas.add(carta);
	    }

	    /**
	     * Devuelve el n�mero de cartas del mazo
	     *
	     * @return n�mero de cartas
	     */
	    public int numCartas() {
	        return cartas.size();
	    }

	    public void barajar() {
	        Collections.shuffle(cartas);
	    }

	    @Override
	    public String toString() {
	        return "" + cartas;
	    }

		
					
}
