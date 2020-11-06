
import java.util.Scanner;

/* Soru3: Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için
metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
Bölme işleminde 0 değeri için gerekli kontrolü yazın.
*/ 
public class UcuncuSoru 
{

    private static int[] parametreler;
    public static void main(String[] args) 
    {
        
        System.out.println("****Hesap Makinası****");
        System.out.println("Topla : " + HesapMakinası.topla(5,10));
        System.out.println("Fark : " + HesapMakinası.cıkar(15,4,3));
        System.out.println("Çarp : " + HesapMakinası.carp(10,12,5));
        if(HesapMakinası.bol(0,5,2) != -1)
        {
            System.out.println("Böl : " + HesapMakinası.bol(0,5,2));
        }
        else
        {
            System.out.println("Bölme işlemi başarısız");
        }


    } 
}
class HesapMakinası
{
    public static int topla(int... parametreler)
    {
        int toplam=0;
        for (int i : parametreler)
        {
            toplam=toplam+i;
        }
        return toplam;
    }
    public static int cıkar(int ... parametreler)
    {
        int fark=parametreler[0];
        for(int i=1;i<parametreler.length;i++)
        {
            fark=fark-parametreler[i];
        }
        return fark;
    }
    
    public static int carp(int ... parametreler)
    {
        int carpım=1;
        for(int i:parametreler)
        {
            carpım=carpım*i;
        }
        return carpım;
    }
    public static int bol(int ... parametreler)
    {
        int bolum=parametreler[0];
        for(int i=1;i<parametreler.length;i++)
        {
            if(parametreler[i]!=0)
            {
                bolum=bolum/parametreler[i];
            }
            else
            {
                System.out.println("Paremetrelerden biri 0 bölme yapılamadı");
            }   return -1;
            
        }
        return bolum;
        
    }

}



