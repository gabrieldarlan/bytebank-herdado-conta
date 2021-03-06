package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(123, 321);
		contaCorrente.deposita(200.0);
		try {
			contaCorrente.saca(210.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(contaCorrente.getSaldo());
	}
}
