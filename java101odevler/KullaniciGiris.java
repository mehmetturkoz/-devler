import java.util.Scanner;
public class KullaniciGiris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi = "patika";
        String sifre = "java123";

        String username, password;
        System.out.print("Kullanici adinizi giriniz:");
        username = input.next();
        System.out.print("Sifrenizi giriniz:");
        password = input.next();

        if (kullaniciAdi.equals(username) && sifre.equals(password)) {
            System.out.println("Giris Yapildi");

        }   else {
            System.out.println("Sifreniz yanlis.Yenilemek ister misiniz?");
            System.out.println("1-EVET\n 2-HAYIR");
            System.out.print("Lütfen Seciminizi Giriniz:");
        }
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.print("Yeni Sifrenizi Giriniz:");
                String newPassword = input.next();
                if(newPassword.equals(sifre)) {
                    System.out.println("Yeni Sifreniz Eski Sifre ile Ayni Olamaz!!");
                    System.out.println("Sifreniz Degistirilemedi");
                } else {
                    System.out.println("Sifreniz Degistirildi");
                }
                break;
            case 2:
                System.out.println("Sifreniz Degistirilemedi.");
                break;
        }
    }
}