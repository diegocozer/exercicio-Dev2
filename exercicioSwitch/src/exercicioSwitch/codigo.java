package exercicioSwitch;

import java.util.Scanner;

public class codigo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite um código de 1 a 15 para ver qual produto é");
	int result = sc.nextInt();
	sc.close();
	
	
	switch(result) { 
	 case 1:
		System.out.print("Alimento não-perecível");
		break;
	 case 2,3,4:
		 System.out.print("Alimento perecível");
		 break;
	 case 5,6:
		 System.out.print("Vestuário");
		 break;
	 case 7:
		 System.out.print("Vestuário");
		 break;
	 case 8,9,10,11,12,13,14,15:
		 System.out.print("Limpeza e utensílios domésticos");
		 break;
	default:
		 System.out.print("Código inválido!");
		 break;
		 
	}
	
	

	}

}
