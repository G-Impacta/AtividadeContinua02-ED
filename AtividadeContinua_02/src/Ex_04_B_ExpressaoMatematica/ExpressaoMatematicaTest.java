package Ex_04_B_ExpressaoMatematica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressaoMatematicaTest {

	@Test
	void testExpressoesMatematicas() {
		
		//Instancia as classes ExpressaoMatematica e informa uma expressão.
		ExpressaoMatematica expressao1 = new ExpressaoMatematica("()(()){([()])}");
		ExpressaoMatematica expressao2 = new ExpressaoMatematica("((()(()){([()])}))");
		ExpressaoMatematica expressao3 = new ExpressaoMatematica(")(()){([()])}");
		ExpressaoMatematica expressao4 = new ExpressaoMatematica("({[])}");
		ExpressaoMatematica expressao5 = new ExpressaoMatematica("(");
		ExpressaoMatematica expressao6 = new ExpressaoMatematica(")");
		
		//Testa se a expressão1 é valida.
		assertTrue(expressao1.validarExpressao()); //Expressão valida.
		
		//Testa se a expressão2 é valida.
		assertTrue(expressao2.validarExpressao()); //Expressão valida.
		
		//Testa se a expressão3 é valida.
		assertFalse(expressao3.validarExpressao()); //Expressão invalida.
		
		//Testa se a expressão4 é valida.
		assertFalse(expressao4.validarExpressao()); //Expressão invalida.
		
		//Testa se a expressão5 é valida.
		assertFalse(expressao5.validarExpressao()); //Expressão invalida.
		
		//Testa se a expressão6 é valida.
		assertFalse(expressao6.validarExpressao()); //Expressão invalida.
	}
}
