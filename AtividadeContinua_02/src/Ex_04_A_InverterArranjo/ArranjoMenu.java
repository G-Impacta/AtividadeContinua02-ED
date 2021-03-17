package Ex_04_A_InverterArranjo;

import java.util.Random;

public class ArranjoMenu {
	
	public static void main(String[] args) {
		
		Integer listaArranjo[] = new Integer[10]; //Cria uma lista com 10 posições
		Random numeroAleatorio = new Random(); //Instancia a classe Random para gerar numeros aleatorios.
		
		for(int i = 0; i < listaArranjo.length; i++) {listaArranjo[i] = numeroAleatorio.nextInt(100);} //Preenche a lista com valores aleatorios.
		
		Arranjo<Integer> listaArranjoInvertida = new Arranjo<Integer>(listaArranjo); //Cria uma nova variavel e instancia a classe Arranjo para poder inverter a lista arranjo.		
		
		System.out.println("Lista Arranjo: " + listaArranjoInvertida.toString()); //Imprimi na tela a ordem inicial da lista.
		
		listaArranjoInvertida.inverter(); //Inverte a lista de arranjos.
		
		System.out.println("Lista Arranjo Invertido: " + listaArranjoInvertida.toString()); //Imprimi na tela a lista de arranjos invertida.
	}
}
