package ecommerce;

import java.util.Scanner;
import ecommerce.compra.Compra;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      VERDINHAS                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                     Disponíveis                     ");
			System.out.println("                                                     ");
			System.out.println("                Jibóia G - R$150,00                  ");
			System.out.println("                Pacová M - R$130,00                  ");
			System.out.println("                Caladium P - R$45,00                 ");
			System.out.println("                Begonia M - R$90,00                  ");
			System.out.println("                Costela de Adão G - R$170,00         ");
			System.out.println("                                                     ");
			System.out.println("                1 - COMPRAR no Crédito               ");
			System.out.println("                2 - COMPRAR no Débito                ");
			System.out.println("                3 - COMPRAR no Pix                   ");
			System.out.println("                4 - SAIR                             ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 4 ) {
				System.out.println("\nObrigada por visitar a VERDINHAS!");
				sobre();
			leia.close();
				System.exit(0);
			}
			switch(opcao) {
			case 1:
					System.out.println("Comprar no Crédito\n\n");
					
					break;
			case 2:
					System.out.println("Comprar no Débito\n\n");
					
					break;
			case 3:
					System.out.println("Comprar no Pix\n\n");
					
					break;
			default:
					System.out.println("\nOpção Inválida!\n");
			}
	   }
	
	}

	private static void sobre() {
		System.out.println("\n*************************************");
		System.out.println("Verdinha loja de plantas LTDA");
		System.out.println("CNPJ: 39.823.360/0001-08");
		System.out.println("Contato (11) 95687-3994 - Whatsapp");
		System.out.println("Rua das Acacias, 3000 Vila Ilda - SP");
		
	}

}
