package Ex_01_TAD_Lista_Arranjo;

@SuppressWarnings("serial")
public class ListaArranjoExcecao_IndiceInvalido extends RuntimeException {
	
	public ListaArranjoExcecao_IndiceInvalido(String mensagemErro) {
		
		super(mensagemErro);		
	}
}
