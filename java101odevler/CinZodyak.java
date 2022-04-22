import java.util.Scanner;
public class CinZodyak {
    public static void main(String[] args){
        int dogumYili;

        Scanner input=new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz:");
        dogumYili=input.nextInt();

        int cinZodyak=dogumYili%12;

        switch (cinZodyak){
            case 0:
                System.out.print("Cin Zodyagi Burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Cin Zodyagi Burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Cin Zodyagi Burcunuz: Kopek");
                break;
            case 3:
                System.out.print("Cin Zodyagi Burcunuz: Donuz");
                break;
            case 4:
                System.out.print("Cin Zodyagi Burcunuz: Fare");
                break;
            case 5:
                System.out.print("Cin Zodyagi Burcunuz: Okuz");
                break;
            case 6:
                System.out.print("Cin Zodyagi Burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Cin Zodyagi Burcunuz: Tavsan");
                break;
            case 8:
                System.out.print("Cin Zodyagi Burcunuz: Ejderha");
                break;
            case 9:
                System.out.print("Cin Zodyagi Burcunuz: Yilan");
                break;
            case 10:
                System.out.print("Cin Zodyagi Burcunuz: At");
                break;
            case 11:
                System.out.print("Cin Zodyagi Burcunuz: Koyun");
                break;

            default:
                System.out.print("Yanlis bir giris yaptiniz. Lutfen tekrar deneyiniz.");
                break;

        }
    }
}
