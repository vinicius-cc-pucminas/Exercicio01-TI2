package teste;

import java.util.*;

public class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// Declara��o vari�veis
		int num1, num2, soma;

		// Leituras
		System.out.print("Digite um n�mero: ");
		num1 = sc.nextInt(); 
		
		System.out.print("Digite um segundo n�mero: ");
		num2 = sc.nextInt();
		
		// Somar
		soma = num1 + num2;
		
		// Mostrar na tela
		System.out.println("Soma: " + soma);
	}
}
