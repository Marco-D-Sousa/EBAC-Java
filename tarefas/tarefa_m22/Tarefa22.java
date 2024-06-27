package tarefa_m22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Tarefa22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes: Ex: Ana-F,Marco-M, ...");
        String[] nomes = scanner.nextLine().split(",");
        ArrayList<String> nomeArrayList = new ArrayList<>();

        nomeArrayList.addAll(Arrays.asList(nomes));

        List<String> nomesFemininos = nomeArrayList.stream().filter(nome -> nome.endsWith("-F")).collect(Collectors.toList());
        List<String> nomesMasculunos = nomeArrayList.stream().filter(nome -> nome.endsWith("-M")).collect(Collectors.toList());

        scanner.close();

        System.out.println(nomesFemininos);
        System.out.println(nomesMasculunos);
    }
}
