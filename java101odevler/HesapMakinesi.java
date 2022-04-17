import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("2.Sayiyi Giriniz : ");
        n2 = input.nextInt();


        System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        System.out.print("Islem Seciminizi Yapiniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cikarma:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma:" + (n1 * n2));
                break;
            case 4:
                System.out.print(n2 == 0 ? "Gecersiz Deger Girdiniz." : "Bolme:" + (n1 / n2));
                break;
            default:
                System.out.print("Yanlis bir deger girdiniz !");

        }

    }
}