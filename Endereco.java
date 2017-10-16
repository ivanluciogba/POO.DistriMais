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
public class Endereco {
        private String logradouro;
	private String numero;
	private String cidade;
	private String estado;
        
        
        public Endereco(){
		this.logradouro = "";
		this.numero = "";
		this.cidade = "";
		this.estado = "";		
	}
	public Endereco(String logradouro, String numero, String cidade, String estado){
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
        }
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Endereco [rua=" + logradouro + ", cidade=" + cidade + ", estado=" + estado + ", numero=" + numero + "]";
	}
	
	

}
    
