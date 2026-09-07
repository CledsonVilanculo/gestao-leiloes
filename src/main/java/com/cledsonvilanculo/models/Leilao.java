package com.cledsonvilanculo.models;

import java.util.Stack;

/**
 * O leilao contendo o item a ser disputado e os seus lances
 */
public class Leilao {
    private int id;
    private Item item;
    private Stack<Lance> lances = new Stack<>();
    private int valorAtual;
    
    /**
     * Calcula qual e melhor lance ate o momento
     * @return o lance com o valor mais alto
     */
    public Lance obterLanceMaisAlto() {
        Lance maiorLance = this.lances.peek();
        for (Lance lance : this.lances) {
            if (lance.obterValor() > maiorLance.obterValor()) {
                maiorLance = lance;
            }
        }

        return maiorLance;
    }

    /**
     * @return todos os lances do leilao
     */
    public Stack<Lance> obterLances() {
        return this.lances;
    }

    /**
     * @return o ID do leilao
     */
    public int obterId() {
        return this.id;
    }

    /**
     * @return o item do leilao
     */
    public Item obterItem() {
        return this.item;
    }

    /**
     * @return o valor atual (o mais alto) do leilao
     */
    public int obterValorAtual() {
        return this.valorAtual;
    }
}