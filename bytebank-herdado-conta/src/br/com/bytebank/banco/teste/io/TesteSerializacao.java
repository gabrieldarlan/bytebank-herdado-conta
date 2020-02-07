package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setCpf("89080980");
		cliente.setNome("Darlan");
		cliente.setProfissao("Dev");

		ContaCorrente cc = new ContaCorrente(4444, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		outputStream.writeObject(cc);
		outputStream.close();
	}
}
