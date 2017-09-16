
public class Contatos {
	private String numero;
	private String email;
	
	public Contatos(){
		this.numero= "";
		this.email = "";
			
	}
	public Contatos(String numero, String email){
		this.numero = numero;
		this.email = email;
}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
