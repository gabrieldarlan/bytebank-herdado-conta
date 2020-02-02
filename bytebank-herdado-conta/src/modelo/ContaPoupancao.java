package modelo;
public class ContaPoupancao extends Conta {

	public ContaPoupancao(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
	}

}
