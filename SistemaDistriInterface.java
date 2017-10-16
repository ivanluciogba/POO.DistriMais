/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distri;

import Distri.ClienteNaoExisteExeption;
import Distri.Pedido;
import Distri.PedidoJaExisteExeption;
import Distri.PedidoFJaExisteExeption;
import Distri.PedidoNaoExisteExeption;
import Distri.ClienteJaExisteExeption;
import Distri.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivanlúcio
 */
public interface SistemaDistriInterface {
    
        public void cadrastaCliente(Cliente c) throws ClienteJaExisteExeption;
	public void CadrastarPedido(Pedido p) throws PedidoJaExisteExeption;
	public void CadastraPedidosFeitos(Pedido r) throws PedidoFJaExisteExeption;
	public List<Cliente> pesquisarClientes(String nomeDoClieste) throws ClienteNaoExisteExeption;
	public List<Pedido> pesquisarPedidos(String codigo) throws PedidoNaoExisteExeption;
	public List<Pedido> pesquisarPedidoRealizado(String cod);
	public List<Pedido> listarTodosPedidos();
	public List<Cliente> listarTodosClientes();
	public List<Pedido> listarTodosPedidosFeito();

}


