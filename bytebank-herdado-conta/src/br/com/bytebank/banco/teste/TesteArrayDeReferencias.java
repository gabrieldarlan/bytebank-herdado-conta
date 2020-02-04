package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {

//		assistir a partir do minuto 12:10 da atividade 5 da aula 1 de arrays
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(22, 33);
		contas[1] = cc2;

		System.out.println(contas[1].getAgencia());

	}
}
