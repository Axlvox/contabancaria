package conta;

import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Criar Conta");

				System.out.println("\n Digite o número da Agência: ");
				agencia = leia.nextInt();
				System.out.println("\n Digite o Nome do Titular");
				leia.nextLine();
				titular = leia.nextLine();

				do {
		            System.out.println("Digite o número da Conta (1-CC ou 2-CP): ");
		            tipo = leia.nextInt();
		        } while (tipo < 1 && tipo > 2);

		        System.out.println("Digite o Saldo da Conta (R$): ");
		        saldo = leia.nextFloat();
		        switch (tipo) {
		            case 1:
		                System.out.println("Digite o Saldo de Crédito (R$): ");
		                limite = leia.nextFloat();
		                contas.cadastrar(new ContaCorrente(contas.generateNumber(), agencia, tipo, titular, saldo, limite));
		                break;
		            case 2:
		                System.out.println("Digite o dia do Aniversário da Conta: ");
		                aniversario = leia.nextInt();
		                contas.cadastrar(new ContaPoupanca(contas.generateNumber(), agencia, tipo, titular, saldo, aniversario));
		                break;
		            default:
		                System.out.println("Opção Inválida");
		                break;
		        }
		        break;
			case 2:
				System.out.println("\n Listar todas as Contas");
				contas.listarTodas();

				break;
			case 3:
				System.out.println("\n Buscar Conta por Número");
				System.out.println("Digite o número da conta: " );
				numero = leia.nextInt();
				
				contas.procurarPorNumero(numero);

				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");

				break;
			case 5:
				System.out.println("\n Apagar Conta");

				break;
			case 6:
				System.out.println("\n Sacar");

				break;
			case 7:
				System.out.println("\n Depositar");

				break;
			case 8:
				System.out.println("\n Transferir");

				break;
			default:
				System.out.println("\nOpção Inválida");
				break;
			}
		}

	}


	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: José Leandro ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/Axlvox");
		System.out.println("*********************************************************");
	}
}