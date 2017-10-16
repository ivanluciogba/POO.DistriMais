/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distri;

import javax.swing.JTextField;

/**
 *
 * @author Ivanlúcio
 */
public class Cliente {
        private String nome;
	private String cnpj;
	private Endereco endereco;
	private Contato contato;
        
        public Cliente(){
		this.nome = "";
		this.cnpj = "";
		this.endereco = new Endereco();
		this.contato = new Contato();		
	}
	public Cliente(String nome, String cnpj, Endereco endereco , Contato contato){
		this.nome = nome;
		this.cnpj= cnpj;
		this.endereco = endereco;
		this.contato = contato;
        }

    
	public String getNome() {
		return nome;
	}
	public void setNomeCliente(String nomeCliente) {
		nome = nomeCliente;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String toString() {
		return "Cliente" + nome + ", CNPJ" + cnpj + ", Endereço" + endereco + ", Contato" + contato;
	}
    
}
