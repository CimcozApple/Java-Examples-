
import java.util.Scanner;

/* CemberDaire isimli sınıf oluşturun. Bu sınıfın yarıçap alan kurucusu
olmalı.Ayrıca cevre ve alanını hesaplayan metotlar olmalı. 
*/ 
public class BirinciSoru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        int yaricap=scanner.nextInt();  
        CemberDaire cember=new CemberDaire(yaricap);
        System.out.println("Yarıçapı "+yaricap+" olan çemberin çevresi: "+ cember.cevreBul());
        System.out.println("Yarıçapı "+yaricap+" olan dairenin alanı: "+ cember.alanBul());
    }
}
class CemberDaire{
    private int yaricap;
    private double pi=3.14;

    public CemberDaire(int yaricap) {
        this.yaricap = yaricap;
    }
    public double cevreBul(){ // 2*pi*r
        return 2*pi*yaricap;
    }
    public double alanBul(){
        return pi*Math.pow(yaricap, 2);// pi*r*r
    }

}
