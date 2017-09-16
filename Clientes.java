
public class Clientes {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private Contatos contatos;

	
	public Clientes(){
		this.nome = "";
		this.cpf = "";
		this.endereco = new Endereco();
		this.contatos = new Contatos();		
	}
	public Clientes(String nome, String cpf, Endereco endereco , Contatos contatos){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contatos = contatos;
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

}
