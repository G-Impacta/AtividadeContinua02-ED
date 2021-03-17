package Ex_02_TAD_Pilha_Array;

@SuppressWarnings("serial")
public class PilhaExcecao_PilhaCompleta extends RuntimeException {
	
	public PilhaExcecao_PilhaCompleta(String mensagemErro) {
		
		super(mensagemErro);
	}
}
