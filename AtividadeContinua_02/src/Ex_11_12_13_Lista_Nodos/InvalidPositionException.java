package Ex_11_12_13_Lista_Nodos;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException{
	
	public InvalidPositionException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
