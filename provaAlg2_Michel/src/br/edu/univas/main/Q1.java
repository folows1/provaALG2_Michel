package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.*;

public class Q1 {
	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Periodo p = new Periodo();
		System.out.println(" - Per�odo INICIAL - ");
		System.out.println("Digite o dia: ");
		d1.dia = l.nextInt();
		System.out.println("Digite o m�s: ");
		d1.mes = l.nextInt();
		System.out.println("Digite o ano: ");
		d1.ano = l.nextInt();
		p.inicio = d1;
		System.out.println(" - Per�odo FINAL - ");
		System.out.println("Digite o dia: ");
		d2.dia = l.nextInt();
		System.out.println("Digite o m�s: ");
		d2.mes = l.nextInt();
		System.out.println("Digite o ano: ");
		d2.ano = l.nextInt();
		p.fim = d2;
		System.out.println("-- DATA para COMPARA��O -- ");
		Data data = new Data();
		System.out.println("Digite o dia: ");
		data.dia = l.nextInt();
		System.out.println("Digite o m�s: ");
		data.mes = l.nextInt();
		System.out.println("Digite o ano: ");
		data.ano = l.nextInt();
		if (estaDentro(data, p)) {
			System.out.println("O dia est� dentro do Per�odo!");
		} else {
			System.out.println("O dia est� fora do Per�odo!");
		}
		;
		l.close();
	}

	public static boolean estaDentro(Data data, Periodo p) {
		if (data.ano > p.inicio.ano && data.ano < p.fim.ano) {
			return true;
		} else if (data.ano == p.inicio.ano || data.ano == p.fim.ano) {
			if (data.mes > p.inicio.mes && data.mes < p.fim.mes) {
				return true;
			} else if (data.mes == p.inicio.mes || data.mes == p.fim.mes) {
				if (data.dia >= p.inicio.dia && data.dia <= p.inicio.dia) {
					return true;
				}
			}
		}
		return false;
	}
}
