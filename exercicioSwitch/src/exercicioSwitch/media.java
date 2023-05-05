package exercicioSwitch;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		double nota1 = sc.nextInt();
		System.out.println("Insira a segunda nota: ");
		double nota2 = sc.nextInt();
		sc.close();
		
		double mediaNota = (nota1 + nota2) / 2;
		
		if(mediaNota <= 4.0) {
			result = 1;
		}else if(mediaNota <= 7.0) {
			result = 2;
		}else {
			result = 3;
		}
		
		switch(result) {
		case 1: 
			System.out.println("Sua nota foi: " + mediaNota + " - Reprovado!" );
			break;
		case 2: 
			System.out.println("Sua nota foi: " + mediaNota + " - Exame!");
			break;
		case 3: 
			System.out.println("Sua nota foi: " + mediaNota + " - Aprovado!");
			break;	
		}
	}

}
