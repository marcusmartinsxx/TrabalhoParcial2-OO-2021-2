import java.util.Scanner;

public class Main {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		char r;
		Plano p[] = new Plano[10];
		
		p[0] = new Plano("Gold", "a", 150f , 60);
		p[1] = new Plano("Silver", "a", 100f , 20);
		p[2] = new Plano("Copper", "a", 60f , 10);
		p[3] = new Plano("Leather", "a", 20f , 5);
		int qtdPlanos = 4;
		
		System.out.println("Bem vindo ao aluguel de bicicletas!");
		System.out.println("\r---------------------------------------\r");
		System.out.println("Aqui sera possivel alugar bicicletas, contratar planos e muito mais" + 
							", tudo diretamente do seu dispositivo!");
		enter();
		do{
			r = menu();
			switch(r) {
			case '1':
				System.out.println("\n1");
				break;
			case '2':
				
				System.out.println("----------Menu Planos----------");
				System.out.println("1- Criar\n2- Visualizar\n3- Editar\n4- Deletar");
				r = ler.next().charAt(0);
				
				switch(r) {
				
				case '1':
					p[qtdPlanos] = new Plano("" ,"" ,0 ,0 );
					p[qtdPlanos].cadastraPlano();
					qtdPlanos++;
					break;
				case '2':
					System.out.println("Os planos dispon�veis s�o:");
					for(int i = 0; i < qtdPlanos; i++) {
						if(p[i] != null)
							System.out.println(i+1 + "- " + p[i].getTipo());
					}
					System.out.println("\nDeseja checar qual plano?");
					r = ler.next().charAt(0);
					if(r > 0 && r < qtdPlanos+1) {// Checa dentro dos planos disponiveis
						if(p[r-1] != null) {// Checa dentro dos planos cadastrados
							p[r-1].visualizaPlano();
						}else
							System.out.println("Opcao invalida.");
					}else
						System.out.println("Opcao invalida.");
					break;
				case '3':
					System.out.println("edita plano");
					break;
				case '4':
					System.out.println("deleta plano");
				}
			
				break;
			case '3':
				System.out.println("\n3");
				break;
			case '4':
				System.out.println("\n4");
				break;
			case '5':
				System.out.println("\nAte a proxima!\r");
				break;
			default:
				System.out.println("\nOpcao invalida.\r");
			}
			if(r != '5') {// Qualquer opcao diferente de 5, pedira o enter para continuar
				enter();
				ler.nextLine();
			}
		}while(r != '5');
		
		}

	public static char menu() {
		char r;
		System.out.println("----------Menu----------");
		System.out.println("1- Usuario\n2- Planos\n3- PitStops\n4- Alugar\n5- Encerrar");
		r = ler.next().charAt(0);
		return r;
	}
	
	public static void enter() {
		System.out.println("\nPressione Enter para continuar");
		ler.nextLine();
	}
	
}
