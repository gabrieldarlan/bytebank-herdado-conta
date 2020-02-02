package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupancao;
import modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) {


		ContaCorrente outra = null;
		outra.deposita(200.0);

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);

		ContaPoupancao contaPoupancao = new ContaPoupancao(222, 222);
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
