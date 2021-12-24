import java.util.Scanner;

public class lab2work3 {
    public static void main(String[] args) {
        int F;
        int F1=1;
        int F2=2;
        int Fib=0;
        System.out.print("Введите число ряда Фибоначчи: ");
        int n =new Scanner(System.in).nextInt();
        System.out.print("Fibonachi:" +F1);
        System.out.print(" "+F2);
        for (int i=3; i<n ;i++){
            F=F1+F2;
            System.out.print(" "+F);
            int num = F;
                if(num >= 1000 && num <10000 ){
                Fib++;
            }
            F1=F2;
            F2=F;
        }
        System.out.println();
        System.out.println("Кол-во 4-х значных чисел :" +Fib);

    }
}
