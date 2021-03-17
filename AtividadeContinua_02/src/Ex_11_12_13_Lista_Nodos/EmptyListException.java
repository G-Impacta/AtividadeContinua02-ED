package Ex_11_12_13_Lista_Nodos;

@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException{
	
	public EmptyListException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
