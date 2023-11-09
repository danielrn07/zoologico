package com.danielnascimento;
import com.danielnascimento.Domain.*;
import com.danielnascimento.Entities.*;

public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        Mamifero cachorro = new Mamifero("Cachorro", 8, "Au au");
        Ave galinha = new Ave("Galinha", 3, "Có có");
        Reptil cobra = new Reptil("Cobra", 2, "ssssss");

        zoologico.adicionarAnimal(cachorro);
        zoologico.adicionarAnimal(galinha);
        zoologico.adicionarAnimal(cobra);

        System.out.println("Lista de animais do Zoológico:");
        zoologico.listarAnimais();
    }
}
