import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create variables
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        // Get the Informations from users
        System.out.print("Matematik dersi notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik dersi notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya dersi notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe dersi notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("tarih dersi notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik dersi notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;
        System.out.println("Not Ortalamanız: " + sonuc + ((sonuc >= 60) ? " - Geçtiniz!" : " - Kaldınız!"));

    }
}
