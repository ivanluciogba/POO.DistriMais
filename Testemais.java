package Distri;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Test;

public class Testemais {

	@Test
	public void test() {
		SistemaDistribuidora sistema = new SistemaDistribuidora();
		String nome = "cea";
		String cnpj = "777777";
		String email = "cea@gmail.com";
		String telefone = "555555";
		String logradouro = "aaaaa";
		int numero = 11;
		String cidade = "João Pessoa";
		String estado = "PB";
		Contato con = new Contato(email, telefone);
		Endereco end = new Endereco(logradouro, numero, cidade, estado);
		
		Cliente c = new Cliente(nome, cnpj, end, con);
		try{
		sistema.cadastraCliente(c);
		}catch(ClienteJaExisteExeption e){
			fail("Cliente já cadastrado");
		}
		assertTrue(sistema.pesquisarClientes("777777").size() == 1);
		assertTrue(sistema.listarTodosClientes().size() == 1);
		
	}

}
