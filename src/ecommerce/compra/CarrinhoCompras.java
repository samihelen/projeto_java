package ecommerce.compra;

import java.util.ArrayList;

import ecommerce.ICompras.disponiveis;

public class CarrinhoCompras extends Compra{
	
    private ArrayList<disponiveis>plantasDisponiveis = new ArrayList<disponiveis>();
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

	public ArrayList<disponiveis> getPlantasDisponiveis() {
		return plantasDisponiveis;
	}

	public void setPlantasDisponiveis(ArrayList<disponiveis> plantasDisponiveis) {
		this.plantasDisponiveis = plantasDisponiveis;
	}
	
	
}
