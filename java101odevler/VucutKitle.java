import java.util.Scanner ;
public class VucutKitle {
    public static void main (String[] args) {

        double kg , boy ;

        Scanner input = new Scanner (System.in);

        System.out.print("Kilonuzu Giriniz (kilogram) : ");
        kg = input.nextDouble();

        System.out.print("Boyunuzu Giriniz (metre) : ");
        boy =input.nextDouble();

        double vucutKitle = (kg/(boy*boy)) ;

        System.out.println("Vucut Kitle Indeksiniz : " + vucutKitle) ;

    }
}