import java.util.Scanner;

/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);

        int mat, fiz, tur, kimya, muz, count = 0, toplam=0, ort = 0;
        System.out.println("Not Hesaplama Programina Hos geldiniz!");
        System.out.println("Lutfen Matematik notunuzu giriniz: ");
        mat = yazici.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            count++;
        }
        System.out.println("Lutfen Fizik notunuzu giriniz: ");
        fiz = yazici.nextInt();
        if (fiz >= 0 && fiz <= 100) {
            toplam += mat;
            count++;
        }
        System.out.println("Lutfen Turkce notunuzu giriniz: ");
        tur = yazici.nextInt();
        if (tur >= 0 && tur <= 100) {
            toplam += mat;
            count++;
        }
        System.out.println("Lutfen Kimya notunuzu giriniz: ");
        kimya = yazici.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += mat;
            count++;
        }
        System.out.println("Lutfen Muzik notunuzu giriniz: ");
        muz = yazici.nextInt();
        if (muz >= 0 && muz <= 100) {
            toplam += mat;
            count++;
        }
        if (count == 0)
            System.out.println("Hatali girisler yaptiniz. Ortalama hesaplanamadi" +
                    " sayfayi yenileyiniz.");
        else {
            ort = toplam / count;
        }
        if (ort >= 55) {
            System.out.println("Sinifi gectiniz, tebrikler!");
            System.out.println("Ortalamaniz: "+ort);
        } else if (count == 0) {

        } else if (ort < 50) {
            System.out.println("Sinifta kaldiniz!");

        }


    }
}
