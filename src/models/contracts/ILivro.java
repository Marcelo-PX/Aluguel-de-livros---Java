package models.contracts;

public interface ILivro {
	
	String getNome();
	void setNome(String nome);
	
	String getIsbn();
	public void setIsbn(String isbn);
	
	String getAutor();
	void setAutor(String autor);
}
