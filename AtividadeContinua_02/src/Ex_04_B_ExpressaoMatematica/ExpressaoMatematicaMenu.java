package Ex_04_B_ExpressaoMatematica;

import java.util.Scanner;

public class ExpressaoMatematicaMenu {
	
	public static void main(String[] args) {
		
		Scanner entradadados = new Scanner(System.in); //Instancia a classe Scanner para receber uma entrada de dados.
		String expressao; //String que recebera a entrada de dados.
		
		System.out.println("Informe sua expressão matematica: ");
		expressao = entradadados.nextLine();
		
		ExpressaoMatematica novaExpressao = new ExpressaoMatematica(expressao); //Instancia e informa a expressão matematica.
		
		if(novaExpressao.validarExpressao()) { //Verifica se a expressão é valida ou não.
			System.out.println("Essa expressão matematica é valida."); //Mensagem de validez.
		}else {
			System.out.println("Essa expressão matematica NÃO é valida."); //Mensagem de invalidez.
		}
		
		entradadados.close(); //Fecha o Scanner.
	}
}
