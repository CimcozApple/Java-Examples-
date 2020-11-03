
import java.util.Scanner;

/*  Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
Değerler A,B,C,D,E olmalı.
Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
rastgele oluşturulmalı.
Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
ve yanlışı olduğunu gösteren programı yazınız. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Toplam Öğrenci sayısını giriniz: ");
        int ogreciSayisi=scanner.nextInt();
        
        System.out.print("Toplam soru sayısını giriniz: ");
        int soruSayisi=scanner.nextInt();
        
        char tumCevaplar[][]=new char[ogreciSayisi][soruSayisi];
        char cevapAnahtari[]=new char[soruSayisi];
        cevapAnahtariOlustur(cevapAnahtari);
        ogrenciCevaplariniYerlestir(tumCevaplar,ogreciSayisi,soruSayisi);
        System.out.println("Cevap Anahtarı:");
        cevapAnahtariniGoruntule(cevapAnahtari);
        System.out.println("Öğrencilerin vredikleri cevaplar:");
        ogrenciCevaplariniGoruntule(tumCevaplar);
        ogrenciDegerlendir(cevapAnahtari,tumCevaplar,ogreciSayisi,soruSayisi);
        


        }
    
    private static void cevapAnahtariniGoruntule(char[] cevapAnahtari) {
        for (char secenek : cevapAnahtari){
            System.out.print(secenek+",");
        }
            System.out.println();
    }
    
    private static void ogrenciCevaplariniGoruntule(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
            System.out.print(tumCevaplar[satir][sutun]+ ",");
        }
            System.out.println();
     }
 }

    
    

    public static void cevapAnahtariOlustur(char[] cevapAnahtari) {
        for(int i=0;i<cevapAnahtari.length;i++){
            cevapAnahtari[i]=cevapOlustur();
            }
        }
    public static void ogrenciCevaplariniYerlestir(char tumcevaplar[][],int ogrenciSayisi,int soruSayisi){
        for (int i = 0; i < ogrenciSayisi; i++) {
            for (int j = 0; j < soruSayisi; j++) {
                tumcevaplar[i][j]=cevapOlustur();   
            }
        }
       }
    public static char cevapOlustur(){
        int rastgeleSayi=65+(int)(Math.random()*5);//0 1 2 3 4
        char uretilenSecenek=(char)rastgeleSayi;
        return uretilenSecenek;
        }

   
 static void ogrenciDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar,int ogrenciSayisi,int soruSayisi) {
        for (int i = 0; i < ogrenciSayisi; i++) {
            int dogruCevapSayisi=0;
            for (int j = 0; j < soruSayisi; j++) {
                  if(tumCevaplar[i][j]==cevapAnahtari[j]){
                      dogruCevapSayisi++;
                  }
            }
            System.out.println(i+" . indexde ki öğrencinin doğru cevap sayisi: "+ dogruCevapSayisi);
        }
        
    }
    }
   
    

