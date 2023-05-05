package exercicioSwitch;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class cardapio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código do produto,  (100 - Cachorro quente - R$ 1,70, 101 - Bauru Simples - R$ 2,30,"
				+ " 102 - Bauru com ovo - R$ 2,60, 103 = Hambúrguer - R$ 2,40, 104 - Cheeseburguer R$ 2,50, 105 - Refrigerante R$ 1,00 )");
		int codigo = sc.nextInt();
		System.out.println("Insira a quantidade: ");
		double qtd = sc.nextInt();
		double total = 0;
		Locale ptBr = new Locale("pt", "BR");
		sc.close();

		
		switch(codigo) {
		case 100:
			total = qtd * 1.70 ;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total) );
			break;
		case 101:
			total = qtd * 2.30;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total));
			break;
		case 102:
			total = qtd * 2.60;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total) );
			break;
		case 103:
			total = qtd *2.40;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total));
			break;
		case 104:
			total = qtd * 2.50;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total));
			break;
		case 105:
			total = qtd *1.00;
			System.out.println("O valor total do pedido é: " + NumberFormat.getCurrencyInstance(ptBr).format(total));
			break;
		}
	}


}
