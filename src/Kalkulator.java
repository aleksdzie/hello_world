import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź pierwszą cyfrę.");
        int cyfra1=scanner.nextInt();
        System.out.println("Wprowadź drugą cyfrę.");
        int cyfra2=scanner.nextInt();
        if(cyfra1>cyfra2&&cyfra1<5){
            System.out.println(cyfra1+"jest mniejsza od 5");
        }
        else{
            System.out.println("Nie wiem co to jest:)");
        }
    }
}
