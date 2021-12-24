import java.util.Scanner;

public class lab2work4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,cos, x2, q;
        int i, c, b,d,a;
        System.out.println("Введите x: ");
        x = in.nextDouble();
        System.out.println("Введите  q: ");
        q = in.nextDouble();
        in.close();
        x2 = x * x;
        cos = 1;
        a=1;
        b=-1;
        c=2;
        d=2;


        while ((x2 / c) >= q)
        {
            cos = cos + b * x2 / c;
            a=a+1;
            d=d+2;
            x2=x2*x*x;
            c=c*(d-1)*d;
        b=b*(-1);
        }
        d = d / 2 + 1;
        x = Math.cos(cos);
        System.out.println("Количество слагаемых = " + d);
        System.out.println("Значение cos(x) = " + cos);
        System.out.println("Значение x = " +x ) ;

    }
}
