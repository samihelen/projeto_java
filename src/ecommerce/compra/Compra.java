package ecommerce.compra;

public abstract class Compra {

	private int numeroDoCartao;
	private int tipo;
	private String titular;
	private String pix;
	private float valorCompra;
	private float valorMinimo = 20;
	
public Compra(int numeroDoCartao, int tipo, String titular, String pix, float valorCompra, float valorMinimo) {
		this.numeroDoCartao = numeroDoCartao;
		this.tipo = tipo;
		this.titular = titular;
		this.pix = pix;
	}

public float getValorCompra() {
	return valorCompra;
}

public void setValorCompra(float valorCompra) {
	this.valorCompra = valorCompra;
}

public float getValorMinimo() {
	return valorMinimo;
}

public void setValorMinimo(float valorMinimo) {
	this.valorMinimo = valorMinimo;
}

public int getNumeroDoCartao() {
	return numeroDoCartao;
}

public void setNumeroDoCartao(int numeroDoCartao) {
	this.numeroDoCartao = numeroDoCartao;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public String getPix() {
	return pix;
}

public void setPix(String pix) {
	this.pix = pix;
}

public boolean pagar() {
	if(this.getValorCompra() < valorMinimo) {
		System.out.println("\nO valor da compra não atingiu a valor mínimo esperado de R$ 20,00");
		return false;
	}
	return true;

	
}
	
}

