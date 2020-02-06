package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	// AULA 06 - 02 Métodos da classe Integer
	public static void main(String[] args) {

		int idade = 29;// Integer
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();

		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = args[0];

//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);

	}
}
