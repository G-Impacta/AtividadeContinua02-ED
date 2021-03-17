package Ex_11_12_13_Lista_Nodos;

import java.util.Iterator;

public interface PositionList<TIPO> extends Iterable<TIPO> {
	
	public int size();

	public boolean isEmpty();
	
	public Position<TIPO> first();

	public Position<TIPO> last();

	public Position<TIPO> next(Position<TIPO> position) throws InvalidPositionException, BoundaryViolationException;

	public Position<TIPO> prev(Position<TIPO> position) throws InvalidPositionException, BoundaryViolationException;

	public void addFirst(TIPO elemento);

	public void addLast(TIPO elemento);

	public void addAfter(Position<TIPO> position, TIPO elemento) throws InvalidPositionException;

	public void addBefore(Position<TIPO> position, TIPO elemento) throws InvalidPositionException;

	public TIPO remove(Position<TIPO> position) throws InvalidPositionException;

	public TIPO set(Position<TIPO> position, TIPO elemento) throws InvalidPositionException;

	public Iterator<TIPO> iterator();	

}
