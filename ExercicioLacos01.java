package com.br.generation.lacoscondicionais;

import java.util.Scanner;

public class ExercicioLacos01 {
	public static void main(String[] args) {
		/* Faça um programa que receba
		  três inteiros e diga qual deles é o maior.*/
		
		Scanner leia = new Scanner(System.in);
		
		double numero1 ,numero2, numero3, maior = 0.0;
		
		System.out.println("Digite o primeiro número :");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite e segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextDouble();
		
		if (numero1 > numero2 && numero1>numero3) {
			maior = numero1;
			System.out.println("O maior numero é : " + maior);
			
		}
		
		if (numero2 > numero1 && numero2>numero3) {
			
			maior= numero2;
			System.out.println("O maior numero é : " + maior);
		}
		
		if (numero3 > numero1 && numero3>numero2) {
			maior = numero3;
			System.out.println("O maior numero é : " + maior);	
		}
		
	}
	

}
