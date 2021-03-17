package Ex_08_TAD_Fila_Array;

public class Fila<TIPO> implements FilaInterface<TIPO>{		
	
	protected TIPO elementosFila[];	
	protected int first; //Armazena o primeiro elemento da fila.
	protected int next; //Armazena a proxima posi��o livre da fila.
	protected int CAPACIDADE = 5; //Capacidade do arranjo default.

	//Metodo construtor.
	@SuppressWarnings("unchecked")
	public Fila() {
		
		elementosFila = (TIPO[]) new Object[CAPACIDADE]; //Reserva os espa�os no arranjo de acordo com a CAPACIDADE default - 1.
		first = next = 0;
	}
	
	public int size() {return (CAPACIDADE - first + next) % CAPACIDADE;} //Retorna o tamanho da fila.

	public boolean isEmpty() {return first == next;} //Retorna se a lista est� vazia.

	public TIPO front() throws FilaExcecao_FilaVazia { //Retorna o primeiro elemento da fila.
		
		if(isEmpty()) throw new  FilaExcecao_FilaVazia("A fila est� vazia!"); //Verifica se a fila est� vazia.
		
		return elementosFila[first]; //Caso n�o esteja retorna o primeiro elemento da fila.
	}
	
	public void enqueue(TIPO elemento) throws FilaExcecao_FilaCompleta { //Adiciona o elemento na fila.
		
		if(size() == (CAPACIDADE - 1)) throw new  FilaExcecao_FilaCompleta("A fila est� completa!"); //Verifica se a fila est� cheia.
		
		elementosFila[next] = elemento; //Inseri o elemento na primeira posi��o da fila.
		next = (next + 1) % CAPACIDADE; //Seleciona a proxima posi��o livre da fila.		
	}

	public TIPO denqueue() throws FilaExcecao_FilaVazia { //Remove o primeiro elemento da fila.
		
		if(isEmpty()) throw new  FilaExcecao_FilaVazia("A fila est� vazia!"); //Verifica se a fila est� vazia.
		
		TIPO elementoTemporario = elementosFila[first]; //Armazena o primeiro elemento da fila em uma variavel temporaria.
		elementosFila[first] = null; //Seta como null o primeiro elemento fila.
		
		first = (first + 1) % CAPACIDADE; //Pula para o proximo elemento da fila.
		return elementoTemporario; //Retorna o elemento removido da fila.
	}	
	
	public String toString() {
		
		String filaElementos = "[";
		
		if(size() > 0) {
			
			for(int i = 0; i <= size() - 1; i++) {filaElementos += elementosFila[first + i] + ", ";}			
		}
		
		if(filaElementos.length() > 1) filaElementos = filaElementos.substring(0, filaElementos.length() - 2);
		
		filaElementos += "]";
		return filaElementos;		
	}
}
