package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
	
//		String substring = nome.substring(1);
//		System.out.println(substring);
	
//		System.out.println(nome.length());
	
		String vazio = "    Alura      ";
		String outroVazio = vazio.trim();
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
//		System.out.println(vazio.isEmpty());
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
	}
}
