import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello, R" + name + ", nice to meet you!");
    }
}
