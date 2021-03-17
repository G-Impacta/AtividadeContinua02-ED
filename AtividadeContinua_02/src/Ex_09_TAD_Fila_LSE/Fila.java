package Ex_09_TAD_Fila_LSE;

import Ex_03_TAD_Pilha_LSE.Node;

public class Fila<TIPO> implements FilaInterface<TIPO>{
	
	protected Node<TIPO> head;
	protected Node<TIPO> tail;
	protected int size;
	
	public Fila() {
		
		head = null;
		tail = null;
		size = 0;		
	}

	public int size() {return size;}

	public boolean isEmpty() {return size == 0;}

	public TIPO front() throws FilaExcecao_FilaVazia {
		
		if(isEmpty()) {throw new FilaExcecao_FilaVazia("A fila está vazia!");}
		
		return head.getElement();		
	}

	public void enqueue(TIPO elemento) {
		
		Node<TIPO> node = new Node<TIPO>();
		
		node.setElement(elemento);
		node.setNext(null);
		
		if(size == 0) {	head = node;} else {tail.setNext(node);}
		
		tail = node;
		size++;		
	}

	public TIPO denqueue() throws FilaExcecao_FilaVazia {
		
		if(size == 0) {throw new FilaExcecao_FilaVazia("A fila está vazia!");}
		
		TIPO elementoTemporario = head.getElement();
		head = head.getNext();
		size--;
		
		if(size == 0) {tail = null;}		
		
		return elementoTemporario;
	}	
	
	public String toString() {
		
		Node<TIPO> primeiroNode = head;
		
		String filaElementos = "[";
		
		while(primeiroNode != null) {
			
			filaElementos += primeiroNode.getElement();
			primeiroNode = primeiroNode.getNext();
			
			if(primeiroNode != null) {
				filaElementos += ", ";
			}
		}
		
		filaElementos += "]";
		return filaElementos;		
	}
}
