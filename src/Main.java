import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        summa();
        System.out.println("hello");

    }  public static void summa(){
    Scanner scanner=new Scanner(System.in);
    int number= scanner.nextInt();
    int hundred=number/100;
    int ten=(number/10)%10;
    int zero=number%10;
    int sum=(hundred+ten+zero);
    System.out.println(hundred+"+"+ten+"+"+zero+"="+sum);


    }







}






















