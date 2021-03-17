package Ex_01_TAD_Lista_Arranjo;

public interface ListaArranjoInterface<TIPO> {
	
	public int size();
	
	public boolean isEmpty();
	
	public TIPO get(int indice) throws ListaArranjoExcecao_IndiceInvalido;
	
	public TIPO set(int indice, TIPO elemento) throws ListaArranjoExcecao_IndiceInvalido;
	
	public void add(int indice, TIPO elemento) throws ListaArranjoExcecao_IndiceInvalido;
	
	public TIPO remove(int indice) throws ListaArranjoExcecao_IndiceInvalido;

}
