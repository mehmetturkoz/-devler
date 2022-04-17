import java.util.Scanner ;
public class Taksimetre {
    public static void main (String[] args) {

        int km ;
        int acilis = 10 ;
        double kmucreti = 2.20 ;
        double ucret ;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen km mesafesini giriniz : ") ;
        km = input.nextInt();

        ucret = acilis + km * kmucreti ;

        ucret = ucret < 20 ? 20 : ucret ;

        System.out.println("Odenecek Ucret : " + ucret );


    }
}