import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int a, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz:");
            a = input.nextInt();
            if (a % 2 == 1) {
                total += a;
            }

        } while (a >= 0);
        System.out.println("toplam:"+total);

    }
}
