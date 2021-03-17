package Ex_02_TAD_Pilha_Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaTest {

	@Test
	void testPilhaArray() {
		
		//Instancia uma pilha de arranjos.
		Pilha<String> pilha = new Pilha<String>(4);
		
		//Testa o estado atual da pilha.
		assertEquals("[]", pilha.toString(), "Deve retornar []");
		
		//Testa se o tamanho da pilha é 0.
		assertEquals(0, pilha.size(), "Deve retornar 0");
		
		//Testa se a pilha está vazia.
		assertTrue(pilha.isEmpty(), "Deve retornar true");
		
		//Testa se a classe de excessão está funcionando. 
		assertThrows(PilhaExcecao_PilhaVazia.class, () ->{pilha.top();});
		
		//Testa se adicionou ao topo da pilha a string "Bruce".
		pilha.push("Bruce");
		assertEquals("[Bruce]", pilha.toString(), "Deve retornar [Bruce]");
		
		//Testa se adicionou ao topo da pilha a string "Diana".
		pilha.push("Diana");
		assertEquals("[Bruce, Diana]", pilha.toString(), "Deve retornar [Bruce, Diana]");
		
		//Testa se removeu o topo da lista "Diana".
		assertEquals("Diana", pilha.pop(), "Deve retornar Diana");
		
		//Testa se adicionou ao topo da pilha a string "Clark".
		pilha.push("Clark");
		assertEquals("[Bruce, Clark]", pilha.toString(), "Deve retornar [Bruce, Clark]");		
		
		//Testa se removeu o topo da lista "Clark".
		assertEquals("Clark", pilha.pop(), "Deve retornar Clark");
		
		//Testa se o elemento no topo da pilha é "Bruce"
		assertEquals("Bruce", pilha.top(), "Deve retornar Bruce");		
		
		//Testa se removeu o topo da lista "Bruce".
		assertEquals("Bruce", pilha.pop(), "Deve retornar Bruce");		

		//Testa se a classe de excessão está funcionando. 
		assertThrows(PilhaExcecao_PilhaVazia.class, () ->{pilha.pop();});
		
		//Testa se a pilha está vazia.
		assertTrue(pilha.isEmpty(), "Deve retornar true");		
		
		//Testa se adicionou ao topo da pilha a string "Barry".
		pilha.push("Barry");
		assertEquals("[Barry]", pilha.toString(), "Deve retornar [Barry]");		
		
		//Testa se adicionou ao topo da pilha a string "Clark".
		pilha.push("Clark");
		assertEquals("[Barry, Clark]", pilha.toString(), "Deve retornar [Barry, Clark]");
		
		//Testa se adicionou ao topo da pilha a string "Diana".
		pilha.push("Diana");
		assertEquals("[Barry, Clark, Diana]", pilha.toString(), "Deve retornar [Barry, Clark, Diana]");
		
		//Testa se adicionou ao topo da pilha a string "Bruce".
		pilha.push("Bruce");
		assertEquals("[Barry, Clark, Diana, Bruce]", pilha.toString(), "Deve retornar [Barry, Clark, Diana, Bruce]");
				
		//Testa se o tamanho da pilha é 4.
		assertEquals(4, pilha.size(), "Deve retornar 4");		
		
		//Testa se removeu o topo da lista "Bruce".
		assertEquals("Bruce", pilha.pop(), "Deve retornar Bruce");		
		
		//Testa se adicionou ao topo da pilha a string "Dick".
		pilha.push("Dick");
		assertEquals("[Barry, Clark, Diana, Dick]", pilha.toString(), "Deve retornar [Barry, Clark, Diana, Dick]");		
		
		//Testa se removeu o topo da lista "Dick".
		assertEquals("Dick", pilha.pop(), "Deve retornar Dick");		
		
		//Testa se removeu o topo da lista "Diana".
		assertEquals("Diana", pilha.pop(), "Deve retornar Diana");
		
		//Testa se adicionou ao topo da pilha a string "Damian".
		pilha.push("Damian");
		assertEquals("[Barry, Clark, Damian]", pilha.toString(), "Deve retornar [Barry, Clark, Damian]");		
		
		//Testa se adicionou ao topo da pilha a string "Victor".
		pilha.push("Victor");
		assertEquals("[Barry, Clark, Damian, Victor]", pilha.toString(), "Deve retornar [Barry, Clark, Damian, Victor]");
		
		//Testa se a classe de excessão está funcionando.
		assertThrows(PilhaExcecao_PilhaCompleta.class, () ->{pilha.push("John");});		
		
		//Testa se a pilha não está vazia.
		assertFalse(pilha.isEmpty(), "Deve retornar false");		
		
		//Testa se o tamanho da pilha é 4.
		assertEquals(4, pilha.size(), "Deve retornar 4");		
		
		//Testa o estado atual da pilha.
		assertEquals("[Barry, Clark, Damian, Victor]", pilha.toString(), "Deve retornar [Barry, Clark, Damian, Victor]");
	}
}
