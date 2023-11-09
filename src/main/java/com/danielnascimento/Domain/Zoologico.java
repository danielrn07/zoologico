package com.danielnascimento.Domain;
import com.danielnascimento.Entities.Animal;
import com.danielnascimento.Interfaces.Comportamento;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            Comportamento comportamento = (Comportamento) animal;
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade() + ", Som: " + animal.emitirSom() + ", Comportamento: " +  comportamento.mover());
        }
    }
}
