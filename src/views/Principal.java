package views;

import utils.Console;

public class Principal {
	
	public static void main(String[] args) {
        int opcao = 0;
        
        Cadastro cadastro = new Cadastro();
        AluguelLivro aluguel = new AluguelLivro();
        
        do {
            System.out.println("\n1 - Cadastrar Livro");
            System.out.println("2 - Alugar Livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Livros alugados");
            System.out.println("5 - Livros disponíveis");
            System.out.println();
            opcao = Console.readInt("Digite uma das opções: ");

            switch (opcao) {
                case 1:
                   cadastro.cadastrarLivro();
                    break;
                case 2:
                   aluguel.cadastrarAluguel();
                	break;
                case 3: 
                    aluguel.devolverAluguel();
                	break;
                case 4:
                    aluguel.listarAluguel();
                	break;
                case 5:
                    cadastro.listarLivro();
                    break;
                case 0:
                	System.out.println("**Opção inválida!");
                	break;
                default:
                	System.out.println("--ENCERRANDO--");
                	break; 
            }
        } while (opcao != 0);

    }
}
