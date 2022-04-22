import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args){

        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Yil Giriniz:");
        year=input.nextInt();

        if( ( (year%4==0) && !(year%100==0) ) || year%400==0){
            System.out.print(year+" artik bir yildir.");
        }else{
            System.out.println(year+" artik bir yil degildir.");
        }

    }
}
