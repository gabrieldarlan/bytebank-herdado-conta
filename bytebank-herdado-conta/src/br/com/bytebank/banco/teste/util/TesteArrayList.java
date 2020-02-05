package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc = new ContaCorrente(22, 11);
		lista.add(cc);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println(lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

		System.out.println("Tamanho: " + lista.size());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		ContaCorrente cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		ContaCorrente cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}
}
