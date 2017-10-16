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
public class Contato {
        private String telefone;
	private String email;
	
        public Contato(){
		this.telefone= "";
		this.email = "";
			
	}
	public Contato(String telefone, String email){
		this.telefone = telefone;
		this.email = email;
        }


	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Contato [telefone=" + telefone + ", email=" + email + "]";
	}
}
