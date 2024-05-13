import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ControleFluxo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double val1 = sc.nextDouble();

        System.out.print("Digite a primeira nota: ");
        double val2 = sc.nextDouble();

        System.out.print("Digite a primeira nota: ");
        double val3 = sc.nextDouble();

        System.out.print("Digite a primeira nota: ");
        double val4 = sc.nextDouble();

        double media = calculaMedia(val1, val2, val3, val4);

        if (media >= 7) {
            System.out.println("\nAprovado - Média: " + media);
        } else if (media >= 5){
            System.out.println("\nRecuperação - Média: " + media);
        } else {
            System.out.println("\nReprovado - Média: " + media);
        }
    }

    public static double calculaMedia(double val1, double val2, double val3, double val4) {
        return (val1 + val2 + val3 + val4) / 4;
    }
}
