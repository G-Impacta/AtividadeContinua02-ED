package Ex_04_B_ExpressaoMatematica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressaoMatematicaTest {

	@Test
	void testExpressoesMatematicas() {
		
		//Instancia as classes ExpressaoMatematica e informa uma express�o.
		ExpressaoMatematica expressao1 = new ExpressaoMatematica("()(()){([()])}");
		ExpressaoMatematica expressao2 = new ExpressaoMatematica("((()(()){([()])}))");
		ExpressaoMatematica expressao3 = new ExpressaoMatematica(")(()){([()])}");
		ExpressaoMatematica expressao4 = new ExpressaoMatematica("({[])}");
		ExpressaoMatematica expressao5 = new ExpressaoMatematica("(");
		ExpressaoMatematica expressao6 = new ExpressaoMatematica(")");
		
		//Testa se a express�o1 � valida.
		assertTrue(expressao1.validarExpressao()); //Express�o valida.
		
		//Testa se a express�o2 � valida.
		assertTrue(expressao2.validarExpressao()); //Express�o valida.
		
		//Testa se a express�o3 � valida.
		assertFalse(expressao3.validarExpressao()); //Express�o invalida.
		
		//Testa se a express�o4 � valida.
		assertFalse(expressao4.validarExpressao()); //Express�o invalida.
		
		//Testa se a express�o5 � valida.
		assertFalse(expressao5.validarExpressao()); //Express�o invalida.
		
		//Testa se a express�o6 � valida.
		assertFalse(expressao6.validarExpressao()); //Express�o invalida.
	}
}
