package Ex_08_TAD_Fila_Array;

@SuppressWarnings("serial")
public class FilaExcecao_FilaVazia extends RuntimeException {
	
	public FilaExcecao_FilaVazia(String mensagemErro) {
		
		super(mensagemErro);
	}
}
