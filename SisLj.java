
import java.util.ArrayList;
import java.util.List;

public class SisLj implements MenuSisLJ {
	
	private List<Clientes> clientes;
	private List<Produtos> produtos;
	
	public SisLj(){
		this.clientes = new ArrayList<Clientes>();
		this.produtos = new ArrayList<Produtos>();
	}

	
	public void cadastraCliente(Clientes c) throws ClienteExistenteException{
		for(Clientes a: this.clientes){
			if (c.getNome().equals(a.getNome())){
			throw new ClienteExistenteException("Já existe cliente cadastrado com esse nome:"+a.getNome());	
			
			}
		}
		this.clientes.add(c);
}
	
	public void cadastraProduto(Produtos prod) throws ProdutoExistenteException{
		for(Produtos p:this.produtos){
			if(prod.getNomeP().equals(p.getNomeP())){
				throw new ProdutoExistenteException("Já existe produto Cadastrado com este nome:"+p.getNomeP());
			}
		}
		this.produtos.add(prod);
	}

	
	public List<Clientes> pesquisaCliente(Clientes c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produtos> pesquisaProduto(Produtos p) {
		// TODO Auto-generated method stub
		return null;
	}


	

	





	
	

}