import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Parte1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os nomes desejados divididos por ',': ");
        String[] dados = sc.nextLine().split(",");

        for (int i = 0; i < dados.length; i++) {
            dados[i] = dados[i].trim();
        }

        Arrays.sort(dados);

        for (Object nome : dados) {
            System.out.println(nome);
        }
    }
}
