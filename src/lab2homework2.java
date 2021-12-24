import java.util.Scanner;

public class lab2homework2 {
    public static void main(String[] args) {
        int s;
        System.out.print("Введите число");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Все двузначные числа, кратные N : ");
        if (n > 9) {
            System.out.println("Ввели не правильное число: ");
        } else {
            for ( s = 10; s < 100; s++) {
                if ((s%n)==0){
                    System.out.print(" "+s);
                }
            }
        }
    }
}