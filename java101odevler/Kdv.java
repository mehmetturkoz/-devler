import java.util.Scanner;
public class Kdv {

    public static void main(String[] args) {

        double tutar ;
        double kdvOran = 0.18 ;
        double kdvTutari ;
        double kdvliTutar;

        Scanner input = new Scanner (System.in) ;

        System.out.print("Tutari Giriniz :") ;
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOran ;
        kdvliTutar =tutar + kdvTutari ;

        // Eğer tutar 0 dan büyük ve  1000 den küçük ise kdv oranını %18 al , değilse büyükse %8 al
        kdvOran = ( tutar > 0 && tutar < 1000 ) ? 0.18 : 0.08 ;

        System.out.println("KDVsiz Tutar :"+ tutar);
        System.out.println("KDV Orani :"+ kdvOran);
        System.out.println("KDV Tutari :"+ kdvTutari);
        System.out.println("KDVli Tutar :"+ kdvliTutar);

    }

}