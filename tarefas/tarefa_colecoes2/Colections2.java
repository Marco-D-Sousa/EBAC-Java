package tarefa_colecoes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Colections2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> masc = new ArrayList<>();
        ArrayList<String> fem = new ArrayList<>();
        Boolean proceed = true;

        while (proceed) {
            System.out.print("Digite o nome desejado ou digite 0 para encerar. (ex: Nome-F): ");
            String[] dados = sc.nextLine().split("-");

            if ("0".equals(dados[0])) {
                proceed = false;
            } else if ("M".equals(dados[1])) {
                masc.add(dados[0]);
            } else if ("F".equals(dados[1])) {
                fem.add(dados[0]);
            } else {
                System.out.println("O nome deve ser escrito no padrão: Nome-M ou Nome-F");
            }
        }
        sc.close();
        
        Collections.sort(fem);
        Collections.sort(masc);
        
        System.out.println("\nMasculinos:");
        if (!masc.isEmpty()) {
            for (Object nome : masc) {
                System.out.println(nome);
            }
        } else {
            System.out.println("- Nenhum nome");
        }

        System.out.println("\nFemininos:");
        if (!fem.isEmpty()) {
            for (Object nome : fem) {
                System.out.println(nome);
            }
        } else {
            System.out.println("- Nenhum nome");
        }
    }
}
