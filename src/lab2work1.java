package lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class lab2work1 {
    public static void main(String[] args) {
        System.out.println("Решенние квадратного уравнения");
        System.out.println("ax^2+bx+c=0. ");
        System.out.print("a= ");
        double a = (new Scanner(System.in)).nextDouble();
        System.out.print("b= ");
        double b = (new Scanner(System.in)).nextDouble();
        System.out.print("c= ");
        double c = (new Scanner(System.in)).nextDouble();
        if (a != 0.0D && b != 0.0D && c != 0.0D) {
            double D = Math.pow(b, 2.0D) - 4.0D * a * c;
            double D1 = Math.sqrt(D);
            BigDecimal D2 = new BigDecimal(D1);
            D2 = D2.setScale(3, RoundingMode.DOWN);
            if (D < 0.0D) {
                System.out.println("Дикримминант не может быть отрицательным числом");
            } else {
                System.out.println("D=b^2-4ac; D= " + D + " Корень дискриминанта " + D2);
                if (D < 0.0D) {
                    System.out.println("Уравнение не имеет решения");
                } else {
                    BigDecimal x1x;
                    if (D == 0.0D) {
                        double x = -b / 2.0D * a;
                        x1x = new BigDecimal(x);
                        x1x = x1x.setScale(3, RoundingMode.DOWN);
                        System.out.println("Уравнение имеет один корень x= " + x1x);
                    } else if (D > 0.0D) {
                        double x1 = (-b - Math.sqrt(D)) / (2.0D * a);
                        double x2 = (-b + Math.sqrt(D)) / (2.0D * a);
                        x1x = new BigDecimal(x1);
                        x1x = x1x.setScale(3, RoundingMode.DOWN);
                        BigDecimal x2x = new BigDecimal(x2);
                        x2x = x2x.setScale(3, RoundingMode.DOWN);
                        System.out.println("Уравнение имеет два корня x1= " + x1x + " и x2= " + x2x);
                    }
                }
            }
        } else {
            System.out.println("Занчения a, b, c не должны быть равны 0");
        }

    }
}