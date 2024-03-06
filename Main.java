import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число a:");
        int a = scan.nextInt();
        System.out.println("Введите целое число b:");
        int b = scan.nextInt();
        System.out.println(b);
        System.out.println("Результаты сравнения:");
        // Comparison
        if(a>b) {
            System.out.println("a>b");
        }
        if (a<b){
            System.out.println("a<b");
        }
        if (a==b){
            System.out.println("a=b");
        }

        int res1 = a + b; // Sum
        int res2 = a - b; // Subtraction a-b
        int res3 = b - a; // Subtraction b-a
        int res4 = a * b; // Multiplication
        float res5 = (float) a / b; // division a/b
        float res6 = (float) b / a; // division b/a


        System.out.println("Результы арифметических операций: ");
        System.out.println("a+b: " + res1 + "\n" + "a-b: " + res2 +"\n" + "b-a: " + res3 + "\n" +
                "a*b: " + res4 + "\n" + "a/b: " + res5 + "\n" + "b/a: " + res6);


    }
}
