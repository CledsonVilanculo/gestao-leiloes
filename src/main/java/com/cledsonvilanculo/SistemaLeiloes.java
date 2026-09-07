package com.cledsonvilanculo;

import java.util.ArrayList;

import com.cledsonvilanculo.models.*;

/**
 * O core do todo o programa
 */
public class SistemaLeiloes {
    ArrayList<Utilizador> utilizadores = new ArrayList<>();
    ArrayList<Item> itensRegistados = new ArrayList<>();

    /**
     * Cria um nova conta de comprador e adiciona na lista
     * @param nome o nome do comprador
     * @param email o email do comprador
     * @param senha a senha do comprador
     * @return uma nova conta de <code>Comprador</code>
     */
    public Comprador criarContaComprador(String nome, String email, String senha) {
        if (nome == null || email == null || senha == null) {
            return null;
        }

        if (nome.length() == 0 || email.length() == 0 || senha.length() < 3) {
            return null;
        }

        int id = this.utilizadores.size() + 1;
        Comprador novoComprador = new Comprador(id, nome, email, senha);
        this.utilizadores.add(novoComprador);
        return novoComprador;
    }

    /**
     * Cria um nova conta de vendedor e adiciona na lista
     * @param nome o nome do vendedor
     * @param email o email do vendedor
     * @param senha a senha do vendedor
     * @return uma nova conta de <code>Vendedor</code>
     */
    public Vendedor criarContaVendedor(String nome, String email, String senha) {
        if (nome == null || email == null || senha == null) {
            return null;
        }

        if (nome.length() == 0 || email.length() == 0 || senha.length() < 3) {
            return null;
        }

        int id = this.utilizadores.size() + 1;
        Vendedor novoVendedor = new Vendedor(id, nome, email, senha);
        this.utilizadores.add(novoVendedor);
        return novoVendedor;
    }

    /**
     * Faz login na conta de um utilizador, verificando se o nome e a senha estao corretos
     * @param nome o nome do utilizador
     * @param senha a senha do mesmo
     * @return o <code>Utilizador</code> que tem essas credenciais
     */
    public Utilizador fazerLogin(String nome, String senha) {
        for (Utilizador utilizador : this.utilizadores) {
            if (utilizador.obterNome().equals(nome) && utilizador.obterSenha().equals(senha)) {
                return utilizador;
            }
        }

        return null;
    }

    public Item registarItem() {
        int id = this.itensRegistados.size() + 1;
        Item novoItem = new Item(0, null, null, 0);
        return novoItem;
    }
}