package exercicioIf;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Scanner;

public class exercicioIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. Escreva um programa para ler 2 valores 
//(considere que não serão informados valores iguais) e escreva o maior deles.

//	System.out.println("Digite o primeiro número para comparar");
//	int num1 = (int) sc.nextInt();
//	System.out.println("Digite o segundo número para comparar");
//	int num2 = (int) sc.nextInt();
//	
//	if(num1 == num2) {
//		System.out.println("Você digitou dois números iguais!");
//	}else if(num1 > num2) {
//		System.out.println("O número: " + num1 + " é maior que o número: " + num2 );
//	}else {
//		System.out.println("O número: " + num2 + " é maior que o número: " + num1 );
//	}
		
//		2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
//		mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o
//		mês em que ela nasceu).
		
		
//	System.out.println("Digite seu ano de nascimento, apenas dígitos!");
//	int anoNasci = (int) sc.nextInt();
//	Calendar cal = Calendar.getInstance();
//	int anoAtual = cal.get(Calendar.YEAR);
//	int idade = anoAtual - anoNasci;
//	
//	if(idade > 16) {
//		System.out.println("Parabéns você pode votar!");
//	}else {
//		System.out.println("Infelizmente você não pode votar!");
//	}
		
//		3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A
//		senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
//		ACESSO PERMITIDO caso a senha seja válida.
//		ACESSO NEGADO caso a senha seja inválida.
//	
	
//		System.out.println("Informe sua senha!");
//		int senhaInf = sc.nextInt();
//		int senha = 1234;
//		
//		if(senhaInf == senha) {
//			System.out.println("ACESSO PERMITIDO!");
//		}else {
//			System.out.println("ACESSO NEGADO!");
//		}
//	
		
//		4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25
//		se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs
//		compradas, calcule e escreva o valor total da compra.
		
//		System.out.println("Quantas maças gostaria de comprar?");
//		int qtdMaca = sc.nextInt();
//		int duzia = 12;
//		double valTot = 0;
//		
//		
//		if(qtdMaca < duzia) {
//			valTot = qtdMaca * 0.30;
//		System.out.println("O valor total da compra é: " + NumberFormat.getCurrencyInstance().format(valTot));
//		}else {
//			valTot = qtdMaca * 0.25;
//			System.out.println("O valor total da compra é: " + NumberFormat.getCurrencyInstance().format(valTot));
//		}

//		5. Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores
//				iguais) e escrevê-los em ordem crescente.

//		System.out.println("Digite o primeiro número!");
//		int num1 = sc.nextInt();
//		System.out.println("Digite o segundo número!");
//		int num2 = sc.nextInt();
//		System.out.println("Digite o terceiro número!");
//		int num3 = sc.nextInt();
//		int temp = 0;
//		
//		if(num1 == num2 || num2 == num3 || num1 == num3) {
//			System.out.println("Você digitou números iguais!");
//		}else {
//			
//	
//		
//		if(num1 > num2) {
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//			
//		} if(num1 > num3) {
//			temp = num1;
//			num1 = num3;
//			num3 = temp;
//			
//		}if(num2 > num3) {
//			temp = num2;
//			num2 = num3;
//			num3 = temp;
//		}	
//		 System.out.println("Valores em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
//		}
		
		
//		6. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
//				2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
//				utilizando as seguintes
//				Fórmulas:
//				- para homens: (72.7 * Altura) – 58
//				- para mulheres: (62.1 * Altura) – 44.7
//				7. Escreva um programa para ler o número de lados de um pol
		
//		System.out.println("Digite sua altura!");
//		double altura = sc.nextDouble();
//		System.out.println("Digite o seu sexo!( 1 - Feminino, 2 - Masculino)");
//		int sexo = sc.nextInt();
//		double pesoIdeal = 0;
//		DecimalFormat df = new DecimalFormat("0.##");
//		if(sexo == 1) {
//			pesoIdeal = 72.7 * altura;
//		System.out.println("Seu peso ideal é: " + df.format(pesoIdeal) + " kg");
//			
//		}else {
//			pesoIdeal = 62.1 * altura;
//			System.out.println("Seu peso ideal é: " + df.format(pesoIdeal)+ " kg");
//			
//		}
		
//		7. Escreva um programa para ler o número de lados de um polígono regular e a medida do
//			lado (em cm). Calcular e imprimir o seguinte:
//			− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
//			− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
//			− Se o número de lados for igual a 5 escrever PENTÁGONO.
		
//		System.out.println("Digite o número de lados do polígono:");
//        int numLados = sc.nextInt();
//
//        System.out.println("Digite a medida do lado (em cm):");
//        double medidaLado = sc.nextDouble();
//
//        if (numLados == 3) {
//            double area = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
//            System.out.println("TRIÂNGULO");
//            System.out.println("Área: " + area + " cm²");
//        } else if (numLados == 4) {
//            double area = medidaLado * medidaLado;
//            System.out.println("QUADRADO");
//            System.out.println("Área: " + area + " cm²");
//        } else if (numLados == 5) {
//            System.out.println("PENTÁGONO");
//        } else {
//            System.out.println("Polígono não reconhecido!");
//        }
		
		
//		8. Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
//		− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
//		− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
//		IDENTIFICADO.
//		System.out.println("Digite o número de lados do polígono:");
//        int numLados = sc.nextInt();
//
//        System.out.println("Digite a medida do lado (em cm):");
//        double medidaLado = sc.nextDouble();
//        
//        if(numLados < 3) {
//        	System.out.println("NÃO É UM POLÍGONO");
//        }else if(numLados < 5) {
//        	System.out.println("POLÍGONO NÃO IDENTIFICADO");
//        }
//        else if (numLados == 3) {
//            double area = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
//            System.out.println("TRIÂNGULO");
//            System.out.println("Área: " + area + " cm²");
//        } else if (numLados == 4) {
//            double area = medidaLado * medidaLado;
//            System.out.println("QUADRADO");
//            System.out.println("Área: " + area + " cm²");
//        } else if (numLados == 5) {
//            System.out.println("PENTÁGONO");
//        } else {
//            System.out.println("Polígono não reconhecido!");
//        }
		
//		9. Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que
//		o usuário não informará valores iguais.
		  
//		  System.out.println("Digite o primeiro número: ");
//	      int num1 = sc.nextInt();
//	
//	      System.out.println("Digite o segundo número: ");
//	      int num2 = sc.nextInt();
//	      
//	      System.out.println("Digite o terceiro número: ");
//	      int num3 = sc.nextInt();
//		
//		 if(num1 > num3 && num1 > num2) {
//			 System.out.println("O número: " + num1 + " é o maior número informado!");
//		 } else if(num2 > num1 && num2 > num3) {
//			 System.out.println("O número: " + num2 + " é o maior número informado!");
//		 }else {
//			 System.out.println("O número: " + num3 + " é o maior número informado!");
//		 }
//		 
		
//		10. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é
//		Equilátero, Isósceles ou Escaleno. Sendo que:
//		− Triângulo Equilátero: possui os 3 lados iguais.
//		− Triângulo Isóscele: possui 2 lados iguais.
//		− Triângulo Escaleno: possui 3 lados diferentes
		 
//		  System.out.println("Digite as medidas dos lados de um triângulo: ");
//	      int lado1 = sc.nextInt();
//	      int lado2 = sc.nextInt();
//	      int lado3 = sc.nextInt();
//	      
//	      if(lado1 == lado2 && lado2 == lado3) {
//	    	  System.out.println("Triângulo Equilátero");
//	      }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
//	    	  System.out.println("Triângulo Isóscele");
//	      }else {
//	    	  System.out.println("Triângulo Escaleno");
//	      }
		
//		11. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o
//		triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
//		− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
//		− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
//		− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º
		
//		  System.out.println("Digite o valor de 3 ângulos de um triângulo: ");
//	      int angulo1 = sc.nextInt();
//	      int angulo2 = sc.nextInt();
//	      int angulo3 = sc.nextInt();
//	      int angulo = 90;
//	      
//	      if(angulo1 == angulo || angulo2 == angulo || angulo3 == angulo) {
//	    	  System.out.println("Triângulo Retângulo");
//	      }else if(angulo1 > angulo || angulo2 > angulo || angulo3 > angulo) {
//	    	  System.out.println("Triângulo Obtusângulo");
//	      }else {
//	    	  System.out.println("Triângulo Acutângulo");
//	      }
	}
}
