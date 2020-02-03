package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel tributavel) {
		double valorImposto = tributavel.getValorImposto();
		this.totalImposto += valorImposto;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}
