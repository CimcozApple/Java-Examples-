
import java.util.Scanner;

/* Soru4: Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu
tutan hesapNo, hesaptakiPara, para yatirma ve çekme metotları olsun.
Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam
paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para
değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.
*/ 
public class DorduncuSoru{
    public static void main(String[] args) {
        BankaHesap emre=new BankaHesap(123, 500);
        BankaHesap hasan=new BankaHesap(256, 1500);
        BankaHesap burak=new BankaHesap(528, 5500);
        emre.paraCek(250);
        hasan.paraYatir(8500);
        BankaHesap.bankaOzetiGoster();
        emre.kıyasYap(hasan);
        
        
    }
}

class BankaHesap{
    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi=0;
    private static int tumHesapSayisi=0;
    private static int operasyonSayisi=0;

    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi+=hesapBakiye;
        tumHesapSayisi++;
    }
    

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }
    
    public void kıyasYap(BankaHesap kıyaslanacakHesap){
        if(this.getHesapBakiye()<kıyaslanacakHesap.getHesapBakiye()){ 
            System.out.println(this.getHesapNo()+" kişinin parası "+kıyaslanacakHesap.getHesapNo()+" lu kişinin parasından azdır. ");
            System.out.println("ID: "+this.getHesapNo()+" = "+this.getHesapBakiye()+"TL");
            System.out.println("ID: "+kıyaslanacakHesap.getHesapNo()+" = "+kıyaslanacakHesap.getHesapBakiye()+"TL");
            
        }
        else if(this.getHesapBakiye()>kıyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.getHesapNo()+" kişinin parası "+kıyaslanacakHesap.getHesapNo()+" lu kişinin parasından fazladır. ");
            System.out.println(" "+this.getHesapBakiye()+" "+kıyaslanacakHesap.getHesapBakiye() );
        }
        else{
            System.out.println(this.getHesapNo()+" kişinin parası "+kıyaslanacakHesap.getHesapNo()+" lu kişinin parasına eşittir. ");

        }
        
        
    }
    public void paraYatir(int miktar){
        this.hesapBakiye+=miktar;
        tumBankaBakiyesi+=miktar;
        operasyonSayisi++;
        
    }
    public void paraCek(int miktar){
        if(this.hesapBakiye>miktar){
            this.hesapBakiye-=miktar;
            tumBankaBakiyesi-=miktar;
            operasyonSayisi++;
            
    }
        else{
            System.out.println("Hesapta yeterli bakiye yok.");
        }
    }
    public static void bankaOzetiGoster(){
        System.out.println("Bankadaki hesap sayısı: "+tumHesapSayisi);
        System.out.println("Bankadaki toplam para: "+tumBankaBakiyesi);
        System.out.println("Bankada yapılan tüm operasyonların sayısı:"+operasyonSayisi);
    }
    
}



