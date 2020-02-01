
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SegurodeVida segurodeVida = new SegurodeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(segurodeVida);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
		
	}
}
