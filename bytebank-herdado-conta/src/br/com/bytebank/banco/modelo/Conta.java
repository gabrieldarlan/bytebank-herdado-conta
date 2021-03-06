package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma Conta
 * 
 * @author gdarlan
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	private static final long serialVersionUID = 1L;
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
//		Conta.total++;
//		System.out.println("o total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("criando conta"+this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente:" + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "N�mero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}

	@Override
	public int compareTo(Conta conta) {
		return Double.compare(this.saldo, conta.saldo);
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}
}
