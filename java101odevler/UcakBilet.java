import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args){
        int mesafe,yas,yolculukTipi;
        double kmUcret=0.10;
        double oran12=0.50;
        double oran24=0.10;
        double oran65=0.30;
        double yasIndirimi;
        double indirimliTutar;
        double toplamTutar;
        double gidisDonus;


        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi (km) Giriniz: ");
        mesafe= input.nextInt();

        System.out.print("Yasinizi Giriniz : ");
        yas=input.nextInt();

        System.out.print("Yoculuk Tipini Giriniz(1-Tek Yon veya 2-Gidis Donus) : ");
        yolculukTipi=input.nextInt();

        double normalTutar=mesafe*0.10;


        if(!(((mesafe>0 && yas>=0)) && ((yolculukTipi==1) || (yolculukTipi==2)))) {
            System.out.println("Hatali Deger Girdiniz!!");
        }else{
            switch (yolculukTipi){
                case 1:
                    if(yas<12){
                        yasIndirimi=normalTutar*oran12;
                        indirimliTutar=normalTutar-yasIndirimi;
                        toplamTutar=indirimliTutar;
                        System.out.print("Toplam Tutar:"+toplamTutar);
                    }else if(yas>=12 && yas<24){
                        yasIndirimi=normalTutar*oran24;
                        indirimliTutar=normalTutar-yasIndirimi;
                        toplamTutar=indirimliTutar;
                        System.out.print("Toplam Tutar:"+toplamTutar);
                    }else if(yas>65){
                        yasIndirimi=normalTutar*oran65;
                        indirimliTutar=normalTutar-yasIndirimi;
                        toplamTutar=indirimliTutar;
                        System.out.print("Toplam Tutar:"+toplamTutar);
                    }else {
                        toplamTutar = normalTutar;
                        System.out.print("Toplam Tutar:" + toplamTutar);
                    }
                    break;

                case 2:
                    if(yas<12){
                        yasIndirimi=normalTutar*oran12;
                        indirimliTutar=normalTutar-yasIndirimi;
                        gidisDonus=indirimliTutar*0.20;
                        toplamTutar=(indirimliTutar-gidisDonus)*2;
                        System.out.print("Toplam Tutar:"+toplamTutar);
                    }else if(yas>=12 && yas<24) {
                        yasIndirimi = normalTutar * oran24;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonus = indirimliTutar * 0.20;
                        toplamTutar = (indirimliTutar - gidisDonus) * 2;
                        System.out.print("Toplam Tutar:" + toplamTutar);
                    }else if(yas>65){
                        yasIndirimi=normalTutar*0.30;
                        indirimliTutar=normalTutar-yasIndirimi;
                        gidisDonus=indirimliTutar*0.20;
                        toplamTutar=(indirimliTutar-gidisDonus)*2;
                        System.out.print("Toplam Tutar:"+toplamTutar);
                    }else {
                        gidisDonus = normalTutar * 0.20;
                        toplamTutar = (normalTutar - gidisDonus) * 2;
                        System.out.print("Toplam Tutar:" + toplamTutar);
                    }
                    break;

            }
        }
    }
}
