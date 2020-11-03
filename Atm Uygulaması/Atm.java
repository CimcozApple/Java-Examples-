
import com.sun.media.sound.SoftAbstractResampler;
import java.util.Scanner;


public class Atm {
    public void calis(Hesap hesap){
        Login login=new Login();
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ...");
        System.out.println("Kullanıcı girişi ");
        System.out.println("*********************************************");
        
        int giris_hakki=3;
        
        while (true) {
            
            if(login.login(hesap)){//login objemin içindeki login metoduna gönder
                System.out.println("Giriş Başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki=giris_hakki-1;
                System.out.println("Yanlış giriş Yaptınız kalan giriş hakkınız:  "+giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız bitti");
                
                return;
            }
        }
        System.out.println("*******************************");
        String islemler="1.Bakiye görüntüle\n"
                        +"2.Para Yatırma\n"
                        +"3.Para Çekme\n"
                        +"Çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("*********************************");
        
        while (true) {
            System.out.println("İşlem seçin: ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println(hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istenilen tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz İşlem");
            }
            
        }
        
    }
    

    
    
}
