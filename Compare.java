import java.util.Objects;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Данная программа сравнивает две строки" );
        System.out.println("Введите строку 1: ");
        String string1 = scan.next();
        System.out.println("Введите строку 2: ");
        String string2 = scan.next();
        if(Objects.equals(string1, string2)){
            System.out.println("Строки идентичны.");
        }
        else{
            System.out.println("Строки неидентичны.");
        }

    }
}