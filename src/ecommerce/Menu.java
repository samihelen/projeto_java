package ecommerce;

import java.util.Scanner;

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
			System.out.println("                     1 - COMPRAR                     ");
			System.out.println("                     2 - SAIR                        ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 2) {
				System.out.println("\nObrigada por visitar a VERDINHAS!");
				//sobre();
				leia.close();
				System.exit(0);
			}
		}
	}

}
