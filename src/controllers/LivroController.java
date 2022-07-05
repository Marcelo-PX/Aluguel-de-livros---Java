package controllers;

import java.util.ArrayList;
import controllers.contracts.ILivroController;
import models.Livro;

public class LivroController implements ILivroController{
	
	private static ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();

    public void adicionarLivro(Livro livro){    
    	livrosCadastrados.add(livro);
    }
    
    public ArrayList<Livro> listar() {
        return livrosCadastrados; 
    }

    public Livro buscarIsbn(String isbn){
        for (Livro livroCadastrado : livrosCadastrados) {
            if(livroCadastrado.getIsbn().equals(isbn)){
                return livroCadastrado;
            }
        }
        return null;
    }
    
}
