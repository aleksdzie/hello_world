import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź pierwszą cyfrę.");
        int cyfra1=scanner.nextInt();
        System.out.println("Wprowadź drugą cyfrę.");
        int cyfra2=scanner.nextInt();
        System.out.println("Suma = "+(cyfra1+cyfra2));
    }
}
