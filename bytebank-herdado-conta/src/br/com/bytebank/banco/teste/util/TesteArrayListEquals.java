package br.com.bytebank.banco.teste.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	// AULA 5 ATIVIDADE 1 COMPLETO - CONTINUAR DA AULA 4
	public static void main(String[] args) {

		List<Conta> lista = new Vector<Conta>();

		ContaCorrente cc = new ContaCorrente(22, 11);
		lista.add(cc);

		ContaCorrente cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		ContaCorrente cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		System.out.println("já existe? " + existe);
		for (Conta conta : lista) {
			System.out.println(conta);

		}
	}
}
