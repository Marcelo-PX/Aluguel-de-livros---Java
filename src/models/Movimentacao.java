package models;

public class Movimentacao extends Livro{
	
	private double dias = Math.random()*7;
	private double preco = dias*2;
	
	public double getPreco() {
		return preco;
	}
	public double getDias() {
		return dias;	
	}
	
}