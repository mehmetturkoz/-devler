
import java.util.Scanner;
public class Burc {
    public static void main(String[] args){


        int ay,gun;
        Scanner input=new Scanner(System.in);
        System.out.print("Dogdugunuz Ay'i Giriniz:");
        ay= input.nextInt();
        System.out.print("Dogdugunuz Gun'u Giriniz");
        gun= input.nextInt();

        if((ay>12 || ay<1) || (gun>31 || gun<1)){
            System.out.println("Gecersiz deger girdiniz.Tekrar deneyiniz");
        }
        else if( (ay==12 && gun>=22)||(ay==1 && gun<=21) ){
            System.out.println("Oglak");
        }
        else if ( (ay==1 && gun>=22)||(ay==2 && gun<=19) ){
            System.out.println("Kova");
        }
        else if ( (ay==2 && gun>=20)||(ay==3 && gun<=20) ){
            System.out.println("Balik");
        }
        else if ( (ay==3 && gun>=22)||(ay==4 && gun<=19) ){
            System.out.println("Koc");
        }
        else if ( (ay==4 && gun>=22)||(ay==5 && gun<=19) ){
            System.out.println("Boga");
        }
        else if ( (ay==5 && gun>=22)||(ay==6 && gun<=19) ){
            System.out.println("Ikizler");
        }
        else if ( (ay==6 && gun>=22)||(ay==7 && gun<=19) ){
            System.out.println("Yengec");
        }
        else if ( (ay==7 && gun>=22)||(ay==8 && gun<=19) ){
            System.out.println("Aslan");
        }
        else if ( (ay==8 && gun>=22)||(ay==9 && gun<=19) ){
            System.out.println("Basak");
        }
        else if ( (ay==9 && gun>=22)||(ay==10 && gun<=19) ){
            System.out.println("Terazi");
        }
        else if ( (ay==10 && gun>=22)||(ay==11 && gun<=19) ){
            System.out.println("Akrep");
        }
        else if ( (ay==11 && gun>=22)||(ay==12 && gun<=21) ){
            System.out.println("Yay");
        }


    }
}
