import java.util.Scanner ;
public class Daire {
    public static void main (String[] args)  {

        int r ;
        double pi = 3.14 ;
        double alan , cevre ;

        Scanner input =new Scanner(System.in);

        System.out.print("Dairenin Yaricapini Giriniz : ");

        r = input.nextInt();

        alan = pi * r *r ;
        cevre = 2 * pi * r ;

        System.out.println("Dairenin Alani :" + alan );
        System.out.println("Dairenin Cevresi : " + cevre);

        // ödev kısmı
        int aci ;

        System.out.print("Merkez Acisi Olcusunu Giriniz : ") ;
        aci = input.nextInt();

        double daireDilimAlan = ((pi*(r*r))*aci)/360 ;

        System.out.println("Merkez Acisi a Olan Daire Dilimi Alani : " + daireDilimAlan );


    }
}