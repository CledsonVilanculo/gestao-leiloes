package com.cledsonvilanculo.models;

/**
 * O molde de todos os utilizadoes
 */
public abstract class Utilizador {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int saldo;

    public Utilizador(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * Adiciona dinheiro na conta do utilizador
     * @param valor o valor a ser adicionada
     * @return o novo saldo
     */
    public int depositarSaldo(int valor) {
        if (valor <= 0) {
            return this.saldo;
        }

        this.saldo = valor;
        return this.saldo;
    }

    /**
     * Retira um certo valor da conta do utilizador
     * @param valor o valor a ser retirado
     * @return o novo saldo
     */
    public int retirarSaldo(int valor) {
        if (valor <= 0 || valor > this.saldo) {
            return this.saldo;
        }

        this.saldo -= valor;
        return this.saldo;
    }

    /**
     * @return o ID do utilizador
     */
    public int obterId() {
        return this.id;
    }

    /**
     * @return o nome do utilizador
     */
    public String obterNome() {
        return this.nome;
    }

    /**
     * @return o email do utilizador
     */
    public String obterEmail() {
        return this.email;
    }

    /**
     * @return a senha do utilizador
     */
    public String obterSenha() {
        return this.senha;
    }

    /**
     * @return o saldo do utilizador
     */
    public int obterSaldo() {
        return this.saldo;
    }
}