package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Parte2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> masc = new ArrayList<>();
        ArrayList<String> fem = new ArrayList<>();

        System.out.print("Digite os nomes seguindo o padrão: nome1-M, nome3-F, ... : ");
        String[] dados = sc.nextLine().split(",");

        for (int i = 0; i < dados.length; i++) {
            dados[i] = dados[i].trim();
        }

        String[][] users = new String[dados.length][];
        

        for (int i = 0; i < dados.length; i++) {
            users[i] = dados[i].split("-");
        }

        System.out.println(Arrays.toString(dados));

        for (String[] user : users) {
            //System.out.println(Arrays.toString(user));
            if ("F".equals(user[1])) {
                fem.add(user[0]);
            } else if ("M".equals(user[1])) {
                masc.add(user[0]);
            } else {
                System.out.println("Os nomes devem ser escritos conforme enunciado (Nome-F ou Nome-M)");
            }
        }
        System.out.println(fem);
        System.out.println(masc);

        sc.close();
    }
}
