package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {


	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.1;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
}
