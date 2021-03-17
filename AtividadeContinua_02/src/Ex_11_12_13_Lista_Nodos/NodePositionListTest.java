package Ex_11_12_13_Lista_Nodos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*Esse pacote possui a implementação do TAD Lista de Nodos.
 * 
 * Como também o desenvolvimento e aplicação dos exercicios da Atividade Continua 2:
 * 
 * Exercicio 11: O codigo da implementação encontra-se na linha 165 do arquivo NodePositionList.java.
 * 				 O teste da implementação encontra-se abaixo na linha 72.
 * 
 * Exercicio 12: O codigo da implementação encontra-se na linha 178 do arquivo NodePositionList.java. 
 * 				 O teste da implementação encontra-se abaixo na linha 122.
 * 
 * Exercicio 13: O codigo da implementação encontra-se na linha 26 do arquivo NodePositionList.java. 
 * 				 O teste da implementação encontra-se abaixo na linha 167.
 * 
 */
class NodePositionListTest {

	@Test
	void testImplementacaoNodePositionList() {
		
		NodePositionList<Integer> lista = new NodePositionList<Integer>();

		assertEquals("[]", lista.toString(), "[]");
		
		lista.addFirst(8);
		assertEquals("[8]", lista.toString(), "[8]");
		
		Position<Integer> node1 = lista.first();
		assertEquals(8, (int)node1.elemento(), "8");
		
		assertEquals("[8]", lista.toString(), "[8]");
		
		lista.addAfter(node1, 5);
		assertEquals("[8, 5]", lista.toString(), "[8, 5]");
		
		Position<Integer> node2 = lista.next(node1);
		assertEquals(5, (int)node2.elemento(), "5");

		assertEquals("[8, 5]", lista.toString(), "[8, 5]");
		
		lista.addBefore(node2, 3);
		assertEquals("[8, 3, 5]", lista.toString(), "[8, 3, 5]");
		
		Position<Integer> node3 = lista.prev(node2);
		assertEquals(3, (int)node3.elemento(), "3");

		assertEquals("[8, 3, 5]", lista.toString(), "[8, 3, 5]");
		
		lista.addFirst(9);
		assertEquals("[9, 8, 3, 5]", lista.toString(), "[9, 8, 3, 5]");
		
		node2 = lista.last();
		assertEquals(5, (int)node2.elemento(), "5");

		assertEquals("[9, 8, 3, 5]", lista.toString(), "[9, 8, 3, 5]");
		
		assertEquals(9, (int)lista.remove(lista.first()), "9");
		assertEquals("[8, 3, 5]", lista.toString(), "[8, 3, 5]");
		
		assertEquals(3, (int)lista.set(node3, 7), "3");
		assertEquals("[8, 7, 5]", lista.toString(), "[8, 7, 5]");
		
		lista.addAfter(lista.first(), 2);
		assertEquals("[8, 2, 7, 5]", lista.toString(), "[8, 2, 7, 5]");
	}
	
	@Test
	void testReverseList() { //Test da implementação do exercicio 11.
		
		//Instancia e cria uma lista de nodos.
		NodePositionList<Integer> lista = new NodePositionList<Integer>();
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(5);
		assertEquals("[5]", lista.toString(), "[5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(10);
		assertEquals("[10, 5]", lista.toString(), "[10, 5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(7);
		assertEquals("[7, 10, 5]", lista.toString(), "[7, 10, 5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(4);
		assertEquals("[4, 7, 10, 5]", lista.toString(), "[4, 7, 10, 5]");
		
		//Testa o reverseList(), a lista deve retornar na ordem contraria.
		lista.reverseList(lista);
		assertEquals("[5, 10, 7, 4]", lista.toString(), "[5, 10, 7, 4]");		
		
		//Instancia e cria uma lista1 de nodos.
		NodePositionList<Integer> lista1 = new NodePositionList<Integer>();
		
		//Adiciona um número a lista1 de nodos e testa se foi adicionado.
		lista1.addFirst(7);
		assertEquals("[7]", lista1.toString(), "[7]");
		
		//Adiciona um número a lista1 de nodos e testa se foi adicionado.
		lista1.addFirst(1);
		assertEquals("[1, 7]", lista1.toString(), "[1, 7]");
		
		//Adiciona um número a lista1 de nodos e testa se foi adicionado.
		lista1.addFirst(6);
		assertEquals("[6, 1, 7]", lista1.toString(), "[6, 1, 7]");
		
		//Adiciona um número a lista1 de nodos e testa se foi adicionado.
		lista1.addFirst(3);
		assertEquals("[3, 6, 1, 7]", lista1.toString(), "[3, 6, 1, 7]");
		
		//Testa o reverseList(), a lista1 deve retornar na ordem contraria.
		lista1.reverseList(lista1);
		assertEquals("[7, 1, 6, 3]", lista1.toString(), "[7, 1, 6, 3]");
	}
	
	@Test
	void testMakeFirstListaNodos() { //Test da implementação do exercicio 12.
		
		//Instancia e cria uma lista de nodos.
		NodePositionList<Integer> lista = new NodePositionList<Integer>();
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(5);
		assertEquals("[5]", lista.toString(), "[5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(10);
		assertEquals("[10, 5]", lista.toString(), "[10, 5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(7);
		assertEquals("[7, 10, 5]", lista.toString(), "[7, 10, 5]");
		
		//Adiciona um número a lista de nodos e testa se foi adicionado.
		lista.addFirst(4);
		assertEquals("[4, 7, 10, 5]", lista.toString(), "[4, 7, 10, 5]");
		
		//Pega o ultimo node da lista.
		Position<Integer> node = lista.last();
		assertEquals(5, (int)node.elemento(), "5");
		
		//Testa o makeFirst(), a lista deve iniciar com 5 e continuar a ordem linear.
		lista.makeFirst(node); //Coloca o ultimo node da lista na primeira posição.
		assertEquals("[5, 4, 7, 10]", lista.toString(), "[5, 4, 7, 10]");
		
		//Pega o penultimo node da lista.
		Position<Integer> node1 = lista.prev(lista.last());
		
		//Testa o makeFirst(), a lista deve iniciar com 7 e continuar a ordem linear.
		lista.makeFirst(node1); //Coloca o penultimo node da lista na primeira posição.
		assertEquals("[7, 5, 4, 10]", lista.toString(), "[7, 5, 4, 10]");		
		
		//Pega o segundo node da lista.
		Position<Integer> node2 = lista.next(node1);
		
		//Testa o makeFirst(), a lista deve iniciar com 5 e continuar a ordem linear.
		lista.makeFirst(node2); //Coloca o segundo node da lista na primeira posição.
		assertEquals("[5, 7, 4, 10]", lista.toString(), "[5, 7, 4, 10]");		
	}
	
	@Test
	void testExcecaoPositionLista() { //Test da implementação do exercicio 13.
		
		//Instancia e cria uma lista de nodos.
		NodePositionList<Integer> lista0 = new NodePositionList<Integer>();
		
		//Adiciona números a lista de nodos.
		lista0.addFirst(5);
		lista0.addFirst(8);
		lista0.addFirst(0);
		lista0.addFirst(1);		
		
		//Instancia e cria uma lista1 de nodos.
		NodePositionList<Integer> lista1 = new NodePositionList<Integer>();
		
		//Adiciona números a lista de nodos.
		lista1.addFirst(9);
		lista1.addFirst(1);
		lista1.addFirst(7);
		lista1.addFirst(3);
		
		//A variavel recebe a primeira posição da lista0
		Position<Integer> nodeLista = lista0.first();
		
		//Testa se a exceção será chamada ao passar uma posição da lista0 para ser adicionada na lista1.
		assertThrows(InvalidPositionException.class, () -> {lista1.addAfter(nodeLista, 5);});
		
		//A variavel recebe a primeira posição da lista0
		Position<Integer> nodeLista1 = lista1.last();		
		
		//Testa se a exceção será chamada ao passar uma posição da lista1 para ser adicionada na lista0.
		assertThrows(InvalidPositionException.class, () -> {lista0.addAfter(nodeLista1, 8);});
		
		
		//A variavel recebe a segunda posição da lista0
		Position<Integer> nodeLista2 = lista0.next(lista0.first());
		
		//Testa se a exceção será chamada ao passar uma posição da lista0 para ser adicionada na lista1.
		assertThrows(InvalidPositionException.class, () -> {lista1.addAfter(nodeLista2, 9);});
		
		//A variavel recebe a penultima posição da lista1
		Position<Integer> nodeLista3 = lista1.prev(lista1.last());		
		
		//Testa se a exceção será chamada ao passar uma posição da lista1 para ser adicionada na lista0.
		assertThrows(InvalidPositionException.class, () -> {lista0.addAfter(nodeLista3, 7);});		
	}
}
