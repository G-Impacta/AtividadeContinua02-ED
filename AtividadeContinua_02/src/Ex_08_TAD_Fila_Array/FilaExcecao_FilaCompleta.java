package Ex_08_TAD_Fila_Array;

@SuppressWarnings("serial")
public class FilaExcecao_FilaCompleta extends RuntimeException {
	
	public FilaExcecao_FilaCompleta(String mensagemErro) {
		
		super(mensagemErro);
	}
}
