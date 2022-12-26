import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, fiyat;
        int yas, yolculukTipi;

        System.out.print("Mesafe (km) Giriniz : ");
        km = input.nextInt();

        fiyat = 0.1*km;

        System.out.print("Yaş Giriniz : ");
        yas = input.nextInt();

        System.out.println("1-Tek Yön\n2-Gidiş Geliş");
        System.out.print("Seçim  Giriniz : ");
        yolculukTipi = input.nextInt();

        if(yolculukTipi==1) {
            if (yas < 12) {
                fiyat = (0.1 * km) / 2;
            } else if (yas >= 12 && yas <= 24) {
                fiyat = (0.1 * km) * 0.9;

            } else if (yas > 65) {
                fiyat = (0.1 * km) * 0.7;
            } else {
                fiyat = (0.1 * km);
            }
            System.out.println("Toplam Tutar: " + fiyat + "TL");
        }

        else if(yolculukTipi==2) {
                if (yas < 12) {
                    fiyat = 2 * ((0.1 * km) / 2) * 0.8;
                } else if (yas < 24 && yas > 12) {
                    fiyat = 2 * ((0.1 * km) * 0.9) * 0.8;
                } else if (yas > 65) {
                    fiyat = 2 * ((0.1 * km) * 0.7) * 0.8;
                } else {
                    fiyat = 2 * (0.1 * km) * 0.8;
                }
                System.out.println("Toplam Tutar: " + fiyat + "TL");
        }

        else if((yolculukTipi!=2)||(yolculukTipi!=1)||(yas<0)||(km<0)){
            System.out.println("Hatalı Girdiniz !");
        }
    }
}