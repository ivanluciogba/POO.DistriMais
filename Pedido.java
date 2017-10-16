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
public class Pedido {
    private String nomeP;
	private String codigo;
	private double valor;
	private String data;
	private int quantidade;
	private String fabricante;

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String toString() {
		return "Nome:" + nomeP + ", codigo:" + codigo + ", Valor:" + valor + ", Data:" + data + ", Quantidade" + quantidade + ", Fabricante" + fabricante;
	}

}

