
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args){
        int temp;

        Scanner input =new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz :");
        temp= input.nextInt();

        String kosul1 = temp<5 ? "Kayak Yapabilirsin" : " ";
        String kosul2 = temp>=5 && temp<=15 ? "Sinemaya Gidebilirsin" : " ";
        String kosul3 = temp>15 && temp<=25 ? "Piknige Gidebilirsin" : " ";
        String kosul4 = temp>25 ? "Yuzmeye Gidebilirsin" : " ";

        System.out.println(kosul1+kosul2+kosul3+kosul4);

    }
}
