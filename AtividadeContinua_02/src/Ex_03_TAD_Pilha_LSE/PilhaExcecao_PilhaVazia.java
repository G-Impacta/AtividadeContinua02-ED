package Ex_03_TAD_Pilha_LSE;

@SuppressWarnings("serial")
public class PilhaExcecao_PilhaVazia extends RuntimeException {
	
	public PilhaExcecao_PilhaVazia(String mensagemErro) {
		
		super(mensagemErro);
	}
}
