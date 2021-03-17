package Ex_04_B_ExpressaoMatematica;

import java.util.Scanner;

public class ExpressaoMatematicaMenu {
	
	public static void main(String[] args) {
		
		Scanner entradadados = new Scanner(System.in); //Instancia a classe Scanner para receber uma entrada de dados.
		String expressao; //String que recebera a entrada de dados.
		
		System.out.println("Informe sua express�o matematica: ");
		expressao = entradadados.nextLine();
		
		ExpressaoMatematica novaExpressao = new ExpressaoMatematica(expressao); //Instancia e informa a express�o matematica.
		
		if(novaExpressao.validarExpressao()) { //Verifica se a express�o � valida ou n�o.
			System.out.println("Essa express�o matematica � valida."); //Mensagem de validez.
		}else {
			System.out.println("Essa express�o matematica N�O � valida."); //Mensagem de invalidez.
		}
		
		entradadados.close(); //Fecha o Scanner.
	}
}
