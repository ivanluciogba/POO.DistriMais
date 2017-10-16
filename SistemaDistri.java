/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distri;

import Distri.SistemaDistribuidora;
import Distri.Endereco;
import Distri.Contato;
import Distri.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivanlúcio
 */
public class SistemaDistri {
    public static void main(String [] args){
		boolean acabou = false;
		SistemaDistribuidora sistema  = new SistemaDistribuidora();
		while (acabou == false) {
			String nome = JOptionPane.showInputDialog("Qual seu nome?");
			String cnpj = JOptionPane.showInputDialog("Qual o CNPJ da Empresa");
			String instituicao = JOptionPane.showInputDialog("Qual a instituição?");
			
			String email = JOptionPane.showInputDialog("Digite o email:");
			String telefone = JOptionPane.showInputDialog("Digite o telefone:");
			
			
			String logradouro = JOptionPane.showInputDialog("Digite o logradouro:");
			String numero = JOptionPane.showInputDialog("Digite o número:");
			String cidade = JOptionPane.showInputDialog("Qual a cidade?");
			String estado = JOptionPane.showInputDialog("Qual o estado?");
			
			Contato con = new Contato(email, telefone);
			System.out.println(con.toString());
			
			Endereco end = new Endereco(logradouro, numero, cidade, estado);
			System.out.println(end.toString());
			
			Cliente c = new Cliente(nome, cnpj, end, con);
			System.out.println(c.toString());
			JOptionPane.showMessageDialog(null, c);
		}
    }
}

  

