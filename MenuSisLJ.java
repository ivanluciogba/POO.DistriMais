
import java.util.List;
import java.util.ArrayList;

public interface MenuSisLJ {
	public void cadastraCliente(Clientes cliente) throws ClienteExistenteException;
	public void cadastraProduto(Produtos prod) throws ProdutoExistenteException;
	public List<Clientes> pesquisaCliente(Clientes c);
	public List<Produtos> pesquisaProduto(Produtos p);
		
	}