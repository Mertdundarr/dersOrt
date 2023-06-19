import java.util.Scanner;
public class dersOrtalaması {
    public static void main(String[] args) {
        // Scanner sınıfımızı tanımla
        Scanner inp = new Scanner(System.in);

        // Değişkenleri oluştur
        double mat , fizik , kimya , turkce , tarih  , muzik  ;
        double mat2, fizik2, kimya2, turkce2, tarih2, muzik2 ;

        // Kullanıcı değerleri
        System.out.println("Matematik Vize Notunuz Giriniz:");
        mat = inp.nextDouble();
        System.out.println("Matematik final Notunuz Giriniz :");
        mat2 = inp.nextDouble();

        System.out.println("Vize notum: " + mat);
        System.out.println("Final notum: " + mat2);

        double matOrt = mat * 0.4;
        double matOrt2 = mat2 * 0.6;

        System.out.println("Matamatik Ortalaması : " + matOrt+matOrt2 );

        if (matOrt+matOrt2>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }

        fizik = inp.nextDouble();
        System.out.println("Fizik vize Notunuzu Giriniz :" + fizik);

        fizik2= inp.nextDouble();
        System.out.println("Fizik final Notunuzu Giriniz :" + fizik2);


        double fizikOrt = fizik * 0.4;
        double fizikOrt2 = fizik2 * 0.6;
        System.out.println("Fizik Ortalamsı : "+ fizikOrt+fizikOrt2 );

        if (fizikOrt+fizikOrt2>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }



        kimya = inp.nextDouble();
        System.out.println("Kimya vize Notunuzu Giriniz :" + kimya);
        kimya2= inp.nextDouble();
        System.out.println("Kimya Final Notunuzu Giriniz :"+ kimya2);

        double kimyaOrt = kimya * 0.4;
        double kimya2Ort = kimya2 * 0.6;

        System.out.println("Kimya Ortalaması : " + kimyaOrt+kimya2Ort );

        if (kimyaOrt+kimya2Ort>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }

        turkce = inp.nextInt();
        System.out.println("Türkçe vize Notunuzu Giriniz :" + turkce);

        turkce2= inp.nextInt();
        System.out.println("Türkçe Final Notunuzu Giriniz :" + turkce2);

        double turkceOrt = turkce * 0.4;
        double turkce2Ort = turkce2 * 0.6;


        System.out.println("Türkçe Ortalamanız :" + turkceOrt+turkce2Ort);

        if (turkceOrt+turkce2Ort>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }


        tarih = inp.nextInt();
        System.out.println("Tarih  vize  Notunuzu Giriniz :" + tarih);

        tarih2= inp.nextInt();
        System.out.println("Tarih Final Notunuzu Giriniz :" + tarih2) ;

        double tarihOrt = tarih * 0.4;
        double tarih2Ort = tarih2 * 0.6;

        System.out.println("Tarih Ortalaması : " + tarihOrt+tarih2Ort);

        if (tarihOrt+tarih2Ort>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }

        muzik= inp.nextInt();
        System.out.println("Müzik vize Notunuzu Giriniz :" + muzik);
        muzik2= inp.nextInt();
        System.out.println("Müzik Final Notunuzu Giriniz :" + muzik2);

        double muzikOrt = muzik * 0.4;
        double muzik2Ort = muzik2 * 0.6;

        System.out.println("Müzik Ortalması : " + muzikOrt + muzik2Ort);

        if (muzikOrt+muzik2Ort>=60){
            System.out.println("Dersten Geçtiniz : :) ");

        }else{
            System.out.println("Dersten Kaldınız : :(");
        }





    }
}
