package Distri;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestePedido {

	@Test
	public void test() {
		SistemaDistribuidora sistema = new SistemaDistribuidora();
		String nomeP = "roupas";
		String codigo = "333333";
		double valor = 3.000;
		String data = "15/11/2017";
		int quantidade = 5;
		String fabricante = "cea";
		
		Pedido p = new Pedido(nomeP, codigo, valor, data, quantidade, fabricante);
		try{
			sistema.CadastarPedido(p);
		}catch(PedidoJaExisteExeption e){
			fail("Já existe pedido");
		}
		assertTrue(sistema.listarTodosPedidos().size() == 1);
	}

}
