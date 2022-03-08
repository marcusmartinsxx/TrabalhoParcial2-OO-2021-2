import java.util.Scanner;

public class Main {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaracao de constantes de teste
		final int qtdUsuarios = 50;
		final int qtdBicicletas = 100;
		final int qtdPitStops = 20;
		
		// Declaracao de objetos vetorizados
		Usuario[] usuario = new Usuario[qtdUsuarios];
		Bicicleta[] bicicletas = new Bicicleta[qtdBicicletas];
		PitStop[] pitStops = new PitStop[qtdPitStops];
		
		// Menus
		char opcao1, opcao2, opcao3;
		do {
			opcao1 = menu();
			switch(opcao1) {
				case '1': // Opcao Usuario
					opcao2 = menuUsuario();
					switch(opcao2) {
						case '1': // Cadastro de Usuario
							usuario[0].cadastraUsuario(usuario);
							break;
						case '2':
							opcao3 = menuEditaUsuario();
							switch (opcao3) {
								case '1': // Informacoes de Usuario
									usuario[0].editaUsuario();
									break;
								case '2': // Informacoes pessoais
									usuario[0].editaPessoa();
									break;
								default:
									break;
							}
							break;
						case '3': // Deleta Usuario
							usuario[0].deletaUsuario();
							usuario[0].deletaPessoa();
						break;
					}
					break;
				case '2': // Opcao PitStops
					break;
				case '3': // Opcao Alugar
					break;
				case '4': // Opcao Encerrar
					
					break;
				default:
					System.out.println("Opcao invalida! Tente novamente.");
					enter();
					break;
			}
		} while( opcao1 != '4' );
		
	}

	public static char menu() {
		char opcao;
		System.out.println("----------Menu----------");
		System.out.println("1- Usuario\n2- PitStops\n3- Alugar\n4- Encerrar");
		opcao = ler.next().charAt(0);
		return opcao;
	}
	
	public static void enter() {
		System.out.println("\nPressione Enter para continuar");
		ler.nextLine();
	}
	
	public static char menuUsuario() {
		char opcao;
		System.out.println("------Menu-Usuario------");
		System.out.println("1- Cadastrar\n2- Editar\n3- Alugar\n4- Encerrar");
		opcao = ler.next().charAt(0);
		return opcao;
	}
	
	public static char menuEditaUsuario() {
		char opcao;
		System.out.println("----Menu-Usuario-Edit----");
		System.out.println("1- Informacoes de usuario\n2- Informacoes pessoais");
		opcao = ler.next().charAt(0);
		return opcao;
	}
	
	
}
