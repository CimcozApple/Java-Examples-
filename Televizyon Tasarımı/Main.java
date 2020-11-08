
import java.util.Scanner;
public class Main {
    static Scanner scanner=new Scanner(System.in);// Herhangi bir nesne üretmeden kullanmak için static tanımladık.
    static Televizyon tv;
    public static void main(String[] args) {
        menuGoster();
        boolean cıkıs=false;
        
        
        
        while (cıkıs==false) {
            System.out.print("Seçiminiz(Menüyü tekrar görmek için 8'i tuşlayınız)= ");
            int secim= scanner.nextInt();
            if (secim==1) {
                tvKurveKanallarıOLustur();
            }
            
            else if (secim==2) {
                televizyonAc();
            }
            
            else if(secim==3){
                televizyonSesArttır();
            }
            
             else if(secim==4){
                televizyonSesAzalt();
            }
             
             else if(secim==5){
                kanalDegistir();
            }
             
             else if(secim==6){
                kanalBilgisiGoster();
            }


             
            else if(secim==7){
                televizyonKapat();
            }
            
            else if (secim==8) {
                menuGoster();
            }
            
            else if (secim==0){
                cıkıs=true;
                System.out.println("Tv kapandı.");
                break;
            }
            
            else{
                System.out.println("Hatalı tuşlama !. 0 ile 8 arasında bir tuşlama yapınız");
            }
            
        }
    }
    
    
    
    

    private static void menuGoster() {
        System.out.println("*************MENÜ*************");
        String menu="0--Çıkış\n"
                + "1--Televizyonu Kur\n"
                + "2--Televizyonu Aç\n"
                + "3--Sesi Arttır\n"
                + "4--Sesi Azalt\n"
                + "5--Kanal Değiştir\n"
                + "6--Kanal Bilgisini Göster\n"
                + "7--Televizyonu Kapat\n"
                + "8--Menüyü Göster\n";
        System.out.println(menu);
                
    }

    private static void tvKurveKanallarıOLustur() {
        scanner.nextLine();
        if(tv==null){  
            System.out.print("Televizyonun markasını giriniz:  ");
            String marka=scanner.nextLine();
            System.out.print("Televizyonun boyutunu giriniz: ");
            String inc=scanner.nextLine();
            tv=new Televizyon(marka, inc);
            System.out.println(tv);
            
            
        }
        else{
            System.out.println("Televizyon zaten oluşturuldu. "+tv);
        }
        
        
        
    }

    private static void televizyonAc() {
        if(tv!=null){
            tv.tvAc();
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }

    private static void televizyonKapat() {
        if(tv!=null){
            tv.tvKapat();
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }

    private static void televizyonSesArttır() {
         if(tv!=null){
            tv.sesArttir();
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }
    
     private static void televizyonSesAzalt() {
         if(tv!=null){
            tv.sesAzalt();
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }

    private static void kanalDegistir() {
        if(tv!=null){
            System.out.println("Hangi kanalı görmek istiyorsunuz ?");
            int acılmasiIstenenKanal=scanner.nextInt();
            scanner.nextLine();
            tv.kanalDegistir(acılmasiIstenenKanal);
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");

        }
    }

    private static void kanalBilgisiGoster() {
       if(tv!=null){
            tv.aktifKanalıGoster();
        }
        else{
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");

        }
    }
    
}
