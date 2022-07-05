package models;

import models.contracts.ILivro;

public class Livro implements ILivro{
	
	private String nome;
	private String isbn;
	private String autor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (" Nome: "+getNome()+"\n"+
				" ISBN: "+getIsbn()+"\n"+
				" Autor: "+getAutor()+"\n");
	}
}
