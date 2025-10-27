package br.com.db.desafios.desafio14_excluirnome;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.addAll(Arrays.asList("Miguel", "Arthur", "Gabriel", "José", "João", "Antonio", "Francisco", "Carlos", "Bernardo", "Benjamin", "Joaquim", "Helena", "Alice", "Laura", "Manuela", "Valentina", "Miguel", "Arthur", "Gabriel", "José"));

        Set<String> removeDuplicatas = new HashSet<>(nomes);
        nomes = new ArrayList<>(removeDuplicatas);

        System.out.println(nomes);

    }
}
