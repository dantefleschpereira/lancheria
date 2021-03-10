package program;

import model.dao.DaoFactory;
import model.dao.ProdutoDao;

public class Program {

	public static void main(String[] args) {
		ProdutoDao produtoDao = DaoFactory.createProdutoDao(); // injeção de dependência
	}
}
