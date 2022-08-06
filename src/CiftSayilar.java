import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        int a, total = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Bir sayi giriniz:");
            a = inp.nextInt();
            if (a % 4 == 0) {
                total += a;
            }
        } while (a % 2 == 0);
        System.out.println("Toplam:" + total);
    }
}
