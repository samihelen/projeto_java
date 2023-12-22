package ecommerce.ICompras;

public interface disponiveis {
		 
	String disponiveis[] = {"Jibóia G - R$150,00", "Pacová M - R$130,00", "Caladium P - R$45,00", "Begonia M - R$90,00", "Coste de Adão G - R$170,00"};
	
	//metodos de compra
	public void credito(int numero, float valor);
	public void debito(int numero, float valor);
	public void pix(int numero, float valor);
}
