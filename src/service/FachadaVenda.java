package service;

import java.util.List;

import model.Produto;

public interface FachadaVenda {
	
	void pedido(Integer id, Integer venda_id, Integer produto_id, Integer quantidade);	
	Integer novaVenda();
	String fecharVenda(Integer id);	
	void adicionarProduto(Integer pedido_id, Produto produto);
	void adicionarCombo(Integer pedido_id, List<Produto> produtos);

}
