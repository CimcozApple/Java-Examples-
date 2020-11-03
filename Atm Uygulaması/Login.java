
import java.util.Scanner;


public class Login {
    public boolean login(Hesap accaunt){
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullanici_adi=scanner.nextLine();
        System.out.print("Parolanizı giriniz: ");
        parola=scanner.nextLine();
        
        if(accaunt.getKullanici_adi().equals(kullanici_adi)&& accaunt.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
        
        
        
        
        
        
        
    }
    
}
