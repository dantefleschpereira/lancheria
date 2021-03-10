package service;

import model.Pedido;
import model.Venda;

public class Factory {

	public static Integer createVenda() {
		return new Venda((int) Math.random()).getId();
	}

	public static Pedido createPedido(Integer id, Integer venda_id, Integer produto_id, Integer quantidade) {
		return new Pedido(id, venda_id, produto_id, quantidade);
	}
	
	
}
