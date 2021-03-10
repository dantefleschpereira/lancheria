package service;

import java.util.List;

import model.Pedido;
import model.Produto;
import model.dao.DaoFactory;

public class FachadaVendaImpl implements FachadaVenda {

	@Override
	public void pedido(Integer id, Integer venda_id, Integer produto_id, Integer quantidade) {
		Factory.createPedido(id, venda_id, produto_id, quantidade);
	}

	@Override
	public Integer novaVenda() {
		return Factory.createVenda();
	}

	@Override
	public String fecharVenda(Integer id) {
		return "Venda fechada";
	}

	@Override
	public void adicionarProduto(Integer pedido_id, Produto produto) {
		/// TODO
	}

	@Override
	public void adicionarCombo(Integer pedido_id, List<Produto> produtos) {
		//TODO
	}

	

}
