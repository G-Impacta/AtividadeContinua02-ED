package Ex_02_TAD_Pilha_Array;

public interface PilhaInterface<TIPO> {
	
	public int size();
	
	public boolean isEmpty();
	
	public TIPO top() throws PilhaExcecao_PilhaVazia;
	
	public TIPO pop() throws PilhaExcecao_PilhaVazia;
	
	public void push(TIPO elemento) throws PilhaExcecao_PilhaCompleta;

}
