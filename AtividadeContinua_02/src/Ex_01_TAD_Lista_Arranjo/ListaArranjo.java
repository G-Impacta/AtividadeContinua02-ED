package Ex_01_TAD_Lista_Arranjo;

public class ListaArranjo<TIPO> implements ListaArranjoInterface<TIPO> {
	
	private TIPO listaElementos[];
	private int capacidade = 16;
	private int size = 0;
	
	@SuppressWarnings("unchecked")
	public ListaArranjo() {
		
		listaElementos = (TIPO[]) new Object[capacidade];		
	}
	
	
	public int size() {return size;} //Retorna o tamanho da lista de elementos.	
	
	
	public boolean isEmpty() {return size() == 0;} //Retorna se a lista de elementos está vazia.
	
	
	public TIPO get(int indice) throws ListaArranjoExcecao_IndiceInvalido { //Retorna o elemento da lista segundo o indice informado.
		
		validarIndice(indice, size());		
		
		return listaElementos[indice];
	}	
	
	
	public TIPO set(int indice, TIPO elemento) throws ListaArranjoExcecao_IndiceInvalido { //Substitui o elemento da lista segundo o indice informado.
		
		validarIndice(indice, size());
		
		TIPO elementoTemporario = listaElementos[indice];
		listaElementos[indice] = elemento;
		
		return elementoTemporario;
	}

	
	public void add(int indice, TIPO elemento) throws ListaArranjoExcecao_IndiceInvalido {//Adiciona elementos a lista.
		
		validarIndice(indice, size() + 1);
		
		if(size == capacidade) {
			
			capacidade *= 2;
			
			@SuppressWarnings("unchecked")
			TIPO[] listaTemporaria = (TIPO[]) new Object[capacidade];
			
			for(int i = 0; i < size; i++) {listaTemporaria[i] = listaElementos[i];}
			
			listaElementos = listaTemporaria;
		}
		
		for(int i = size - 1; i >= indice; i--) {listaElementos[i + 1] = listaElementos[i];}
		
		listaElementos[indice] = elemento;
		size++;		
	}

	
	public TIPO remove(int indice) throws ListaArranjoExcecao_IndiceInvalido { //Remove elementos da lista.
		
		validarIndice(indice, size);
		
		TIPO elementoTemporario = listaElementos[indice];
		
		for(int i = indice; i < size - 1; i++) {listaElementos[i] = listaElementos[i + 1];}
		
		size--;
		return elementoTemporario;
	}
	
	public void validarIndice(int indice, int size) { //Verifica se os indices informados são validos.
		
		if(indice < 0 || indice >= size) {
			throw new ListaArranjoExcecao_IndiceInvalido("Indice invalido: " + indice);
		}		
	}
	
	public String toString() {
		
		String elementosLista = "(";
		
		if (size() > 0) {
			
			for(int i = 0; i < size; i++) {
				elementosLista += listaElementos[i].toString();
				
				if(i != size() - 1) {
					elementosLista += ", ";
				}
			}			
		}
		
		elementosLista += ")";
		return elementosLista;		
	}
}
