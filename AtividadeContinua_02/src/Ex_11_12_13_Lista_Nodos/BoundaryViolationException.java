package Ex_11_12_13_Lista_Nodos;

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException{
	
	public BoundaryViolationException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
