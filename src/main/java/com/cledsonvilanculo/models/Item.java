package com.cledsonvilanculo.models;

/**
 * O item a ser vendido no leilao
 */
public class Item {
    private int id;
    private String nome;
    private String descricao;
    private int precoInicial;
    private Vendedor vendedor;
    
    public Item(int id, String nome, String descricao, int precoInicial) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoInicial = precoInicial;
    }

    /**
     * @return o ID do item
     */
    public int obterId() {
        return this.id;
    }

    /**
     * @return o nome do item
     */
    public String obterNome() {
        return this.nome;
    }

    /**
     * @return a descricao do item
     */
    public String obterDescricao() {
        return this.descricao;
    }

    /**
     * @return o preco inicial do item
     */
    public int obterPrecoInicial() {
        return this.precoInicial;
    }

    /**
     * @return vendedor do item
     */
    public Vendedor obterVendedor() {
        return this.vendedor;
    }
}