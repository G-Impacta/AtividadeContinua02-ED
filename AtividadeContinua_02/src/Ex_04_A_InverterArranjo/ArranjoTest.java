package Ex_04_A_InverterArranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArranjoTest {

	@Test
	void testInversaoArranjoInteiros() {
		
		//Cria um arranjo de inteiros.
		Integer arranjoInteiros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//Cria uma nova variavel e Instancia a classe arranjo criada para permitir inveter o arranjo usando pilha.
		Arranjo<Integer> novoArranjoInteiros = new Arranjo<Integer>(arranjoInteiros);
		
		//Testa o estado atual do arranjo.
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", novoArranjoInteiros.toString(), "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
		
		//Inverte o arranjo
		novoArranjoInteiros.inverter();
		
		//Testa se o arranjo foi invertido.
		assertEquals("[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]", novoArranjoInteiros.toString(), "[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]");		
	}
	
	@Test
	void testInversaoArranjoStrings() {		
		
		//Cria um arranjo de strings.
		String arranjoStrings[]= {"Bruce", "Diana", "Clark", "Barry", "Oliver", "Victor", "Jonh"};		
		
		//Cria uma nova variavel e Instancia a classe arranjo criada para permitir inveter o arranjo usando pilha.
		Arranjo<String> novoArranjoStrings = new Arranjo<String>(arranjoStrings);
		
		//Testa o estado atual do arranjo.
		assertEquals("[Bruce, Diana, Clark, Barry, Oliver, Victor, Jonh]", novoArranjoStrings.toString(), "[Bruce, Diana, Clark, Barry, Oliver, Victor, Jonh]");		
		
		//Inverte o arranjo
		novoArranjoStrings.inverter();
		
		//Testa se o arranjo foi invertido.
		assertEquals("[Jonh, Victor, Oliver, Barry, Clark, Diana, Bruce]", novoArranjoStrings.toString(), "[John, Victor, Oliver, Barry, Clark, Diana, Bruce]");	
	}
}
