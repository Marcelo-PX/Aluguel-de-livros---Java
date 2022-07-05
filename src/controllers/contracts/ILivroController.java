package controllers.contracts;

import java.util.ArrayList;
import models.Livro;

public interface ILivroController {
	
	void adicionarLivro(Livro livro);
    
    ArrayList<Livro> listar();

    Livro buscarIsbn(String isbn);
}
