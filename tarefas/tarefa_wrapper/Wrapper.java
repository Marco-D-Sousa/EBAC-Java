package tarefa_wrapper;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Wrapper {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int meuInt = sc.nextInt();
            Integer meuInteger = Integer.valueOf(meuInt);

            System.out.println("\nValor do Integer: " + meuInteger);
        }
    }
}
