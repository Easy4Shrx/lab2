import java.util.Scanner;

public class lab3work6 {
    public static void main(String[] args) {
        System.out.print("Введите количество лет: ");
        int n = new Scanner(System.in).nextInt();
        int edn = n%10;
        int dest=(n/10)%10;
        String year ="лет";
        if (dest!=1 && edn==1){
            year="год";
        }else if (dest!=1 && edn>=2 && edn<=4){
            year="года";
        }else {

        }
    System.out.println("Вам "+n+" "+year);
    }
}
