package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String categoria;
	private String nome;
    List<Produto> products = new ArrayList<Produto>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", categoria=" + categoria;
	}
	
}
