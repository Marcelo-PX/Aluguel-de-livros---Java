package views;

import controllers.LivroController;
import models.Livro;
import utils.Console;
import views.contracts.ICadastro;

public class Cadastro implements ICadastro{
	
	LivroController livroController = new LivroController();
	
	public void cadastrarLivro(){

        Livro livro = new Livro();
        
        System.out.println("--Cadastro de Livros--");
        
        String isbn = Console.readString("Informe o ISBN do livro: ");
        Livro verificarIsbn = livroController.buscarIsbn(isbn);
        
        if(verificarIsbn == null) {
        	livro.setIsbn(isbn);
        	livro.setNome(Console.readString("Informe o NOME do livro: "));
            livro.setAutor(Console.readString("Informe o AUTOR do livro: "));
            livroController.adicionarLivro(livro);
        }else {
        	System.out.println("Este livro já está cadastrado!");
        }
    }
	
	public void listarLivro() {

        for (Livro livrosCadastrados : livroController.listar()) {
            System.out.println(livrosCadastrados);
        }
	}
	
}