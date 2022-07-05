package controllers.contracts;

import java.util.ArrayList;
import models.Aluguel;

public interface IAluguelController {
	
	void alugarLivro(Aluguel aluguel);
	
    ArrayList<Aluguel> listar();
    
    Aluguel buscarIsbn(String isbn); 
    
    void devolverLivro(Aluguel aluguel);
}
