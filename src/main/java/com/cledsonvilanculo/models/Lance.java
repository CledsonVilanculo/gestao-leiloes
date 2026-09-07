package com.cledsonvilanculo.models;

import java.time.LocalDateTime;

/**
 * O lance feito por um comprador
 */
public class Lance {
    private int id;
    private Comprador autor;
    private int valor;
    private LocalDateTime hora;
    
    public Lance(int id, Comprador autor, int valor, LocalDateTime hora) {
        this.id = id;
        this.autor = autor;
        this.valor = valor;
        this.hora = hora;
    }

    /**
     * @return o ID do lance
     */
    public int obterId() {
        return this.id;
    }

    /**
     * @return o valor do lance
     */
    public int obterValor() {
        return this.valor;
    }

    /**
     * @return o autor do lance
     */
    public Comprador obteComprador() {
        return this.autor;
    }

    /**
     * @return a hora em que o lance foi feito
     */
    public LocalDateTime obterHora() {
        return this.hora;
    }
}