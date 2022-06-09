import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları
ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
         */
        Scanner manav = new Scanner(System.in);
        double armutKilo = 2.14,elmaKilo = 3.67,domatesKilo=1.11,muzKilo=0.95,patlıcanKilo=5.00,toplamtutar;
        int a,e,d,m,p;
        System.out.print("Armut Kac Kilo ? : ");
        a = manav.nextInt();
        System.out.print("Elma Kac Kilo ? : ");
        e = manav.nextInt();
        System.out.print("Domates Kac Kilo ? : ");
        d = manav.nextInt();
        System.out.print("Muz Kac Kilo ? : ");
        m = manav.nextInt();
        System.out.print("Patlican Kac Kilo ? : ");
        p = manav.nextInt();
        toplamtutar = (armutKilo*a)+(elmaKilo*e)+(domatesKilo*d)+(muzKilo*m)+(patlıcanKilo*p);
        System.out.println("Toplam Tutar : "+ toplamtutar);



    }
}
