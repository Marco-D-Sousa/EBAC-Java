package tarefa_m23.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestesTest {

    @Test
    void separarNomesFemininos() {
        String[] nomes = {"Ana-F", "Marco-M", "Xunda-M", "Fulana-F"};
        List<String> nomesFemininosEsperados = Arrays.asList("Ana-F", "Fulana-F");

        List<String> nomesFemininos = new ArrayList<>(Arrays.asList(nomes)).stream().filter(nome -> nome.endsWith("-F")).toList();

        Assertions.assertEquals(nomesFemininosEsperados, nomesFemininos);
    }

    @Test
    void separarNomesMasculinos() {
        String[] nomes = {"Ana-F", "Marco-M", "Xunda-M", "Fulana-F"};
        List<String> nomesMasculinosEsperados = Arrays.asList("Marco-M", "Xunda-M");

        List<String> nomesMasculinos = new ArrayList<>(Arrays.asList(nomes)).stream().filter(nome -> nome.endsWith("-M")).toList();

        Assertions.assertEquals(nomesMasculinosEsperados, nomesMasculinos);
    }
}