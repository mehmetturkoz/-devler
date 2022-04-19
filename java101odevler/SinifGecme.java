import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args){

        int matematik,fizik,turkce,kimya,muzik;
        double ortalama;
        int n =0;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik=input.nextInt();
        if(matematik<0 || matematik>100 ){
            matematik=0;
            n++;
        }
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik=input.nextInt();
        if(fizik<0 || fizik>100 ){
            fizik=0;
            n++;
        }System.out.print("Tukce Notunuzu Giriniz:");
        turkce=input.nextInt();
        if(turkce<0 || turkce>100 ){
            turkce=0;
            n++;
        }
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya=input.nextInt();
        if(kimya<0 || kimya>100 ){
            kimya=0;
            n++;
        }
        System.out.print("Muzik Notunuzu Giriniz:");
        muzik=input.nextInt();
        if(muzik<0 || muzik>100 ){
            muzik=0;
            n++;
        }

        ortalama=(matematik+fizik+turkce+kimya+muzik)/(5-n);
        System.out.println("Ortalamaniz:"+ortalama);
        if(ortalama>55){
            System.out.println("Sinifi Gectiniz");
        }
        else{
            System.out.println("Sinifta Kaldiniz");

        }
    }
}

