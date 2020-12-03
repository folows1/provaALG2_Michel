package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.*;

public class Q2 {
	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		Ponto pontoI = new Ponto();
		Ponto pontoF = new Ponto();
		pontoI.x = 1;
		pontoI.y = 2;
		pontoF.x = 9;
		pontoF.y = 10;
		Retangulo r = new Retangulo();
		r.inicio = pontoI;
		r.fim = pontoF;
		Ponto procurado = new Ponto();
		procurado.x = 9;
		procurado.y = 10;
		if (estaDentro(procurado, r)) {
			System.out.println("Está dentro!");
		} else {
			System.out.println("Fora!");
		}
		;
		l.close();

	}

	public static boolean estaDentro(Ponto procurado, Retangulo r) {
		if ((procurado.x <= r.fim.x && procurado.x >= r.inicio.x)
				&& (procurado.y <= r.fim.y && procurado.y >= r.inicio.y)) {
			return true;
		} else {
			return false;
		}
	}
}
