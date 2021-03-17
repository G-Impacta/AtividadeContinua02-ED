package Ex_03_TAD_Pilha_LSE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaTest {

	@Test
	void testPilhaNodeInteiro() {
		
		//Instancia uma pilha de nodes.
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		//Testa o estado atual da pilha.
		assertEquals("[]", pilha.toString(), "Deve retornar []");		
		
		//Testa se o tamanho da pilha é 0.
		assertEquals(0, pilha.size(), "Deve retornar 0");
		
		//Testa se a pilha está vazia.
		assertTrue(pilha.isEmpty(), "Deve retornar true");
		
		//Testa se a classe de excessão está funcionando. 
		assertThrows(PilhaExcecao_PilhaVazia.class, () ->{pilha.top();});
		
		//Testa se adicionou ao topo da pilha o número 5.
		pilha.push(5);
		assertEquals("[5]", pilha.toString(), "Deve retornar [5]");
		
		//Testa se adicionou ao topo da pilha o número 3.
		pilha.push(3);
		assertEquals("[3, 5]", pilha.toString(), "Deve retornar [3, 5]");
		
		//Testa se removeu do topo da lista o número 3.
		assertEquals(3, (int)pilha.pop(), "Deve retornar 3");
		
		//Testa se adicionou ao topo da pilha o número 7.
		pilha.push(7);
		assertEquals("[7, 5]", pilha.toString(), "Deve retornar [7, 5]");
		
		//Testa se removeu do topo da lista o número 7.
		assertEquals(7, (int)pilha.pop(), "Deve retornar 7");
		
		//Testa se o numero no topo da pilha é 5.
		assertEquals(5, (int)pilha.top(), "Deve retornar 5");
		
		//Testa se removeu do topo da lista o número 5.
		assertEquals(5, (int)pilha.pop(), "Deve retornar 5");
		
		//Testa se a classe de excessão está funcionando. 
		assertThrows(PilhaExcecao_PilhaVazia.class, () -> {pilha.pop();});
		
		//Testa se a pilha está vazia.
		assertTrue(pilha.isEmpty(), "Deve retornar true");
		
		//Testa se adicionou ao topo da pilha o número 9.
		pilha.push(9);
		assertEquals("[9]", pilha.toString(), "Deve retornar [9]");
		
		//Testa se adicionou ao topo da pilha o número 7.
		pilha.push(7);
		assertEquals("[7, 9]", pilha.toString(), "Deve retornar [7, 9]");		
		
		//Testa se adicionou ao topo da pilha o número 3.
		pilha.push(3);
		assertEquals("[3, 7, 9]", pilha.toString(), "Deve retornar [3, 7, 9]");
		
		//Testa se adicionou ao topo da pilha o número 5.
		pilha.push(5);
		assertEquals("[5, 3, 7, 9]", pilha.toString(), "Deve retornar [5, 3, 7, 9]");
		
		//Testa se o tamanho da pilha é 4.
		assertEquals(4, pilha.size(), "Deve retornar 4");
		
		//Testa se removeu do topo da lista o número 5.
		assertEquals(5, (int)pilha.pop(), "Deve retornar 5");
		
		//Testa se adicionou ao topo da pilha o número 8.
		pilha.push(8);
		assertEquals("[8, 3, 7, 9]", pilha.toString(), "Deve retornar [8, 3, 7, 9]");
		
		//Testa se removeu do topo da lista o número 8.
		assertEquals(8, (int)pilha.pop(), "Deve retornar 8");
		
		//Testa se removeu do topo da lista o número 3.
		assertEquals(3, (int)pilha.pop(), "Deve retornar 3");
		
		//Testa se adicionou ao topo da pilha o número 6.
		pilha.push(6);
		assertEquals("[6, 7, 9]", pilha.toString(), "Deve retornar [6, 7, 9]");	
		
		//Testa se adicionou ao topo da pilha o número 4.
		pilha.push(4);
		assertEquals("[4, 6, 7, 9]", pilha.toString(), "Deve retornar [4, 6, 7, 9]");		
	}
	
	@Test
	void testPilhaNodeString() {
		
		//Instancia uma pilha de Nodes.
		Pilha<String> pilha = new Pilha<String>();
		
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
		assertEquals("[Diana, Bruce]", pilha.toString(), "Deve retornar [Diana, Bruce]");
		
		//Testa se removeu o topo da lista "Diana".
		assertEquals("Diana", pilha.pop(), "Deve retornar Diana");
		
		//Testa se adicionou ao topo da pilha a string "Clark".
		pilha.push("Clark");
		assertEquals("[Clark, Bruce]", pilha.toString(), "Deve retornar [Clark, Bruce]");		
		
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
		assertEquals("[Clark, Barry]", pilha.toString(), "Deve retornar [Clark, Barry]");
		
		//Testa se adicionou ao topo da pilha a string "Diana".
		pilha.push("Diana");
		assertEquals("[Diana, Clark, Barry]", pilha.toString(), "Deve retornar [Diana, Clark, Barry]");
		
		//Testa se adicionou ao topo da pilha a string "Bruce".
		pilha.push("Bruce");
		assertEquals("[Bruce, Diana, Clark, Barry]", pilha.toString(), "Deve retornar [Bruce, Diana, Clark, Barry]");
				
		//Testa se o tamanho da pilha é 4.
		assertEquals(4, pilha.size(), "Deve retornar 4");		
		
		//Testa se removeu o topo da lista "Bruce".
		assertEquals("Bruce", pilha.pop(), "Deve retornar Bruce");		
		
		//Testa se adicionou ao topo da pilha a string "Dick".
		pilha.push("Dick");
		assertEquals("[Dick, Diana, Clark, Barry]", pilha.toString(), "Deve retornar [Dick, Diana, Clark, Barry]");		
		
		//Testa se removeu o topo da lista "Dick".
		assertEquals("Dick", pilha.pop(), "Deve retornar Dick");		
		
		//Testa se removeu o topo da lista "Diana".
		assertEquals("Diana", pilha.pop(), "Deve retornar Diana");
		
		//Testa se adicionou ao topo da pilha a string "Damian".
		pilha.push("Damian");
		assertEquals("[Damian, Clark, Barry]", pilha.toString(), "Deve retornar [Damian, Clark, Barry]");		
		
		//Testa se adicionou ao topo da pilha a string "Victor".
		pilha.push("Victor");
		assertEquals("[Victor, Damian, Clark, Barry]", pilha.toString(), "Deve retornar [Victor, Damian, Clark, Barry]");
		
		//Testa se a pilha não está vazia.
		assertFalse(pilha.isEmpty(), "Deve retornar false");		
		
		//Testa se o tamanho da pilha é 4.
		assertEquals(4, pilha.size(), "Deve retornar 4");		
		
		//Testa o estado atual da pilha.
		assertEquals("[Victor, Damian, Clark, Barry]", pilha.toString(), "Deve retornar [Victor, Damian, Clark, Barry]");
	}
}
