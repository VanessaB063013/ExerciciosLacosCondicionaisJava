package com.br.generation.lacoscondicionais;

import java.util.Scanner;

public class ExerciciosLacos02 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma
		  pessoa e mostre na saída em qual
			categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto*/
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
				
				
				if(idade > 9 && idade< 15) {
					System.out.println( "Você faz parte da categoria infantil");
					
				 
							 
				}
				
				
			    if(idade > 14 && idade< 18){
			    	 System.out.println("Você faz parte da categoria infantojuvenil!");	
				 
				 		
					}
			   
				
				if(idade > 17) {
					System.out.println("Você faz parte da categoria adulto!");			
					
				
				
					}
						
		
		}

	}


