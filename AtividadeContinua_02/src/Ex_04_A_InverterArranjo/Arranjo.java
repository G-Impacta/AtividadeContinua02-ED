package Ex_04_A_InverterArranjo;

import Ex_03_TAD_Pilha_LSE.Pilha;

public class Arranjo<TIPO> {	
	
	private TIPO listaArranjo[];
	private int size;
	
	//Metodo construtor
	public Arranjo(TIPO listaArranjo[]) { //Recebe uma lista de arranjos.
		
		this.listaArranjo = (TIPO[]) listaArranjo;
		size = listaArranjo.length;		
	}
	
	public int size() {return size;}
	
	//O metodo inverter foi criado para inverter a ordem de um arranjo.
	@SuppressWarnings("unchecked")
	public void inverter() {
		
		Pilha<TIPO> pilha = new Pilha<TIPO>(); //Instancia um pilha vazia, segundo o TIPO parametrizado informado.		
		TIPO listaInvertida[] = (TIPO[]) new Object[size()]; //Cria uma lista com posições vazias de acordo com o TIPO parametrizado.
		
		for(int i = 0; i < size(); i++) {pilha.push(listaArranjo[i]);} //Inseri na pilha os elementos da lista do arranjo informado.
		
		for(int j = 0; j < size(); j++) {listaInvertida[j] = pilha.pop();} //Remove do topo da pilha e inseri na lista vazia os elementos iniciais da lista arranjo.
		
		listaArranjo = listaInvertida; //Aponta a lista arranjo para a lista criada com os elementos invertidos.
	}
	
	public String toString() {
		
		String elementosArranjo = "[";
		
		for(int i = 0; i < listaArranjo.length; i++) {
			
			elementosArranjo += listaArranjo[i];
			
			if(i != listaArranjo.length - 1) {
				
				elementosArranjo += ", ";
			}			
		}
		
		elementosArranjo += "]";		
		return elementosArranjo;
	}
}
