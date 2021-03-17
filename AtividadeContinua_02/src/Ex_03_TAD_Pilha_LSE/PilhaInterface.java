package Ex_03_TAD_Pilha_LSE;

public interface PilhaInterface<TIPO> {
	
	public int size();
	
	public boolean isEmpty();
	
	public TIPO top() throws PilhaExcecao_PilhaVazia;
	
	public TIPO pop() throws PilhaExcecao_PilhaVazia;
	
	public void push(TIPO elemento);

}
