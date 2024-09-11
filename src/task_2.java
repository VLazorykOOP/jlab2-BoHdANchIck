import java.util.Scanner;
import MyClasses.Cube;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        Cube objCube = new Cube(a);

        System.out.println("S = " + objCube.S(a));
        System.out.println("V = " + objCube.V(a));
        System.out.println("D = " + objCube.D(a));
        scanner.close();
    }
}
