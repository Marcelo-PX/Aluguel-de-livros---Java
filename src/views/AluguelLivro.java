package views;

import controllers.AluguelController;
import controllers.LivroController;
import models.Aluguel;
import models.Livro;
import models.Movimentacao;
import utils.Console;
import views.contracts.IAluguel;

public class AluguelLivro implements IAluguel{
	
    AluguelController aluguelController = new AluguelController();
    LivroController livroController = new LivroController();
    
    public void cadastrarAluguel() {
    	
    	Aluguel aluguel = new Aluguel();
    	LivroController livroController = new LivroController();
    	
    	System.out.println("--Aluguel de Livros--");
    	
        String isbn = Console.readString("\nInforme o ISBN do livro: ");
        
        Livro livroCadastrado = livroController.buscarIsbn(isbn);
        Aluguel livroAlugado = aluguelController.buscarIsbn(isbn);
        
        if(livroAlugado == null && livroCadastrado != null) {
        	aluguel.setIsbn(livroCadastrado.getIsbn());
        	aluguel.setNome(livroCadastrado.getAutor());
            aluguel.setAutor(livroCadastrado.getAutor());
            aluguelController.alugarLivro(aluguel);
            System.out.println("\n Livro alugado com sucesso !!!");
        }else {
            System.out.println("**Este livro não está disponível!\n");
        }
        
    }
    
    public void listarAluguel() {
    	
    	 for (Aluguel livrosAlugados : aluguelController.listar()) {
             System.out.println(livrosAlugados);
         }
    }
    
    public void devolverAluguel() {
    	
    	Movimentacao movimentacao = new Movimentacao();
    	
    	System.out.println("--Devolução de Livros--");
    	
        String isbn = Console.readString("\nInforme o ISBN do livro: ");
        
        Aluguel livroAlugado = aluguelController.buscarIsbn(isbn);
        
        int dias = (int) movimentacao.getDias();
        int preco = (int) movimentacao.getPreco();
        
        if(livroAlugado != null) {
        	System.out.println("Aluguel "+dias+" dias");
        	System.out.println("Preço do aluguel R$ "+preco);
        	
            aluguelController.devolverLivro(livroAlugado);
            System.out.println("\n Livro devolvido com sucesso !!!");
        }else {
            System.out.println("**Este livro não está disponível!\n");
        }
    }
    
}
