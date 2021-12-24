import java.util.Scanner;

public class lab2work2 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слогаемых: ");
     int n= in.nextInt();
        int i;
        double pi = 0;
        double num = 1;
        for ( i=0; i<n; i++){
            if (i % 2 == 0){
                pi+=(1/num);
            }else{
                pi-=(1/num);
            }
            num +=2;
        }
pi=pi*4;
      System.out.println("Ответ: "+pi);
    }
}
