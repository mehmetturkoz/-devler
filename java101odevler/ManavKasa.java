import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        int kgArmut,kgElma,kgDomates,kgMuz,kgPatlican ;
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.0;

        Scanner inp1 =new Scanner(System.in);
        System.out.print("Armut Kac Kg : ");
        kgArmut = inp1.nextInt();

        Scanner inp2 =new Scanner(System.in);
        System.out.print("Elma Kac Kg : ");
        kgElma = inp2.nextInt();

        Scanner inp3 =new Scanner(System.in);
        System.out.print("Domates Kac Kg : ");
        kgDomates = inp3.nextInt();

        Scanner inp4 =new Scanner(System.in);
        System.out.print("Muz Kac Kg : ");
        kgMuz = inp4.nextInt();

        Scanner inp5 =new Scanner(System.in);
        System.out.print("Patlican Kac Kg : ");
        kgPatlican = inp5.nextInt();

        double toplam = (kgArmut*armut)+(kgElma*elma)+(kgDomates*domates)+(kgMuz*muz)+(kgPatlican*patlican);


        System.out.println("Toplam Tutar : " + toplam);

    }

}