import java.util.Scanner;

public class lab2homework1 {
    public static void main(String[] args) {
System.out.print("Введите минуты : ");
int min  = new Scanner(System.in).nextInt();
System.out.print("Введите секунды : ");
int sec = new Scanner(System.in).nextInt();
if(min>60 || sec>60) {
    System.out.println("Ввели некорректные данные " );
}else if (min<10 && sec<10){
    System.out.println("0"+min+":"+"0"+sec);
}else if (min<10){
    System.out.println("0"+min+":"+sec);
}else if (sec<10){
    System.out.println(min+":"+"0"+sec);
}else {
    System.out.println(min+":"+sec);
}
    }
}

