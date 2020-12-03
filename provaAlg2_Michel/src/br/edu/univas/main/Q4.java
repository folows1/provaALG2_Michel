package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.*;

public class Q4 {
	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		Retangulo2 r1 = new Retangulo2();
		Retangulo2 r = lerRetangulo(r1);
		imprimirRet(r);
		l.close();
	}
	
	public static Retangulo2 lerRetangulo(Retangulo2 r) {
		System.out.println("Leitura de teclado: ");
		System.out.println("Digite o X INICIAL: ");
		r.xIni = l.nextInt();
		System.out.println("Digite o Y INICIAL: ");
		r.yIni = l.nextInt();
		System.out.println("Digite o X FINAL: ");
		r.xFim = l.nextInt();
		System.out.println("Digite o Y FINAL: ");
		r.yFim = l.nextInt();
		return r;
	}
	public static void imprimirRet(Retangulo2 r) {
		System.out.println("IMPRESSÃO: ");
		System.out.println(r.xIni);
		System.out.println(r.yIni);
		System.out.println(r.xFim);
		System.out.println(r.yFim);
	}
}
