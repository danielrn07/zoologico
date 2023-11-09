package com.danielnascimento.Entities;
import com.danielnascimento.Interfaces.Comportamento;

public class Mamifero extends Animal implements Comportamento {
    private String som;

    public Mamifero(String nome, int idade, String som) {
        super(nome, idade);
        this.som = som;
    }

    @Override
    public String emitirSom() {
        return som;
    }

    @Override
    public String mover() {
        return "Se movendo como um mamífero";
    }
}
