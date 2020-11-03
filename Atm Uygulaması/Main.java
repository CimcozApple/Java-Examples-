
public class Main {
    public static void main(String[] args) {
        // login classı Kullanıcı Girişini kontrol edecek
        //Hesap Classı hesap işlerini yapacak
        //Atm ise atm mizi çalıştıracak
        
        Atm atm=new Atm();
        
        Hesap hesap=new Hesap("Berkay Faruk", "123456", 1500);
        
        
        atm.calis(hesap);
        System.out.println("Prgramdan çıkılıyor...");
    }
    
}
