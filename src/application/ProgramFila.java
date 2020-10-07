package application;

import java.util.Scanner;

import utils.Fila;
import utils.No;

public class ProgramFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fila fila = new Fila();

		while(true){
			System.out.print("Entre com o código do arquivo: ");
			fila.enqueue(new No(sc.nextInt()));
			
			System.out.println("Adicionar mais códigos? (y/n)");
			char resp = sc.next().charAt(0);
			
			if(resp == 'n'){
				break;
			}
		}

		System.out.println();// pular linha
		validaCodigo(fila);
		
		sc.close();
	}

	static void validaCodigo(Fila fila) {
		while (!fila.isEmpty()) {
			No no = fila.dequeue();

			if (no.getDado() < 1000) {
				System.out.println("Imprimindo o arquivo: " + no.getDado());
			} else {
				System.out.println("O seguinte arquivo está corrompido: " + no.getDado());
			}
		}
	}
}
