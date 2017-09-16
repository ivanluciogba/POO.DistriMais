
public class Produtos {
	private String nomeP;
	private int codigo;
	private String marca;
	private Double valor;

	
	public Produtos(){
		this.nomeP = "";
		this.codigo = 0;
		this.marca = "";
		this.valor = 0.0;		
	}
	public Produtos(String nomeP, int codigo, String marca, double valor){
		this.nomeP = nomeP;
		this.codigo = codigo;
		this.marca = marca;
		this.valor = valor;
}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
