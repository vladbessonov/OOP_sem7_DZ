package Number;
import java.util.Scanner;

public class NumberReader {

    public static Number read() {

        Scanner sc = new Scanner(System.in);
        double real;
        System.out.print("Введите число: ");

        if (sc.hasNextDouble()) {
            real = sc.nextDouble();
        }
        else {
            System.out.println("Ошибка! Попробуйте снова!");
            sc.next();
            real = sc.nextDouble();
        }


        return new Number(real);

    }

}
