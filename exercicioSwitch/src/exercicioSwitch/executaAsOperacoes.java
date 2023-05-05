package exercicioSwitch;

import java.util.Scanner;

public class executaAsOperacoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		double num1 = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		double num2 = sc.nextInt();
		System.out.println(	"Qual operação deseja fazer? (1 - Média entre os números digitados, 2 - Diferença entre os números, "
				+ "3 - Produto entre os números digitados, 4 - Divisão do primeiro pelo segundo ");
		int operacao = sc.nextInt();
		sc.close();
		
		switch(operacao) {
		case 1:
			double media = (num1 + num2) / 2;
				System.out.println("A média dos números é: " + media );
			break;
		case 2:
			double result = num1 - num2;
			
			System.out.println("A diferença entre os números é: " + result);

			break;
		case 3:
			// não entendi ao certo essa
			 System.out.println("Produto 1");
			break;
		case 4: 
			double divisao = num1 / num2;
			System.out.println("A divisão dos números é: " + divisao );
			break;
		default: 
			System.out.println("Digite uma opção valida!");
		}

	}

}
