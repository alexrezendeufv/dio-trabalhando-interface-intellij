package br.dio.inicio;

import br.dio.inicio.model.Gato;

public class primeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("alexandre", "azull", 23);
        System.out.println(gato.getNome());
        gato.setCor("Branco");
        System.out.println(gato.getCor());
    }
}
