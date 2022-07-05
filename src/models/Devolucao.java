package models;

public class Devolucao extends Movimentacao{
	
	public Devolucao() {
		
		livroDevolvido = new Livro();
	}
	
	private Livro livroDevolvido;

	public Livro getLivroDevolvido() {
		return livroDevolvido;
	}
	public void setLivroDevolvido(Livro livroDevolvido) {
		this.livroDevolvido = livroDevolvido;
	}
	
}
