/*
         ---------------------------
        |        Empresa XYZ        |
         ---------------------------
            IDE:	IntelliJ IDEA
       Language:	Java 8
      Developer:	Lucas Marra Rebello
        Contact:	lucasmrebello@yahoo.com.br
  Last modified:	02/06/2021 - 03:46 pm
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Empresa XYZ = new Empresa();
		Scanner ler = new Scanner(System.in);
		int opc, tipo, cont = 0;

		do { //menu
			System.out.println("*--* Sistema da Empresa XYZ *--*");
			System.out.println("\nEscolha uma das opções abaixo.");
			System.out.println("\n0 - Sair.");
			System.out.println("1 - Adicionar um novo funcionário.");
			System.out.println("2 - Calcular pagamento de um funcionário.");
			System.out.println("3 - Aumentar adicional de todos os funcionários.");
			System.out.println("4 - Imprimir relatório de todos os funcionários.");
			System.out.print("\nDigite o número da opção escolhida: ");
			opc = ler.nextInt();

			switch (opc) {
			case 0: // sair
				System.out.println("Até a próxima!\n");
				return;

			case 1: //adiciona funcionário
				cont++;
				System.out.println("Escolha o tipo de funcionário que quer adicionar.");
				System.out.println("\n1 - Estagiário.");
				System.out.println("2 - Secretária(o).");
				System.out.println("3 - Gerente.");
				System.out.println("4 - Presidente.");
				System.out.print("\nDigite o número do tipo de funcionário escolhido: ");
				tipo = ler.nextInt();

				if (tipo == 1) { // tipo estagiário
					int ID;
					String nome;
					double salario;
					System.out.print("\nDigite o ID do(a) novo(a) estágiario(a): ");
					ID = ler.nextInt();
					System.out.print("Digite o nome do(a) estagiário(a): ");
					ler = new Scanner(System.in);
					nome = ler.nextLine();
					System.out.print("Digite o salário do(a) estagiário(a): ");
					salario = ler.nextDouble();
					XYZ.addFuncionario(new Estagiario(ID, nome, salario));
					System.out.println("\nEstagiário(a) adicionado(a) com sucesso!\n");
				} 
				
				else if (tipo == 2) { // tipo secretária
					int ID;
					String nome;
					double salario;
					System.out.print("\nDigite o ID da(o) nova(o) secretária(o): ");
					ID = ler.nextInt();
					System.out.print("Digite o nome da(o) secretária(o): ");
					ler = new Scanner(System.in);
					nome = ler.nextLine();
					System.out.print("Digite o salário da(o) secretária(o): ");
					salario = ler.nextDouble();
					XYZ.addFuncionario(new Secretaria(ID, nome, salario));
					System.out.println("\nSecretária(o) adicionada(o) com sucesso!\n");
				} 
				
				else if (tipo == 3) { // tipo gerente
					int ID;
					String nome;
					double salario;
					System.out.print("\nDigite o ID do(a) novo(a) gerente: ");
					ID = ler.nextInt();
					System.out.print("Digite o nome do(a) gerente: ");
					ler = new Scanner(System.in);
					nome = ler.nextLine();
					System.out.print("Digite o salário do(a) gerente: ");
					salario = ler.nextDouble();
					XYZ.addFuncionario(new Gerente(ID, nome, salario));
					System.out.println("\nGerente adicionado(a) com sucesso!\n");
				} 
				
				else if (tipo == 4) { // tipo presidente
					int ID;
					String nome;
					double salario;
					System.out.print("\nDigite o ID do(a) novo(a) presidente: ");
					ID = ler.nextInt();
					System.out.print("Digite o nome do(a) presidente: ");
					ler = new Scanner(System.in);
					nome = ler.nextLine();
					System.out.print("Digite o salário do(a) presidente: ");
					salario = ler.nextDouble();
					XYZ.addFuncionario(new Presidente(ID, nome, salario));
					System.out.println("\nPresidente adicionado(a) com sucesso!\n");
				} 
				
				else {
					System.out.println("Opção inválida!\n");
				}
				break;

			case 2: // calcula pagamento do funcionário
				if (cont == 0) {
					System.out.println("\nNão existem funcionários registrados no sistema ainda!");
					break;
				}
				
				int ID;
				System.out.print("\nDigite o ID do funcionário a qual quer calcular o pagamento: ");
				ID = ler.nextInt();
				double result = XYZ.calculaPagamento(ID);

				if (result == -1) {
					System.out.println("Funcionário não encontrado!!");
					break;
				}

				System.out.printf("\nPagamento do funcionário  %d : R$ %.2f \n", ID, result);
				break;

			case 3: // aumenta adicional
			  if (cont == 0) {
					System.out.println("\nNão existem funcionários registrados no sistema ainda!");
					break;
				}

				double aumento;
				System.out.print("\nDigite o valor do aumento que quer realizar para todos os funcionários (0 <= valor <= 1): ");
				aumento = ler.nextDouble();
				XYZ.aumentaAdicional(aumento);
				System.out.println("\nAumento realizado com sucesso!\n");
				break;

			case 4: // printa lista de funcionários da empresa
				if (cont == 0) {
					System.out.println("\nNão existem funcionários registrados no sistema ainda!");
					break;
				}

				System.out.println("\nRelatório dos funcionários:\n");
				System.out.println(XYZ.toString());
				
				break;

			default:
				System.out.println("Opção inválida!\n");
				break;
			}
		} while (true);
	}
}