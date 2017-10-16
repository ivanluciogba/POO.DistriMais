/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distri;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Ivanlúcio
 */
public class SistemaDistribuidora {

   
    
    
private List<Cliente> clientes;
	private List<Pedido> pedidos;
	private List<Pedido> pRealizados;
	
	public SistemaDistribuidora(){
		this.clientes = new ArrayList<Cliente>();
		this.pedidos = new ArrayList<Pedido>();
		this.pRealizados = new ArrayList<Pedido>();
	}
	
	public void cadastraCliente(Cliente c) throws ClienteJaExisteExeption{
		for(Cliente cli: this.clientes){
			if(cli.getNome().equals(c.getNome())){
				throw new ClienteJaExisteExeption("Já existe cliente com esse nome:" +c.getNome());
			}
			
		}
		this.clientes.add(c);
	}
	public void CadastraPedido(Pedido p) throws PedidoJaExisteExeption{
		for(Cliente c: this.clientes){
			if(c.getNome().equals(c.getNome())){
				throw new PedidoJaExisteExeption("Já existe pedido cadastrado:" + p.getNomeP());
				
			}
		}
		this.pedidos.add(p);

	}
	public void CadastraPedidosFeitos(Pedido r) throws PedidoFJaExisteExeption{
		for(Pedido s: this.pedidos){
			if(s.getCodigo().equals(r)){
				throw new PedidoFJaExisteExeption("Esse pedido já existe" + s.toString());
				
			}
		}
		this.pRealizados.add(r);
		
	}
	public List<Pedido> pesquisarPedidoRealizado(String cod){
		List<Pedido> Pdd = new ArrayList<Pedido>();
		for(Pedido d: this.pRealizados){
			if(d.getCodigo().equals(cod)){
				Pdd.add(d);
			}
		}
		return Pdd;
	}
	public List<Cliente> pesquisarClientes(String cnpj){
		List<Cliente> Cli = new ArrayList<Cliente>();
		for(Cliente c: this.clientes){
			if(c.getCnpj().equals(cnpj)){
				Cli.add(c);
			}
		}
		return Cli;
	}
	public List<Pedido> pesquisarPedidos(String codigo){
		List<Pedido> Ped = new ArrayList<Pedido>();
		for(Pedido p: this.pedidos){
			if(p.getCodigo().equals(codigo)){
				Ped.add(p);
			}
		}
		return Ped;
	}
	public List<Pedido> listarTodosPedidos(){
		return pedidos;
		
	}
	public List<Cliente> listarTodosClientes(){
		return clientes;
	}
	public List<Pedido> listarTodosPedidosFeito(){
		return this.pRealizados;
	}
}