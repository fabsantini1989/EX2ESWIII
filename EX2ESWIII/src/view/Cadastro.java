package view;

import model.ProdutoCalcado;
import model.ProdutoCamiseta;
import model.ProdutoEquipamento;
import model.ProdutoJogos;

public class Cadastro {
	
	public static void main(String[] args) {
		
		ProdutoCamiseta camiseta = new ProdutoCamiseta();
		camiseta.setNome("Camiseta Manga Curta");
		camiseta.setMarca("Lacoste");
		camiseta.setValor(100);
		camiseta.setTamanho("GG");

		camiseta.setNome("Camiseta Manga Cumprida");
		camiseta.setMarca("Echo");
		camiseta.setValor(150);
		camiseta.setTamanho("XXG");
		
		camiseta.setNome("Camiseta Sem Manga");
		camiseta.setMarca("Oakley");
		camiseta.setValor(250);
		camiseta.setTamanho("M");
		
		ProdutoCalcado calcado = new ProdutoCalcado();
		calcado.setTipo("Tenis");
		calcado.setCor("Azul");
		calcado.setTamanho(43);
		calcado.setValor(200);
		
		calcado.setTipo("Sapato");
		calcado.setCor("Preto");
		calcado.setTamanho(41);
		calcado.setValor(250);
		
		calcado.setTipo("Tenis");
		calcado.setCor("Amarelo");
		calcado.setTamanho(46);
		calcado.setValor(350);		

		ProdutoJogos jogos = new ProdutoJogos();
		jogos.setVideogame("PS5");
		jogos.setNome("God of War V");
		jogos.setValor(150);
		
		jogos.setVideogame("XBOX");
		jogos.setNome("HALO");
		jogos.setValor(150);
		
		jogos.setVideogame("XBOX");
		jogos.setNome("COD: Warzone");
		jogos.setValor(250);
		
		ProdutoEquipamento equipamento = new ProdutoEquipamento();
		equipamento.setFabricante("Western Digital");
		equipamento.setTipo("SSD");
		equipamento.setCapacidade(512);
		equipamento.setValor(600);
		
		equipamento.setFabricante("Samsung");
		equipamento.setTipo("M2");
		equipamento.setCapacidade(1000);
		equipamento.setValor(1250);

		equipamento.setFabricante("Western Digital");
		equipamento.setTipo("HDD");
		equipamento.setCapacidade(2000);
		equipamento.setValor(300);

		System.out.println(camiseta+ "|" + calcado + "|" + jogos + " | " + equipamento);
		 
	}
}
