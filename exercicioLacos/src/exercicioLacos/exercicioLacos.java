package exercicioLacos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicioLacos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. Dado um número inteiro informado pelo usuário, imprima todos os números pares
//		entre 0 e esse número
		
//		System.out.println("Digite um número inteiro: ");
//		int num1 = sc.nextInt();	
//		 
//		System.out.println("Números pares entre 0 e " + num1 + ":");
//		for(int i = 0 ; i <= num1 ; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
			
//			Escreva um programa que lê uma sequência de números informados pelo usuário e
//			mostra a média aritmética desses números.

//			System.out.println("Quantos número deseja informar? ");
//			int qtd = sc.nextInt();	
//			int soma = 0;
//			int num = 0;
//			int media = 0;
//			
//			
//			for (int i = 1; i <= qtd ; i++) {
//				System.out.println("Informe o número " + i +"º :");
//				num = sc.nextInt();	
//				soma += num;			
//		}
//			media = soma / qtd;
//	        System.out.println("A média aritmética de: "+ soma +" é: " + media);
//		
//		
//		3. Dado um array de inteiros, imprima a soma de todos os elementos.

//		System.out.println("Quantos número deseja informar? ");
//		int qtd = sc.nextInt();	
//		
//		int[] arrayNum = new int[qtd];
//		int soma = 0;
//		
//		for(int i = 0; i < arrayNum.length; i++) {
//			System.out.print("Digite os números:  " + (i + 1) + "º: ");
//			arrayNum[i] = sc.nextInt();
//            soma += arrayNum[i];
//		}
//		System.out.println("A soma dos números é: " + soma);
//		
//		4. Dado um número inteiro informado pelo usuário, imprima todos os números ímpares
//		entre 1 e esse número.
//		
		
//		System.out.println("Digite um número inteiro: ");
//		int num1 = sc.nextInt();	
//		 
//		System.out.println("Números impares entre 0 e " + num1 + ":");
//		for(int i = 0 ; i <= num1 ; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
	
//		5. Escreva um programa que lê uma sequência de palavras informadas pelo usuário e
//		mostra a palavra de maior comprimento.

//		System.out.println("Digite uma sêquencia de palavras separas por espaço! ");
//		String[] palavras = sc.nextLine().split(" ");
//		String maiorPalavra = "";
//		
//		for(int i = 0; i < palavras.length; i++) {
//			if(palavras[i].length() > maiorPalavra.length()) {
//				maiorPalavra = palavras[i];
//			}
//		}
//		System.out.println("A palavra de maior comprimento é: " + maiorPalavra);
//		
//		Agora um pouco mais avançado:
//			1. Dado um array de inteiros, encontre o maior número e imprima a posição onde ele
//			se encontra no array
		
//		System.out.println("Quantos número deseja informar?");
//		int qtd = sc.nextInt();	
//		
//		int[] arrayNum = new int[qtd];
//		int numeroMaior = 0;
//		int posicao = 0;
//		
//		for(int i = 0; i < arrayNum.length; i++) {
//			System.out.print("Digite os números:  " + (i + 1) + "º: ");
//			arrayNum[i] = sc.nextInt();
//            if(arrayNum[i] > numeroMaior) {
//            	numeroMaior = arrayNum[i];
//            	posicao = i;
//
//            }
//            
//		}
//		System.out.println("O maior número é " + numeroMaior + " e está na posição " + posicao);
	
	
//		2. Escreva um programa que lê uma sequência de números informados pelo usuário e
//		mostra quantos números estão acima da média e quantos estão abaixo da média.
//		
//		int qtd = sc.nextInt();
//        
//        int[] num = new int[qtd];
//        int soma = 0;
//        
//        for(int i = 0; i < num.length; i++) {
//            System.out.print("Digite o " + (i + 1) + "º número: ");
//            num[i] = sc.nextInt();
//            soma += num[i];
//        }
//        
//        double media = soma / (double)qtd;
//        int acima = 0;
//        int abaixo = 0;
//        
//        for(int i = 0; i < num.length; i++) {
//            if(num[i] > media) {
//                acima++;
//            } else if(num[i] < media) {
//                abaixo++;
//            }
//        }
//        
//        System.out.println("A média é " + media);
//        System.out.println(acima + " números estão acima da média");
//        System.out.println(abaixo + " números estão abaixo da média");
	
//		3. Dado um número inteiro n informado pelo usuário, calcule o n-ésimo número de
//		Fibonacci usando um laço de repetição
	
	
	        
//	        System.out.print("Informe o valor de n: ");
//	        int n = sc.nextInt();
//	        
//	        int fib = 0;
//	        int fibAnterior = 1;
//	        
//	        for(int i = 1; i <= n; i++) {
//	            int fibAtual = fib + fibAnterior;
//	            fibAnterior = fib;
//	            fib = fibAtual;
//	        }
//	        
//	        System.out.println("O " + n + "º número de Fibonacci é " + fib);
//		
//	
		
//		4. Escreva um programa que leia uma sequência de palavras informadas pelo usuário
//		e conte quantas vezes cada palavra aparece na sequência. Depois, imprima a lista
//		de palavras e suas respectivas contagens.
		 
//		System.out.print("Digite uma sequência de palavras separadas por espaço: ");
//        String sequencia = sc.nextLine();
//        
//        String[] palavras = sequencia.split(" ");
//        Arrays.sort(palavras);
//        
//        int[] contagem = new int[palavras.length];
//        int index = 0;
//        
//        for(int i = 0; i < palavras.length; i++) {
//            if(i == 0 || !palavras[i].equals(palavras[i - 1])) {
//                index++;
//            }
//            contagem[index - 1]++;
//        }
//        
//        System.out.println("Contagem das palavras:");
//        
//        for(int i = 0; i < index; i++) {
//            System.out.println(palavras[i] + ": " + contagem[i]);
//        }
//		
		
//		5. Dado um array de inteiros, calcule a mediana (valor central) dos elementos usando
//		um laço de repetição. Se o número de elementos do array for par, a mediana será a
//		média dos dois valores centrais.
//	      System.out.print("Quantos número deseja informar? ");
//	        int tamanho = sc.nextInt();
//	        
//	        int[] num = new int[tamanho];
//	        System.out.print("Digite os números separados por espaço: ");
//	        for (int i = 0; i < tamanho; i++) {
//	            num[i] = sc.nextInt();
//	        }
//	        
//	        Arrays.sort(num);
//	        
//	        int indice = 0;
//	        int mediana = 0;
//	        int meio = tamanho / 2;
//	        boolean par = tamanho % 2 == 0;
//	        
//	        for (int i = 0; i < tamanho; i++) {
//	            if (par && (i == meio - 1 || i == meio)) {
//	                mediana += num[i];
//	            } else if (!par && i == meio) {
//	                mediana = num[i];
//	                break;
//	            }
//	        }
//	        
//	        if (par) {
//	            mediana /= 2;
//	        }
//	        
//	        System.out.println("A mediana é: " + mediana);
//		
	}

	
}
