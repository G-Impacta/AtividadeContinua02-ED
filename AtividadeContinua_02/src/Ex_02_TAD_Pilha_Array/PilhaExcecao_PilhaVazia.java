package Ex_02_TAD_Pilha_Array;

@SuppressWarnings("serial")
public class PilhaExcecao_PilhaVazia extends RuntimeException {
	
	public PilhaExcecao_PilhaVazia(String mensagemErro) {
		
		super(mensagemErro);
	}
}
