import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c ;
        double u ;
        double alan ;

        Scanner input =new Scanner(System.in);

        System.out.print("a kenarini giriniz : " );
        a= input.nextInt();

        System.out.print("b kenarini giriniz : " );
        b= input.nextInt();

        System.out.print("c kenarini giriniz : ") ;
        c= input.nextInt();

        u=(a+b+c)/2 ;

        alan=Math.sqrt((u*(u-a)*(u-b)*(u-c))) ;

        System.out.println("ücgenin alanı : " + alan);

    }

}