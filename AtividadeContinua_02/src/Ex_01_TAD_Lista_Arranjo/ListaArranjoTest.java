package Ex_01_TAD_Lista_Arranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaArranjoTest {

	@Test
	void testListaArranjo() {
		
		//Instancia uma lista de arranjos.
		ListaArranjo<Integer> lista = new ListaArranjo<Integer>();
		
		//Testa se a lista est� vazia.
		assertTrue(lista.isEmpty(), "Deve retornar true");
		
		//Testa o estado inicial da lista.
		assertEquals("()", lista.toString(), "Deve retornar ()");
		
		//testa se o tamanho da lista � 0.
		assertEquals(0, lista.size(), "Deve retornar 0");
		
		//Testa se o valor adicionado na posi��o 0 da lista � 7.
		lista.add(0, 7); 
		assertEquals("(7)", lista.toString(), "Deve retornar (7)");
		
		//Testa se o valor adicionado na posi��o 0 da lista � 4.
		lista.add(0, 4); 
		assertEquals("(4, 7)", lista.toString(), "Deve retornar (4, 7)");
		
		//Testa se o elemento do indice 1 da lista � 7.
		assertEquals(7, (int)lista.get(1), "Deve retornar 7");
		
		//Testa se o valor adicionado na posi��o 2 da lista � 2.
		lista.add(2, 2); 
		assertEquals("(4, 7, 2)", lista.toString(), "Deve retornar (4, 7, 2)");
		
		//Testa se o erro de exce��o est� funcionando.
		assertThrows(ListaArranjoExcecao_IndiceInvalido.class, () ->{lista.get(3);});
		
		lista.remove(1);
		assertEquals("(4, 2)", lista.toString(), "Deve retornar (4, 2)");
		
		//Testa se o valor adicionado na posi��o 1 da lista � 5.
		lista.add(1, 5); 
		assertEquals("(4, 5, 2)", lista.toString(), "Deve retornar (4, 5, 2)");
		
		//Testa se o valor adicionado na posi��o 1 da lista � 3.
		lista.add(1, 3); 
		assertEquals("(4, 3, 5, 2)", lista.toString(), "Deve retornar (4, 3, 5, 2)");		
		
		//Testa se o valor adicionado na posi��o 4 da lista � 9.
		lista.add(4, 9); 
		assertEquals("(4, 3, 5, 2, 9)", lista.toString(), "Deve retornar (4, 3, 5, 2, 9)");
		
		//Testa se o elemento do indice 2 da lista � 5.
		assertEquals(5, (int)lista.get(2), "Deve retornar 5");		
		
		//Testa se o elemento do indice 3 foi substituido e retornou o 2.
		assertEquals(2, (int)lista.set(3, 8), "Deve retornar 2");
		
		//Testa o ultimo estado da lista.
		assertEquals("(4, 3, 5, 8, 9)", lista.toString(), "Deve retornar (4, 3, 5, 8, 9)");
		
		//Testa se a lista n�o est� vazia.
		assertFalse(lista.isEmpty(), "Deve retornar false");		
		
		//testa se o tamanho da lista � 5.
		assertEquals(5, lista.size(), "Deve retornar 5");
	}

}
