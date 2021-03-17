package Ex_04_B_ExpressaoMatematica;

import Ex_03_TAD_Pilha_LSE.Pilha;

public class ExpressaoMatematica {
	
	private String expressao;
	
	//Metodo construtor.
	public ExpressaoMatematica(String expressao) { //Recebe como parametro uma string.
		
		this.expressao = expressao;		
	}
	
	//Metodo validador de expressão.
	public boolean validarExpressao() {
		
		Pilha<String> pilha = new Pilha<String>(); //Instancia uma pilha do tipo string.
		char caracteres[] = expressao.toCharArray(); //Cria um arranjo de chars que recebe a string(expressao) informada.		
		
		for(int i = 0; i < caracteres.length; i++) { //Percorre o arranjo de chars.
			
			if(caracteres[i] == '(') { //Verifica se o caracter na posição [i] é um "(" (parenteses aberto).
				
				pilha.push(String.valueOf(caracteres[i])); //Caso seja adiciona na pilha.	
				
			}else if(caracteres[i] == ')') { //Verifica se o caracter na posição [i] é um ")" (parenteses fechado).
				
				if(pilha.size() == 0) { //Verifica se a pilha está vazia.
					return false; //Caso esteja retorna false (a expressão não é valida).
				}else if(pilha.size() > 0) {if(pilha.top().charAt(0) == '(') {pilha.pop();}} //Caso não esteja e o elemento no topo da pilha seja um "(" (parenteses aberto), ele é removido da pilha.

			}else if(caracteres[i] == '[') { //Verifica se o caracter na posição [i] é um "[" (colchetes aberto).
				
				pilha.push(String.valueOf(caracteres[i])); //Caso seja adiciona na pilha.	
				
			}else if(caracteres[i] == ']') { //Verifica se o caracter na posição [i] é um "]" (colchetes fechado).
				
				if(pilha.size() == 0) { //Verifica se a pilha está vazia.
					return false; //Caso esteja retorna false (a expressão não é valida).
				}else if(pilha.size() > 0) {if(pilha.top().charAt(0) == '[') {pilha.pop();}} //Caso não esteja e o elemento no topo da pilha seja um "[" (colchetes aberto), ele é removido da pilha.
				
			}else if(caracteres[i] == '{') { //Verifica se o caracter na posição [i] é uma "{" (chave aberta).
				
				pilha.push(String.valueOf(caracteres[i])); //Caso seja adiciona na pilha.
				
			}else if(caracteres[i] == '}') { //Verifica se o caracter na posição [i] é uma "}" (chave fechada).
				
				if(pilha.size() == 0) { //Verifica se a pilha está vazia.
					return false; //Caso esteja retorna false (a expressão não é valida).
				}else if(pilha.size() > 0) {if(pilha.top().charAt(0) == '{') {pilha.pop();}} //Caso não esteja e o elemento no topo da pilha seja um "{" (chave aberta), ele é removido da pilha.
				
			}
		}
		
		//No final do laço testa se a pilha está vazia, caso esteja a expressão é valida.
		return pilha.size() == 0;
	}
}
