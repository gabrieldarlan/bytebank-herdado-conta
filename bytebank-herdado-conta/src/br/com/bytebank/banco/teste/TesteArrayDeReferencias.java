package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {

		Object[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;

		Cliente cliente = new Cliente();
		contas[2] = cliente;

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		contas[1] = cc2;
		System.out.println(((Conta) contas[1]).getNumero());

		Object referenciaGenerica = contas[1];
		
		System.out.println(((Conta) referenciaGenerica).getNumero());
		
		
		
		
		
		
		
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}
