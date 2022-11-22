import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź imię.");
        String name=scanner.nextLine();
        System.out.println("Wprowadź swój wiek.");
        int age=scanner.nextInt();
        System.out.println("Cześć, mam na imię "+name+" i mam "+age+" lat(a)");
    }
}