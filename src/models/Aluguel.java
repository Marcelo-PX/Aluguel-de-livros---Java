package models;

public class Aluguel extends Movimentacao{
	
	public Aluguel() {
		livroAlugado = new Livro();
	}
	
	private Livro livroAlugado;

	public Livro getLivroAlugado() {
		return livroAlugado;
	}
	public void setLivroAlugado(Livro livroAlugado) {
		this.livroAlugado = livroAlugado;
	}
	
}
