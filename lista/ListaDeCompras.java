package lista;

public class ListaDeCompras extends Lista implements ContagemItens {

	private String frutas, verduras, carnes, lanches, lacticinios, bebidas, higienePessoal, limpeza;

	public ListaDeCompras(String compras, int quantidade, String frutas, String verduras, String carnes, String lanches,
			String lacticinios, String bebidas, String higienePessoal, String limpeza) {

		super(compras, quantidade);
		this.frutas = frutas;
		this.verduras = verduras;
		this.carnes = carnes;
		this.lanches = lanches;
		this.lacticinios = lacticinios;
		this.bebidas = bebidas;
		this.higienePessoal = higienePessoal;
		this.limpeza = limpeza;
	}

	public String getFrutas() {
		return frutas;
	}

	public void setFrutas(String frutas) {
		this.frutas = frutas;
	}

	public String getVerduras() {
		return verduras;
	}

	public void setVerduras(String verduras) {
		this.verduras = verduras;
	}

	public String getCarnes() {
		return carnes;
	}

	public void setCarnes(String carnes) {
		this.carnes = carnes;
	}

	public String getLanches() {
		return lanches;
	}

	public void setLanches(String lanches) {
		this.lanches = lanches;
	}

	public String getLacticinios() {
		return lacticinios;
	}

	public void setLacticinios(String lacticinios) {
		this.lacticinios = lacticinios;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	public String getHigienePessoal() {
		return higienePessoal;
	}

	public void setHigienePessoal(String higienePessoal) {
		this.higienePessoal = higienePessoal;
	}

	public String getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(String limpeza) {
		this.limpeza = limpeza;
	}

	@Override
	public void contagem() {
		// TODO Auto-generated method stub
		System.out.println("O número total de itens é: " + getQuantidade());

	}

	@Override
	public String toString() {
		return "        - JAVINHA MARKET LIST -"+"\n======================================\n"+"FRUTAS: \n" + frutas +"\n======================================\n"+ "VERDURAS: \n" + verduras +"\n======================================\n"+ "CARNES: \n" + carnes +"\n======================================\n"+ "LANCHES: \n"
				+ lanches +"\n======================================\n"+ "LACTICINIOS: \n" + lacticinios +"\n======================================\n"+ "BEBIDAS: \n" + bebidas +"\n======================================\n"+ "HIGIENEPESSOAL: \n"
				+ higienePessoal +"\n======================================\n"+ "LIMPEZA: \n" + limpeza+"\n======================================\n";
	}

}
