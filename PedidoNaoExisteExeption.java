/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distri;

/**
 *
 * @author Ivanlúcio
 */
public class PedidoNaoExisteExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PedidoNaoExisteExeption(String PErro){
		super(PErro);
	}
}
