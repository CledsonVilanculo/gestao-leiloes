package com.cledsonvilanculo.models;

import java.util.ArrayList;

/**
 * O vendedor dos itens
 */
public class Vendedor extends Utilizador {
    private ArrayList<Integer> leiloes = new ArrayList<>();

    public Vendedor(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    /**
     * @return todos os leiloes do vendedor
     */
    public ArrayList<Integer> obterLeiloes() {
        return this.leiloes;
    }
}