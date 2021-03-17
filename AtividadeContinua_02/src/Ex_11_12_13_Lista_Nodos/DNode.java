package Ex_11_12_13_Lista_Nodos;

public class DNode<TIPO> implements Position<TIPO> {
	
	private DNode<TIPO> prev, next;
	private TIPO elemento;
	
	public DNode(DNode<TIPO> prev, DNode<TIPO> next, TIPO elemento) {
		
		this.prev = prev;
		this.next = next;
		this.elemento = elemento;
	}
	
	public TIPO elemento() throws InvalidPositionException{
		
		if((prev == null) && (next == null)) {throw new InvalidPositionException("Essa posição não está na lista!");}
		return elemento;		
	}
	
	public DNode<TIPO> getNext() {return next;}
	
	public DNode<TIPO> getPrev() {return prev;}
	
	public void setNext(DNode<TIPO> novoNext) {next = novoNext;}
	
	public void setPrev(DNode<TIPO> novoPrev) {prev = novoPrev;}
	
	public void setElement(TIPO novoElemento) {elemento = novoElemento;}

}
