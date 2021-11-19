package lista;

public abstract class Lista {
	
	private String compras;
	private int quantidade;

	public Lista(String compras, int quantidade) {
		super();
		this.compras = compras;
		this.quantidade = quantidade;
	}

	public String getCompras() {
		return compras;
	}

	public void setCompras(String compras) {
		this.compras = compras;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
