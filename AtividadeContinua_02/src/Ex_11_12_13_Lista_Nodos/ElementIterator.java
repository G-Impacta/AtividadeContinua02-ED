package Ex_11_12_13_Lista_Nodos;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementIterator<TIPO> implements Iterator<TIPO>{ 
	
	protected PositionList<TIPO> list;
	protected Position<TIPO> cursor;
	
	public ElementIterator(PositionList<TIPO> list) {
		
		this.list = list;
		cursor = (list.isEmpty()) ? null : list.first();
	}
	
	public boolean hasNext() {return(cursor != null);}
	
	public TIPO next() throws NoSuchElementException{
		
		if(cursor == null) {throw new NoSuchElementException("Não existe proximo elemento!");}
		
		TIPO toReturn = cursor.elemento();
		cursor = (cursor == list.last()) ? null : list.next(cursor);
		return toReturn;
	}
	
	public void remove() throws UnsupportedOperationException {

		throw new UnsupportedOperationException("remove");

	}
}
