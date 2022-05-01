package model;

public class ProdutoBuilder {
	
    private Produto produto;
	private String categoria;
	private String nome;


    public ProdutoBuilder() {
        this.produto = new Produto();
    }
    
    public static ProdutoBuilder builder() {
        return new ProdutoBuilder();
    }
    
    public ProdutoBuilder addCategoria(String categoria) {
        this.produto.setCategoria(categoria);
        return this;
    } 
    
    public ProdutoBuilder addNome(String nome) {
        this.produto.setNome(nome);
        return this;
    } 
    
    public Produto get() {
        this.produto.setCategoria(this.categoria);
        this.produto.setNome(this.nome);
        return this.produto;
    }

}
