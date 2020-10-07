package application;

import java.util.Scanner;

import utils.Pilha;

public class ProgramPilha {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pilha pilha;

		while(true){
			System.out.print("Entre com uma equação: "); // 2+3*(8-7)+2
			String equacao = sc.next();
			
			pilha = new Pilha(equacao.length());
			
			for(int i=0; i<equacao.length(); i++) {
				pilha.push(equacao.charAt(i));
			}
			
			int parentesDaEsquerda = 0, parentesDaDireita = 0;
			while(!pilha.isEmpty()) {
				char a = pilha.pop();
				
				if(a == '(') {
					parentesDaEsquerda++;
				}else if(a == ')') {
					parentesDaDireita++;
				}
			}

			validaParenteses(parentesDaEsquerda, parentesDaDireita);

			System.out.println("Deseja verificar outra equação? (y/n)");
			char resp = sc.next().charAt(0);
			
			if(resp != 'y'){
				break;
			}

			System.out.println();// pular linha
		}
		
		System.out.println("========== FIM ==========");
		sc.close();
	}

	static void validaParenteses(int parentesEsquerda, int parentesDireita) {
		if(parentesEsquerda == parentesDireita) {
			System.out.println("Equação bem formada");
		}else {
			System.out.println("Equação mal formada");
		}
	}
}
