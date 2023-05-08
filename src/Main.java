import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan kenar uzunluklarını alalım.
        System.out.print("1. Kenar uzunluğunu giriniz : ");
        double a = girdi.nextDouble();
        System.out.print("2. Kenar uzunluğunu giriniz : ");
        double b = girdi.nextDouble();
        System.out.print("3. Kenar uzunluğunu giriniz : ");
        double c = girdi.nextDouble();

        // Çevre hesabı
        double u = (a + b + c) / 2;

        //Alan hesabı
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        //Sonucu yazdırın.
        System.out.println("Üçgenin alanı : " + alan);

        girdi.close();
    }
}