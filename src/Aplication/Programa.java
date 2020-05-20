package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Aluno;



public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("digite Nome e as 3 notas do aluno");
		aluno.nome  = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(" nota Final " + aluno.notaFinal());
		System.out.println(aluno.situacao());
		double notaf = aluno.notaFinal();
		System.out.println(aluno.notaF(notaf));
		
		

		sc.close();	
	}}

