package tarefa_m23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Testes {

    public static void main(String[] args) {
        System.out.println("Teste");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes: Ex: Ana-F,Marco-M, ...");
        String[] nomes = scanner.nextLine().split(",");

        ArrayList<String> nomeArrayList = new ArrayList<>(Arrays.asList(nomes));

        List<String> nomesFemininos = nomeArrayList.stream().filter(nome -> nome.endsWith("-F")).collect(Collectors.toList());
        List<String> nomesMasculinos = nomeArrayList.stream().filter(nome -> nome.endsWith("-M")).collect(Collectors.toList());

        scanner.close();

        System.out.println(nomesFemininos);
        System.out.println(nomesMasculinos);
    }


}
