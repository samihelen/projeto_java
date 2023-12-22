package ecommerce.compra;

public class CarrinhoCompras extends Compra{
	
	private float valorCompra;

	public CarrinhoCompras(int numeroDoCartao, int tipo, String titular, String pix, float valorCompra, float valorMinimo) {
		super(numeroDoCartao, tipo, titular, pix, valorCompra, valorMinimo);
		this.valorCompra = valorCompra;
		
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
}
