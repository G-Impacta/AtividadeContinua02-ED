package Ex_09_TAD_Fila_LSE;

@SuppressWarnings("serial")
public class FilaExcecao_FilaVazia extends RuntimeException {
	
	public FilaExcecao_FilaVazia(String mensagemErro) {
		
		super(mensagemErro);
	}
}
