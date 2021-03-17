package Ex_09_TAD_Fila_LSE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaTest {

	@Test
	void testFilaNode() {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		assertEquals("[]", fila.toString(), "Fila vazia");
		
		fila.enqueue(1);
		assertEquals("[1]", fila.toString(), "Deve resultar [1]");
		
		fila.enqueue(2);
		assertEquals("[1, 2]", fila.toString(), "Deve resultar [1, 2]");
		
		assertEquals(1, (int)fila.denqueue(), "Deve resultar 1");
		assertEquals("[2]", fila.toString(), "Deve resultar [2]");
		
		assertEquals(2, (int)fila.denqueue(), "Deve resultar 2");
		assertEquals("[]", fila.toString(), "Deve resultar []");
		
		assertThrows(FilaExcecao_FilaVazia.class, () -> { fila.denqueue(); });		
	}
	
	@Test
	void testFilaNodeInteiros() {		
		
		//Instancia uma fila de arranjos.
		Fila<Integer> fila = new Fila<Integer>(); //Suporta 4 elementos.
		
		//Testa o estado atual da fila.
		assertEquals("[]", fila.toString(), "Deve retornar []");
		
		//Testa se o tamanho da fila � 0.
		assertEquals(0, fila.size(), "Deve retornar 0");
		
		//Testa se a fila est� vazia.
		assertTrue(fila.isEmpty(), "Deve retornar true");		
		
		//Testa se a classe de excess�o est� funcionando. 
		assertThrows(FilaExcecao_FilaVazia.class, () ->{fila.denqueue();});
		
		//Insere um n�mero na fila
		fila.enqueue(5);
		
		//Testa se os n�meros foram inseridos na fila.
		assertEquals("[5]", fila.toString(), "Deve retornar [5]");
		
		//Testa se o primeiro elemento da fila � o 5.
		assertEquals(5, (int)fila.front(), "Deve retornar 5");
		
		//Insere um n�mero na fila
		fila.enqueue(3);		
		
		//Testa se os n�meros foram inseridos na fila.
		assertEquals("[5, 3]", fila.toString(), "Deve retornar [5, 3]");		
		
		//Testa se o primeiro elemento da fila � o 5.
		assertEquals(5, (int)fila.front(), "Deve retornar 5");
		
		//Testa se removeu o primeiro elemento da fila.
		assertEquals(5, (int)fila.denqueue(), "Deve retornar 5");
		
		//Testa os n�meros que est�o na fila.
		assertEquals("[3]", fila.toString(), "Deve retornar [3]");
		
		//Insere um n�mero na fila
		fila.enqueue(7);
		
		//Testa os n�meros que est�o na fila.
		assertEquals("[3, 7]", fila.toString(), "Deve retornar [3, 7]");		
		
		//Testa se removeu o primeiro elemento da fila.
		assertEquals(3, (int)fila.denqueue(), "Deve retornar 3");
		
		//Testa os n�meros que est�o na fila.
		assertEquals("[7]", fila.toString(), "Deve retornar [7]");		
		
		//Testa se o primeiro elemento da fila � o 7.
		assertEquals(7, (int)fila.front(), "Deve retornar 7");		
		
		//Testa se removeu o primeiro elemento da fila.
		assertEquals(7, (int)fila.denqueue(), "Deve retornar 7");		
		
		//Testa se a fila est� vazia.
		assertEquals("[]", fila.toString(), "Deve retornar []");
		
		//Testa se a fila est� vazia.
		assertTrue(fila.isEmpty(), "Deve retornar true");		
		
		//Testa se a classe de excess�o est� funcionando. 
		assertThrows(FilaExcecao_FilaVazia.class, () ->{fila.denqueue();});		
		
		//Insere um n�mero na fila
		fila.enqueue(9);		
		
		//Testa os n�meros que est�o na fila.
		assertEquals("[9]", fila.toString(), "Deve retornar [9]");
		
		//Testa se o tamanho da fila � 1.
		assertEquals(1, fila.size(), "Deve retornar 1");		
		
		//Testa os n�meros que est�o na fila.
		assertEquals("[9]", fila.toString(), "Deve retornar [9]");		
		
		//Insere um n�mero na fila
		fila.enqueue(5);		
		
		//Insere um n�mero na fila
		fila.enqueue(7);
		
		//Insere um n�mero na fila
		fila.enqueue(2);		
		
		//Testa se o tamanho da fila � 4.
		assertEquals(4, fila.size(), "Deve retornar 4");		
		
		//Testa se a fila est� vazia.
		assertFalse(fila.isEmpty(), "Deve retornar false");		
		
		//Testa o estado final da fila.
		assertEquals("[9, 5, 7, 2]", fila.toString(), "Deve retornar [9, 5, 7, 2]");
	}
}
