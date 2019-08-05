import java.util.Scanner;
/**
 * Herramienta para hallar el area de un poligono regular.
 *
 * @author (GINinja)
 * @version (07302019)
 */
public class AreaPoligono
{public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de lados del poligono: ");
        int lados = input.nextInt();
        System.out.print("Ingrese la medida de los lados: ");
        double medida = input.nextDouble();
        System.out.print("El area es: " + Area(lados, medida)+"\n");
    }
    public static double Area(int lados, double medida) {
        return (lados * (medida * medida)) / (4.0 * Math.tan((Math.PI / lados)));
    }
}
