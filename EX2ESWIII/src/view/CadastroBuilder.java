package view;

import model.ProdutoBuilder;

public class CadastroBuilder {

	public static void main(String[] args) {
		ProdutoBuilder produto = ProdutoBuilder.builder()
				.addNome("Camiseta Manga Curta")
				.addCategoria("Calcados");
		System.out.println(produto.toString());		
	}
}
