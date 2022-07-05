package controllers;

import java.util.ArrayList;
import controllers.contracts.IAluguelController;
import models.Aluguel;

public class AluguelController implements IAluguelController{
	
	private static ArrayList<Aluguel> livrosAlugados = new ArrayList<Aluguel>();

    public void alugarLivro(Aluguel aluguel){    
    	livrosAlugados.add(aluguel);
    }
    
    public ArrayList<Aluguel> listar() {
        return livrosAlugados; 
    }

    public Aluguel buscarIsbn(String isbn){
        for (Aluguel livroAlugado : livrosAlugados) {
            if(livroAlugado.getIsbn().equals(isbn)){
                return livroAlugado;
            }
        }
        return null;
    }
    
    public void devolverLivro(Aluguel aluguel) {
    	livrosAlugados.remove(aluguel);
    }
    
}
