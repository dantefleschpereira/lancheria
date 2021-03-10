package model;

public class Pedido {
	private Integer id;
	private Integer venda_id;
	private Integer produto_id;
	private Integer quantidade;

	public Pedido() {

	}

	public Pedido(Integer id, Integer venda_id, Integer produto_id, Integer quantidade) {
		this.id = id;
		this.venda_id = venda_id;
		this.produto_id = produto_id;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVenda_id() {
		return venda_id;
	}

	public void setVenda_id(Integer venda_id) {
		this.venda_id = venda_id;
	}

	public Integer getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Integer produto_id) {
		this.produto_id = produto_id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", venda_id=" + venda_id + ", produto_id=" + produto_id + ", quantidade="
				+ quantidade + "]";
	}

}
