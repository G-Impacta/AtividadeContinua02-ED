package Ex_02_TAD_Pilha_Array;

public class Pilha<TIPO> implements PilhaInterface<TIPO> {
	
	protected TIPO elementosPilha[];
	protected int capacidade;
	protected int top = -1;
	public static int CAPACIDADE = 1000;
	
	public Pilha() {
		this(CAPACIDADE);
	}
	
	@SuppressWarnings("unchecked")
	public Pilha(int capacidade) {
		
		this.capacidade = capacidade;
		elementosPilha = (TIPO[]) new Object[capacidade];
	}

	public int size() {return top + 1;}
	
	public boolean isEmpty() {return top == -1;}

	public TIPO top() throws PilhaExcecao_PilhaVazia {
		
		if(isEmpty()) {
			throw new PilhaExcecao_PilhaVazia("A pilha está vazia!");
		}
		
		return elementosPilha[top];
	}

	public TIPO pop() throws PilhaExcecao_PilhaVazia {		
		
		if(isEmpty()) {
			throw new PilhaExcecao_PilhaVazia("A pilha está vazia!");
		}

		TIPO elemento = elementosPilha[top];
		elementosPilha[top] = null;
		
		top--;
		
		return elemento;
	}
	
	public void push(TIPO elemento) throws PilhaExcecao_PilhaCompleta{
		
		if(size() == capacidade) {
			throw new PilhaExcecao_PilhaCompleta("A pilha está completa!");
		}
		
		top++;
		elementosPilha[top] = elemento;				
	}
	
	public String toString() {
		
		String pilhaElementos = "[";
		
		if(size() > 0) {
			
			for(int i = 0; i < size(); i++) {
				
				pilhaElementos += elementosPilha[i].toString();
				
				if(i != size() - 1) {
					pilhaElementos += ", ";
				}				
			}			
		}
		
		pilhaElementos += "]";
		return pilhaElementos;		
	}
}
