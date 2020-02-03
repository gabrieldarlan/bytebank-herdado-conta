package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {

		ContaEspecial ce = new ContaEspecial(111, 222);

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);

		ContaPoupanca contaPoupancao = new ContaPoupanca(222, 222);
		contaPoupancao.deposita(200.0);

		try {
			contaCorrente.transfere(10.0, contaPoupancao);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		System.out.println("CC " + contaCorrente.getSaldo());
		System.out.println("CP " + contaPoupancao.getSaldo());

	}
}
