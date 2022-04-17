import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner (System.in);

        System.out.print("Matematik Notu Giriniz :");

        matematik = input.nextInt();

        System.out.print("fizik Notu Giriniz :");

        fizik = input.nextInt();
        System.out.print("kimya Notu Giriniz :");

        kimya = input.nextInt();
        System.out.print("turkce Notu Giriniz :");

        turkce = input.nextInt();
        System.out.print("tarih Notu Giriniz :");

        tarih = input.nextInt();
        System.out.print("muzik Notu Giriniz :");

        muzik = input.nextInt();

        int ort = (matematik+fizik+kimya+turkce+tarih+muzik) / 6 ;

        System.out.println("Not Ortalamasi : " + ort);

        String sonuc = ort > 60 ? "Sinifi Gectiniz": "Sinifta Kaldiniz" ;

        System.out.println(sonuc) ;

    }
}